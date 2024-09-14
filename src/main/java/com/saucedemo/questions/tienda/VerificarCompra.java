package com.saucedemo.questions.tienda;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.saucedemo.userinterfaces.tienda.TiendaPage.MSG_RESULTADO_TRANSACCION;

public class VerificarCompra implements Question<Boolean> {

    private String mensajeEsperado;

    VerificarCompra(String mensajeEsperado){
        this.mensajeEsperado= mensajeEsperado;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return MSG_RESULTADO_TRANSACCION.resolveFor(actor).getText().equals(mensajeEsperado);
    }

    public static VerificarCompra deArticulos(String mensajeEsperado){
        return new VerificarCompra(mensajeEsperado);
    }
}
