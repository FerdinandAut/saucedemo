package com.saucedemo.exceptions.tienda;

public class CompraException extends AssertionError{
    public static final String COMPRA_NO_EXITOSA ="Mensaje no esperado al realizar la compra";

    public CompraException(String message, Throwable cause){
        super(message,cause);
    }
}
