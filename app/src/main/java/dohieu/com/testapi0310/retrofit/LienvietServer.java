package dohieu.com.testapi0310.retrofit;

import dohieu.com.testapi0310.model.Request;
import dohieu.com.testapi0310.model.Respond;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LienvietServer {
    @POST("lifecard-app/area/req")
    Call<Respond> RESPOND_CALL (@Body Request request);

}
