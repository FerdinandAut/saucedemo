1. Descargar herramientas de desarrollo en la máquina.
    Java JDK, Gradle, Git
   Configurar las variables de entorno con las direcciones en donde se instalaron las herramientas
    JAVA_HOME,GRADLE_HOME,MVN
   Agregar las variables al path y apuntar al bin
    %JAVA_HOME%\bin, %GRADLE_HOME%\bin,
2. Se utilizo el IDE IntelliJ, se puede descargar la versión comunity, aplicando el patron de diseño screenplay,
    con serenity bdd, lenguaje gherkin, y cucumber.
3. Una vez que se tengan las herramientas instaladas, configuradas abrir el proyecto como proyecto gradle
   actualizar las dependencias de gradle.
4. Cuando ya se construya el proyecto y actualizado el chromedriver se puede ejecutar desde el Runner ComprasRunner.
  * El feature del que se ejecutara las pruebas es compras.featue.
    Se puede configurar los artículos para la compra en el campo "artículos" separados por ";" siendo esta la lista de artículos
    que se seleccionaran.
  * "Se puede configurar el ide para que ejecute las pruebas con intellij en lugar de gradle"
    //Settings -> - build ejecution - deployment -> Gradle -> Build and run using, Run tests using : IntelliJ IDEA
  * Se puede utilizar el siguiente comando gradle, el mismo se puede ejecutar en la terminal de IntelliJ del proyecto.
    gradle clean test --tests *ComprasRunner aggregate
5. Una vez que termine la ejecucion de este comando se puede revisar el informe de ejecucion en la carpeta
    target - site - serenity
    una vez abierta la carpeta se muestran un listado de archivos,
    localizar el archivo index.html y abrirlo en el navegador.
    En ocasiones demora un poco su ejecución y es aconsejable dar click derecho sobre la carpeta target y seleccionar
    reload from disk
6. En el reporte se pueden observar el resultado de las pruebas, en los informes se tendrán los datos que se
   utilizaron para la prueba, así como también las evidencias (capturas de pantalla que se obtuvieron de la prueba)


