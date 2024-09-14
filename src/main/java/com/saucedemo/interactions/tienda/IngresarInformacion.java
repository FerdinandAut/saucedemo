package com.saucedemo.interactions.tienda;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.saucedemo.userinterfaces.tienda.TiendaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class IngresarInformacion implements Interaction {

    private String nombre;
    private String apellido;
    private String codigoPostal;

    public IngresarInformacion(String nombre, String apellido, String codigoPostal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoPostal = codigoPostal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_NOMBRE,isEnabled()),
                Enter.theValue(nombre).into(TXT_NOMBRE),
                Enter.theValue(apellido).into(TXT_APELLIDO),
                Enter.theValue(codigoPostal).into(TXT_CODIGO_POSTAL),
                WaitUntil.the(BTN_CONTINUAR,isClickable()),
                Click.on(BTN_CONTINUAR)
        );
    }

    public static IngresarInformacion deCompra(String nombre, String apellido, String codigoPostal){
        return instrumented(IngresarInformacion.class,nombre,apellido,codigoPostal);
    }
}
