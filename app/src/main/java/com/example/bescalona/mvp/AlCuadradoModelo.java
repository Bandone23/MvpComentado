package com.example.bescalona.mvp;

public class AlCuadradoModelo implements AlCuadrado.Modelo {

   private AlCuadrado.Presentador presenter;
    private double resultado;
   public AlCuadradoModelo(AlCuadrado.Presentador presenter){
       this.presenter=presenter;
   }

    @Override
    public void alCuadrado(String data) {
       resultado= Double.valueOf(data)*Double.valueOf(data);
       presenter.showResultP(String.valueOf(resultado));


    }
}
