package com.saucedemo.stepdefinitions.comunes;

import com.saucedemo.interactions.comunes.AbrirNavegador;
import com.saucedemo.tasks.login.Login;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ComunesStepDefinition {

    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el (.*) visita la pagina saucedemo e inicia sesión con los datos (.*) (.*)$")
    public void visitarPaginaInicioSesion(String actor,String usuario, String password) {
        theActorCalled(actor).wasAbleTo(AbrirNavegador.enPagina());
        theActorInTheSpotlight().attemptsTo(Login.conCredenciales(usuario,password));
    }
}
