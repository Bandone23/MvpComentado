package com.example.bescalona.mvp;

/**  aqui se especifica lo que debemos hacer pero no su implementacion
 * seran las clases las que tendran que implementar la interfaz, son las que
 * describen el comportamiento logico de los metodos*/

public interface AlCuadrado {

    /** interface de vista esta se encarga solo de mostrar un texto en pantalla
     * cuando se solicite  */
    interface View{
        void showResult(String result);

    }

    /** interface de vista esta se encarga solo de mostrar un texto en pantalla
     * cuando se solicite  */


    interface Presentador{
        void showResultP(String result);
        void alCuadrado(String data);
    }


    interface Modelo{
        void alCuadrado(String data);

    }
}






