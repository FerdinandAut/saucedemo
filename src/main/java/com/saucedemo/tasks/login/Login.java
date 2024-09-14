package com.saucedemo.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.saucedemo.userinterfaces.login.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Login implements Task {

    private String usuario;
    private String password;

    public Login(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_USUARIO,isEnabled()),
                Enter.theValue(usuario).into(TXT_USUARIO),
                Enter.theValue(password).into(TXT_PASSWORD),
                WaitUntil.the(BTN_LOGIN,isClickable()),
                Click.on(BTN_LOGIN)
        );
    }
    public static Login conCredenciales(String usuario, String password){
        return instrumented(Login.class,usuario,password);
    }
}
