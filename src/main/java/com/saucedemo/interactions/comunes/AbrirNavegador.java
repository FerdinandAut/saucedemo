package com.saucedemo.interactions.comunes;

import com.saucedemo.userinterfaces.login.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirNavegador implements Interaction {

    private LoginPage loginPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(loginPage));
    }

    public static AbrirNavegador enPagina(){
        return instrumented(AbrirNavegador.class);
    }

}
