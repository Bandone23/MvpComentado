package com.example.bescalona.mvp;

public class AlCuadradoPresentador implements AlCuadrado.Presentador {

  private   AlCuadrado.View view;
  private AlCuadrado.Modelo model;

  public AlCuadradoPresentador(AlCuadrado.View view){
      this.view=view;
      model= new AlCuadradoModelo(this);
  }
    @Override
    public void showResultP(String result) {
        if(view!=null){
            view.showResult(result);
        }
    }

    @Override
    public void alCuadrado(String data) {
        if(view!=null){
           model.alCuadrado(data);
        }
    }
}
