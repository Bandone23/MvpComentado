package com.example.bescalona.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity implements AlCuadrado.View {

    /**  se declaran las variables que se utulizaran dentro de la view*/

    private TextView tvAlCuadrado;
    private TextView edAlCuadrado;

    /**  se declara una variable solo para usar el metodo de la interfaz que
     * queremos usar , en este caso es el presentador que nos */
    private AlCuadrado.Presentador presenter;

    /** ========= aqui se inicia el activity =======================*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        /** se obtiene el dato que se ingrese en pantalla y se envie a las varibles declaradas mas arriba */
        tvAlCuadrado=(TextView)findViewById(R.id.tvAlcuadrado);
        edAlCuadrado=(TextView)findViewById(R.id.edAlcuadrado);

        presenter= new AlCuadradoPresentador(this);
    }

    /** creacion de un metodo o funcion llamada calcular que indica el nombre del onclick que tiene el boton en la view */
    public void  calcular (View view){

        /** ==== la enviamos el dato capturado de view al presenter metodo */

        presenter.alCuadrado(edAlCuadrado.getText().toString());
    }

    @Override
    public void showResult(String result) {

        tvAlCuadrado.setText(result);
    }
}
