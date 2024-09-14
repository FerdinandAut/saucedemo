package com.saucedemo.stepdefinitions.tienda;

import com.saucedemo.exceptions.tienda.CompraException;
import com.saucedemo.questions.tienda.VerificarCompra;
import com.saucedemo.tasks.tienda.Comprar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static com.saucedemo.exceptions.tienda.CompraException.COMPRA_NO_EXITOSA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ComprasStepDefinition {

    @Cuando("^compra los (.*) y llena la información : (.*) (.*) (.*)$")
    public void comprarArticulos(String articulos, String nombre, String apellido, String codigoPostal){
        theActorInTheSpotlight().attemptsTo(Comprar.articulos(articulos,nombre,apellido,codigoPostal));
    }

    @Entonces("^revisa el (.*) de la compra$")
    public void verificarCompra(String mensajeEsperado){
        theActorInTheSpotlight().should(seeThat(VerificarCompra.deArticulos(mensajeEsperado)).orComplainWith(CompraException.class,COMPRA_NO_EXITOSA));
    }

}
