package com.example.movilesgit.U2.PruebaLiveData.API;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MatesAPI {

    private static MatesAPI instancia = null;

    MatesService service;
    private MatesAPI(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.20.209:8000")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(MatesService.class);
    };

    public static MatesAPI getInstance(){
        if(instancia == null){
            instancia = new MatesAPI();
        }
        return instancia;
    }

    public Call<Resultado> suma(int n1, int n2){
        return service.suma(n1,n2);
    }
}
