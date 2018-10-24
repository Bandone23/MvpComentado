package com.example.bescalona.mvp;

public interface AlCuadrado {



    interface View{
        void showResult(String result);

    }


    interface Presentador{
        void showResultP(String result);
        void alCuadrado(String data);
    }


    interface Modelo{
        void alCuadrado(String data);

    }
}
