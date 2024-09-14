package com.saucedemo.interactions.tienda;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.saucedemo.userinterfaces.tienda.TiendaPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SeleccionarArticulos implements Interaction {

    private String articulos;

    public SeleccionarArticulos(String articulos) {
        this.articulos = articulos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String[] listaArticulos = articulos.split(";");
        for (String articulo : listaArticulos) {
            actor.attemptsTo(
                    WaitUntil.the(BTN_ARTICULO_A_COMPRAR.of(articulo), isClickable()),
                    Click.on(BTN_ARTICULO_A_COMPRAR.of(articulo))
            );
        }
        actor.attemptsTo(
                WaitUntil.the(BTN_CARRITO, isClickable()),
                Click.on(BTN_CARRITO),
                WaitUntil.the(BTN_COMPRAR, isClickable()),
                Click.on(BTN_COMPRAR)
        );
    }

    public static SeleccionarArticulos paraComprar(String articulos) {
        return instrumented(SeleccionarArticulos.class, articulos);
    }
}
