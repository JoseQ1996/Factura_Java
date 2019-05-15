# PRÁCTICA DE LABORATORIO 

**NOMBRE:** José Quinde

**CARRERA:** Computación	

**ASIGNATURA:** Programación Aplicada

**NRO. PRÁCTICA:**	05	

**TÍTULO PRÁCTICA:** Internacionalización

## OBJETIVO ALCANZADO:
El objetivo de la presente práctica es saber cómo utilizar a la perfección una interfaz gráfica, también el poder realizar una facturización, a través del modelo, vista y controlador.
También se ha puesto como objetivo el aprender a internacionalizar un programa completo en este caso, el programa presenta dos idiomas el inglés y español

## ACTIVIDADES DESARROLLADAS
**1.	Crear un repositorio en GitHub con el nombre “Factura” o su similar.**

A continuación, se podrá la información de GitHub

**Perfil:** JoseQ1996

**URL del proyecto:** https://github.com/JoseQ1996/Factura_Java.git

-Se procedió a crear un repositorio con los parámetros dados para poder subir la practica 5
 

**2. Sincronizar el repositorio creado proyectos en NetBeans. Realizar varios commit y push por cada requerimiento discutido en el aula de clases (incluir un mensaje que identifique claramente los commits realizados a GitHub).**

-Se realizaron 11 commits en el proyecto


-Aquí se puede revisar los commits realizados y que hizo cada uno en específico.
 
 
**3. Construir la aplicación en Java.**

-Se procedió a crear los paquetes que contengan las clases, los principales son el paquete de controlador, vista, modelo, imágenes e idiomas.
 
Los demás paquetes son derivados de la clase vista.

**4. Clases Creadas.**

-Se procedió a crear 4 Clases para el proyecto, las cuales son Cliente, Producto, FacturaCabecera y Factura Detalle
 
Cada clase tiene sus atributos, getters y setters, constructores y toString

Como ejemplo mostraremos la clase Cliente
 

**5. Controladores**

Se implementó un controlador para cada clase creada, con el crud completo y el método listar, todo el controlador esta implementado con el Set, y solo el controlador cliente cuenta con un método más de buscar por Cedula
 
Se mostrará a continuación un ejemplo de un Crud en este caso del Cliente Mismo.
 
 
 
 
    
   

**6. Interfaz Grafica.**
-En esta parte del programa se creo una interfaz Grafica para el uso de los controladores y clases, el programa en si se basa de un sistema de facturación en donde se realiza el crud de Cliente, Producto y Factura, también cuenta con Internacionalizacion
-La Ventana Principal Del programa.
         

Cada sección cuenta con su Crud a continuación un ejemplo de como se ve cada sección.
 
.
Cada uno posee las mismas opciones excepto los idiomas.
 


**7. Interfaz De Factura.**
-La interfaz que posee el cliente y el producto en sí son muy similares, la que es un poco diferente es la interfaz que posee la Factura, a continuación, se explicara un poco de su funcionamiento.
Para Agregar una Factura se visualiza así:
 
El constructor que inicializa los objetos es el siguiente.
 
Para Buscar un Cliente manda a llamar al método de Buscar por Código implementado en el controlador Cliente.
 
Para Añadir un Detalle Factura manda a llamar a otra Ventana
 
Nota: El if que se mostró controla para que solo se pueda abrir una sola ventana, esta implementado en todas las ventanas del programa para no tener errores al querer abrir dos ventanas iguales.
La ventana que se manda a llamar es la siguiente.
 
En el comboBox se inicializan los productos que existen guardados en el programa, cuando se realiza el Calcular Sub Total la ventana habilitara la opción de añadir producto
 
Este Ventana tiene dos métodos para poder buscar los Productos y para seleccionarlos a través del comboBox
 
En el botón de Añadir Producto tiene el siguiente código.
 
En el botón de Calcular, lo que hace es calcular el subtotal multiplicando la cantidad por el precio.
 
Así finalmente se realiza un detalle de factura, cabe recalcar que al ser creado este se agrega automáticamente al Table del Agregar Factura.
Regresando a la Factura también tiene 3 métodos para realizar cálculos y sacar el subtotal, coge el valor del subtotal de la tabla para realizar las operaciones.
 
Finalmente, para llamar a esto métodos existe un botón de Calcular.
 
También existe un botón para eliminar un detalle, lo que hace es eliminar a través del controlador del detalle, cuando se selecciona una de las filas de la tabla que se quiere eliminar, removiendo también la fila de la tabla.
 
Y el botón para agregar una Factura también se habilita luego de que se realiza el cálculo respectivo.
 
 
Asi se ingresa una Factura en el programa.
Para poder Buscar una Factura el programa pide a través de una Interfaz Buscar por Codigo, y cuando la encuentra la manda a visualizar en otra Ventana.
 
En esta ventana se visualiza la Factura Encontrada
 
Y para eliminar también posee una ventana similar a la de buscar en donde elimina la factura a través del controlador.

**8. Internacionalización **
-Sirve para poder cambiar de idioma el programa, en mi caso para poder cambiar el idioma del programa he implementado un método en cada ventana que cambia el idioma dependiendo cual se quiera.
En este caso existen dos idiomas el inglés y español.
 

A continuación, se podrán visualizar las opciones que se utilizaron para poder cambiar el idioma del programa.
 
Para poder cambiar el idioma se procedió a realizarlo a través de dos menú ítem en el menú principal, el código es el siguiente.
 
Lo que hace es llamar el método de cambiar Idioma, este método se generó en cada Ventana y cada vez que una ventana estaba visible mandaba a llamar el método de cambio de Idioma.
 
Se mostró un ejemplo de cómo cambia el idioma el programa a través del método cambiar Idioma.

**9. Desarrollar el diagrama de clases correspondiente usando la herramienta LucidChart.**

Aquí se muestra el diagrama de clases del proyecto realizado.
 


## RESULTADO(S) OBTENIDO(S):
Se mostrará Pantallazos del Programa.
 
 
Se cambió el idioma del programa
 
 	
Factura español e inglés.
 
 
Ventana para agregar Producto
 
Factura con productos agregados
 

## CONCLUSIONES:
La internacionalización nos puede ser de mucha utilidad ya que gracias a esta herramienta aprendida podemos hacer bilingües nuestros programas a través de programación, dependiendo el idioma que deseemos implementar.
También la factura nos enseñó a utilizar los Tablet, para listar productos, clientes y el detalle de la factura.
## RECOMENDACIONES:

Recomendación siempre Documentar el código para saber qué hace cada método.

**Nombre de estudiante:** José Quinde


Firma de estudiante: 


