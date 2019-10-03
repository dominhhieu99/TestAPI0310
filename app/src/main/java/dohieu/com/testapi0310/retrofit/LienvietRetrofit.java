package dohieu.com.testapi0310.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LienvietRetrofit {
    public static LienvietServer lienvietServer;

    public static LienvietServer getInstance() {
        if (lienvietServer == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://10.36.126.42:8940/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            lienvietServer = retrofit.create(LienvietServer.class);
        }
        return lienvietServer;
    }
}
