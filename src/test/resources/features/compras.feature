#language:es
Característica: Compra de articulos

  @Test
  Esquema del escenario: Comprar articulos con inicio de sesión
    Dado que el cliente visita la pagina saucedemo e inicia sesión con los datos <usuario> <password>
    Cuando compra los <articulos> y llena la información : <nombre> <apellido> <codigoPostal>
    Entonces revisa el <mensajeEsperado> de la compra
    Ejemplos:
      | usuario       | password     | articulos       | nombre  | apellido | codigoPostal | mensajeEsperado           |  |
      | standard_user | secret_sauce | Backpack;Jacket | Esteban | Mena     | 170708       | Thank you for your order! |  |