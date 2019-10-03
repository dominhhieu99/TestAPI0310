package dohieu.com.testapi0310;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;

import dohieu.com.testapi0310.model.Request;
import dohieu.com.testapi0310.model.RequestAfter;
import dohieu.com.testapi0310.model.Respond;
import dohieu.com.testapi0310.model.RespondAfter;
import dohieu.com.testapi0310.retrofit.LienvietRetrofit;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QuanHuyenActivity extends AppCompatActivity {
    private Adapter adapter;
    private RespondAfter responseAfter;
    private RecyclerView rvContent;
    private SwipeRefreshLayout srlRefresh;
    private String parentCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quan_huyen);
        parentCode = getIntent().getStringExtra("parentCode");

        srlRefresh = findViewById(R.id.srlRefresh);
        rvContent = findViewById(R.id.rvContent);
        responseAfter = new RespondAfter();
        adapter = new Adapter(responseAfter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvContent.setAdapter(adapter);
        rvContent.setLayoutManager(linearLayoutManager);
        getData();
        initAction();

    }

    private void initAction() {
        adapter.setOnClickListener(new Adapter.OnClickListener() {
            @Override
            public void onClick(RespondAfter.ListArea listArea) {
                Intent intent = new Intent(QuanHuyenActivity.this, PhuongXaActivity.class);
                intent.putExtra("parentCode", listArea.getAreaCode());
                startActivity(intent);
            }
        });
        srlRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                getData();
            }
        });
    }

    private void getData() {
        Request.RestHeader restHeader = new Request.RestHeader();
        restHeader.setLanguage("vi");
        restHeader.setClientRequestId("1234567");
        restHeader.setDeviceId("abc-123-def-456");
        restHeader.setClientAddress("127.0.0.1");
        restHeader.setPlatform("local");

        Gson gson = new Gson();
        String json = gson.toJson(new RequestAfter("7", "D", parentCode));
        byte[] data = new byte[0];
        try {
            data = json.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String base64 = Base64.encodeToString(data, Base64.DEFAULT);
        Log.e("code", base64);
        Request requestAfter = new Request();
        requestAfter.setBody(base64.trim());
        requestAfter.setRestHeader(restHeader);
        LienvietRetrofit.getInstance().RESPOND_CALL(requestAfter).enqueue(new Callback<Respond>() {
            @Override
            public void onResponse(Call<Respond> call, Response<Respond> response) {
                if (response.body() != null) {
                    byte[] data = Base64.decode(response.body().getBody(), Base64.DEFAULT);
                    try {
                        String text = new String(data, "UTF-8");
                        RespondAfter responseAfter = new Gson().fromJson(text, RespondAfter.class);
                        adapter.changeData(responseAfter);
                    } catch (UnsupportedEncodingException e) {
                        Log.e("EncodingException", e.toString());
                    }
                } else {
                    Toast.makeText(QuanHuyenActivity.this, "Bị lỗi refresh lại trang", Toast.LENGTH_SHORT).show();
                }
                srlRefresh.setRefreshing(false);
            }

            @Override
            public void onFailure(Call<Respond> call, Throwable t) {
                Toast.makeText(QuanHuyenActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
                srlRefresh.setRefreshing(false);
            }
        });
    }
}