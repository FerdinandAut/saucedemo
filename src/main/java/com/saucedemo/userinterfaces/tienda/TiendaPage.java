package com.saucedemo.userinterfaces.tienda;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TiendaPage {
    public static final Target BTN_ARTICULO_A_COMPRAR = Target.the("Articulo al carrito").locatedBy("//div[contains(text(),'{0}')]/ancestor::div[@class='inventory_item_description']//button");
    public static final Target BTN_CARRITO = Target.the("Carrito de compras").located(By.id("shopping_cart_container"));
    public static final Target BTN_COMPRAR = Target.the("Botón comprar").located(By.id("checkout"));
    public static final Target TXT_NOMBRE = Target.the("Nombre").located(By.id("first-name"));
    public static final Target TXT_APELLIDO = Target.the("Apellido").located(By.id("last-name"));
    public static final Target TXT_CODIGO_POSTAL = Target.the("Codigo postal").located(By.id("postal-code"));
    public static final Target BTN_CONTINUAR = Target.the("Botón continuar").located(By.id("continue"));
    public static final Target BTN_FINALIZAR = Target.the("Botón finalizar").located(By.id("finish"));
    public static final Target MSG_RESULTADO_TRANSACCION = Target.the("Mensaje de transacción").locatedBy("//h2[@class='complete-header']");


}
