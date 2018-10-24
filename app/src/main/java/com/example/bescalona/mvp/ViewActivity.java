package com.example.bescalona.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity implements AlCuadrado.View {

    private TextView tvAlCuadrado;
    private TextView edAlCuadrado;
    private AlCuadrado.Presentador presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        tvAlCuadrado=(TextView)findViewById(R.id.tvAlcuadrado);
        edAlCuadrado=(TextView)findViewById(R.id.edAlcuadrado);
        presenter= new AlCuadradoPresentador(this);
    }

    // metodo que implementa modelo vista presentador
    public void  calcular (View view){
        presenter.alCuadrado(edAlCuadrado.getText().toString());
    }

    @Override
    public void showResult(String result) {
        tvAlCuadrado.setText(result);
    }
}
