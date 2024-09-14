package com.saucedemo.userinterfaces.login;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com")
public class LoginPage extends PageObject {

    public static final Target TXT_USUARIO = Target.the("Usuario").located(By.id("user-name"));
    public static final Target TXT_PASSWORD = Target.the("Password").located(By.id("password"));

    public static final Target BTN_LOGIN = Target.the("Boton login").located(By.id("login-button"));

}
