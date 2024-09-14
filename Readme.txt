1. Se debe descargar la version de chromedriver que funcione para su navegador, en este caso utilice la ultima,
    y actualizar en el archivo serenity.properties la direccion de la misma, en el ejercicio esta en el C:
2. Descargar herramientas de desarrollo en la maquina.
    Java JDK, Gradle, Git
   Configurar las variables de entorno con las direcciones en donde se instalarón las herramientas
    JAVA_HOME,GRADLE_HOME,MVN
   Agregar las variables al path y apuntar al bin
    %JAVA_HOME%\bin, %GRADLE_HOME%\bin,
3. Se utilizo el IDE IntelliJ, se puede descargar la version comunity.
4. Una vez que se tengan las herramientas instaladas, configuradas abrir el proyecto como proyecto gradle
   actualizar las dependencias de gradle.
5. Cuando ya se construya el proyecto y actualizado el chromedriver se puede ejecutar desde el Runner ComprasRunner.
  * El feature del que se ejecutarar las pruebas es compras.featue.
    Se puede configurar los articulos para la compra en el campo "articulos" separados por ";" siendo esta la lista de articulos
    que se seleeccionaran.

  * "Se puede cofigurar el ide para que ejecute las pruebas con intellij en lugar de gradle"
    //Settings -> - build ejecution - deployment -> Gradle -> Build and run using, Run tests using : IntelliJ IDEA
  * Se puede utilizar el siguiente comando gradle, el mismo se puede ejecutar en la terminal de IntelliJ del proyecto.
    gradle clean test --tests *ComprasRunner aggregate
6. Una vez que termine la ejecucion de este comando se puede revisar el informe de ejecucion en la carpeta target - site - serenity
    una vez abierta la carpeta se muestran un listado de archivos,
    localizar el archivo index.html y abrirlo en el navegador.
    En ocaciones demora un poco su ejecucion y es aconsejable dar click derecho sobre la carpeta target y seleccionar
    reload from disk
7. En el reporte se pueden observar el resultado de las pruebas.