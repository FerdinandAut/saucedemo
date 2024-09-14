package com.saucedemo.tasks.tienda;

import com.saucedemo.interactions.tienda.IngresarInformacion;
import com.saucedemo.interactions.tienda.SeleccionarArticulos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.saucedemo.userinterfaces.tienda.TiendaPage.BTN_FINALIZAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Comprar implements Task {

    private String articulos;
    private String nombre;
    private String apellido;
    private String codigoPostal;

    public Comprar(String articulos, String nombre, String apellido, String codigoPostal) {
        this.articulos = articulos;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoPostal = codigoPostal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarArticulos.paraComprar(articulos),
                IngresarInformacion.deCompra(nombre, apellido, codigoPostal),
                WaitUntil.the(BTN_FINALIZAR, isClickable()),
                Scroll.to(BTN_FINALIZAR),
                Click.on(BTN_FINALIZAR)
        );
    }

    public static Comprar articulos(String articulos, String nombre, String apellido, String codigoPostal) {
        return instrumented(Comprar.class, articulos, nombre, apellido, codigoPostal);
    }
}
