package com.example.movilesgit.U2.PruebaLiveData;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AleatorioViewModel extends ViewModel {

    MutableLiveData<Integer> datoObservable;
    ModelAleatorio datos;

    public LiveData<Integer> getDatoAleatorio(){
      if(datoObservable == null){
          datoObservable = new MutableLiveData<Integer>();
          datos = new ModelAleatorio();
      }
      return datoObservable;
    };

    public void nuevoAleatorio(){
        // Actividad Asincrona
        new Thread(()->{
            // Peticion aservidor remoto
            datos.generarAleatorio();
            //avisamos que ha llegado el dato
            datoObservable.postValue(datos.getAleatorio());
        }).start();
    }
}
