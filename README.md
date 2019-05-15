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
 
 ![image](https://user-images.githubusercontent.com/49071271/57816802-53dc3c80-7742-11e9-9814-ed55deef347e.png)

**2. Sincronizar el repositorio creado proyectos en NetBeans. Realizar varios commit y push por cada requerimiento discutido en el aula de clases (incluir un mensaje que identifique claramente los commits realizados a GitHub).**

-Se realizaron 11 commits en el proyecto
![image](https://user-images.githubusercontent.com/49071271/57816816-60f92b80-7742-11e9-9e70-2e5069404618.png)

-Aquí se puede revisar los commits realizados y que hizo cada uno en específico.
 ![image](https://user-images.githubusercontent.com/49071271/57816821-65254900-7742-11e9-9aff-9b39f0bdd7ba.png)
![image](https://user-images.githubusercontent.com/49071271/57816826-68b8d000-7742-11e9-8338-501c7e47c759.png)

 
**3. Construir la aplicación en Java.**

-Se procedió a crear los paquetes que contengan las clases, los principales son el paquete de controlador, vista, modelo, imágenes e idiomas.

![image](https://user-images.githubusercontent.com/49071271/57816833-6f474780-7742-11e9-85df-d317a713eb54.png)

Los demás paquetes son derivados de la clase vista.

**4. Clases Creadas.**

-Se procedió a crear 4 Clases para el proyecto, las cuales son Cliente, Producto, FacturaCabecera y Factura Detalle

![image](https://user-images.githubusercontent.com/49071271/57816838-73736500-7742-11e9-9b23-512d4d4710d3.png)

 
Cada clase tiene sus atributos, getters y setters, constructores y toString

Como ejemplo mostraremos la clase Cliente
 ![image](https://user-images.githubusercontent.com/49071271/57816896-a9b0e480-7742-11e9-8aea-72c4983f0eb0.png)
![image](https://user-images.githubusercontent.com/49071271/57816900-ae759880-7742-11e9-8756-9ed70caeb470.png)
![image](https://user-images.githubusercontent.com/49071271/57816904-b0d7f280-7742-11e9-8c8b-b3a1964c0f11.png)
![image](https://user-images.githubusercontent.com/49071271/57816911-b46b7980-7742-11e9-8bbc-89e7cbff05e0.png)
![image](https://user-images.githubusercontent.com/49071271/57816915-b7ff0080-7742-11e9-9b3e-f3fcd95e1432.png)


**5. Controladores**

Se implementó un controlador para cada clase creada, con el crud completo y el método listar, todo el controlador esta implementado con el Set, y solo el controlador cliente cuenta con un método más de buscar por Cedula
![image](https://user-images.githubusercontent.com/49071271/57816283-576ec400-7740-11e9-8670-ac484256ea47.png)
 
Se mostrará a continuación un ejemplo de un Crud en este caso del Cliente Mismo.
 
![image](https://user-images.githubusercontent.com/49071271/57816232-2b534300-7740-11e9-85a5-647ac9f4ac1d.png)
![image](https://user-images.githubusercontent.com/49071271/57816244-38703200-7740-11e9-9853-2be5b7117c5d.png)
![image](https://user-images.githubusercontent.com/49071271/57816252-3e661300-7740-11e9-971f-62ec6b7ff42a.png)
![image](https://user-images.githubusercontent.com/49071271/57816261-445bf400-7740-11e9-9bd5-f6168fd6ae19.png)
   

**6. Interfaz Grafica.**

-En esta parte del programa se creo una interfaz Grafica para el uso de los controladores y clases, el programa en si se basa de un sistema de facturación en donde se realiza el crud de Cliente, Producto y Factura, también cuenta con Internacionalizacion
-La Ventana Principal Del programa.

 ![image](https://user-images.githubusercontent.com/49071271/57816162-edeeb580-773f-11e9-83fc-208e6d61be40.png)

Cada sección cuenta con su Crud a continuación un ejemplo de como se ve cada sección.

 ![image](https://user-images.githubusercontent.com/49071271/57816201-0b238400-7740-11e9-81f9-b0f614555420.png)


Cada uno posee las mismas opciones excepto los idiomas.


 ![image](https://user-images.githubusercontent.com/49071271/57816207-0e1e7480-7740-11e9-91f2-beb3b1c40920.png)


**7. Interfaz De Factura.**

-La interfaz que posee el cliente y el producto en sí son muy similares, la que es un poco diferente es la interfaz que posee la Factura, a continuación, se explicara un poco de su funcionamiento.
Para Agregar una Factura se visualiza así:

 ![image](https://user-images.githubusercontent.com/49071271/57816311-75d4bf80-7740-11e9-9a7e-dc2aee237e98.png)
 
El constructor que inicializa los objetos es el siguiente.

 ![image](https://user-images.githubusercontent.com/49071271/57816329-89802600-7740-11e9-95ad-147ab27d6451.png)
 
Para Buscar un Cliente manda a llamar al método de Buscar por Código implementado en el controlador Cliente.

 ![image](https://user-images.githubusercontent.com/49071271/57816336-8edd7080-7740-11e9-9118-8f2ddb0ec69d.png)
 
Para Añadir un Detalle Factura manda a llamar a otra Ventana

 ![image](https://user-images.githubusercontent.com/49071271/57816342-93a22480-7740-11e9-953c-14d551ee05c2.png)
 
 **Nota:** *El if que se mostró controla para que solo se pueda abrir una sola ventana, esta implementado en todas las ventanas del programa para no tener errores al querer abrir dos ventanas iguales.*

La ventana que se manda a llamar es la siguiente.

 [image](https://user-images.githubusercontent.com/49071271/57816346-969d1500-7740-11e9-9676-8fe91c4d4cb7.png)
 
En el comboBox se inicializan los productos que existen guardados en el programa, cuando se realiza el Calcular Sub Total la ventana habilitara la opción de añadir producto

 ![image](https://user-images.githubusercontent.com/49071271/57816353-9d2b8c80-7740-11e9-96da-d30fab5dddae.png)
 
Este Ventana tiene dos métodos para poder buscar los Productos y para seleccionarlos a través del comboBox

 ![image](https://user-images.githubusercontent.com/49071271/57816356-a0267d00-7740-11e9-9af5-7c781ea839d5.png)
 
En el botón de Añadir Producto tiene el siguiente código.

 ![image](https://user-images.githubusercontent.com/49071271/57816421-dc59dd80-7740-11e9-8be2-56a9eda6020c.png)
 
En el botón de Calcular, lo que hace es calcular el subtotal multiplicando la cantidad por el precio.

 ![image](https://user-images.githubusercontent.com/49071271/57816440-eda2ea00-7740-11e9-9400-7bdf25583676.png)
 
Así finalmente se realiza un detalle de factura, cabe recalcar que al ser creado este se agrega automáticamente al Table del Agregar Factura.
Regresando a la Factura también tiene 3 métodos para realizar cálculos y sacar el subtotal, coge el valor del subtotal de la tabla para realizar las operaciones.
 ![image](https://user-images.githubusercontent.com/49071271/57816447-f09dda80-7740-11e9-962c-2df3e211d7bb.png)
Finalmente, para llamar a esto métodos existe un botón de Calcular.
![image](https://user-images.githubusercontent.com/49071271/57816449-f5628e80-7740-11e9-85fb-1f93caf44c93.png)
También existe un botón para eliminar un detalle, lo que hace es eliminar a través del controlador del detalle, cuando se selecciona una de las filas de la tabla que se quiere eliminar, removiendo también la fila de la tabla.

 ![image](https://user-images.githubusercontent.com/49071271/57816479-15924d80-7741-11e9-8e7e-a5d852ef7015.png)
Y el botón para agregar una Factura también se habilita luego de que se realiza el cálculo respectivo.

 ![image](https://user-images.githubusercontent.com/49071271/57816493-204ce280-7741-11e9-87ef-285dc0138b75.png)
![image](https://user-images.githubusercontent.com/49071271/57816496-2347d300-7741-11e9-9253-0b256f90bc09.png)
 
Asi se ingresa una Factura en el programa.
Para poder Buscar una Factura el programa pide a través de una Interfaz Buscar por Codigo, y cuando la encuentra la manda a visualizar en otra Ventana.

 ![image](https://user-images.githubusercontent.com/49071271/57816515-3490df80-7741-11e9-8e4a-d269cc730a06.png)
 
En esta ventana se visualiza la Factura Encontrada

 ![image](https://user-images.githubusercontent.com/49071271/57816533-43779200-7741-11e9-8c14-0c5f3198580b.png)
 
Y para eliminar también posee una ventana similar a la de buscar en donde elimina la factura a través del controlador.

**8. Internacionalización **

-Sirve para poder cambiar de idioma el programa, en mi caso para poder cambiar el idioma del programa he implementado un método en cada ventana que cambia el idioma dependiendo cual se quiera.

En este caso existen dos idiomas el inglés y español.

 ![image](https://user-images.githubusercontent.com/49071271/57816547-4e322700-7741-11e9-9e7c-a5802d26e612.png)

A continuación, se podrán visualizar las opciones que se utilizaron para poder cambiar el idioma del programa.

 ![image](https://user-images.githubusercontent.com/49071271/57816580-76218a80-7741-11e9-9a29-4b3d31dbaad0.png)
 
Para poder cambiar el idioma se procedió a realizarlo a través de dos menú ítem en el menú principal, el código es el siguiente.

 ![image](https://user-images.githubusercontent.com/49071271/57816596-833e7980-7741-11e9-8db6-1aeca304afb4.png)


Lo que hace es llamar el método de cambiar Idioma, este método se generó en cada Ventana y cada vez que una ventana estaba visible mandaba a llamar el método de cambio de Idioma.

 ![image](https://user-images.githubusercontent.com/49071271/57816596-833e7980-7741-11e9-8db6-1aeca304afb4.png)
 
Se mostró un ejemplo de cómo cambia el idioma el programa a través del método cambiar Idioma.

**9. Desarrollar el diagrama de clases correspondiente usando la herramienta LucidChart.**

Aquí se muestra el diagrama de clases del proyecto realizado.
 
![image](https://user-images.githubusercontent.com/49071271/57816617-9a7d6700-7741-11e9-9baf-c3f48881410b.png)

## RESULTADO(S) OBTENIDO(S):
Se mostrará Pantallazos del Programa.

 ![image](https://user-images.githubusercontent.com/49071271/57816709-f47e2c80-7741-11e9-9a7f-908e5ed84ca6.png)
![image](https://user-images.githubusercontent.com/49071271/57816716-f9db7700-7741-11e9-93a2-0d0d1b102391.png)
 
Se cambió el idioma del programa

 ![image](https://user-images.githubusercontent.com/49071271/57816728-04960c00-7742-11e9-8c59-6851b5dac451.png)
![image](https://user-images.githubusercontent.com/49071271/57816734-0790fc80-7742-11e9-995a-4818849078ab.png)

 	
Factura español e inglés.

 ![image](https://user-images.githubusercontent.com/49071271/57816751-15468200-7742-11e9-917c-02139a003fc0.png)
![image](https://user-images.githubusercontent.com/49071271/57816755-1a0b3600-7742-11e9-8015-edf8f9a7b123.png)
 
Ventana para agregar Producto

 ![image](https://user-images.githubusercontent.com/49071271/57816767-25f6f800-7742-11e9-9e05-2bea317cbf26.png)
 
Factura con productos agregados

 ![image](https://user-images.githubusercontent.com/49071271/57816770-2abbac00-7742-11e9-957e-df110df90a95.png)

## CONCLUSIONES:
La internacionalización nos puede ser de mucha utilidad ya que gracias a esta herramienta aprendida podemos hacer bilingües nuestros programas a través de programación, dependiendo el idioma que deseemos implementar.
También la factura nos enseñó a utilizar los Tablet, para listar productos, clientes y el detalle de la factura.
## RECOMENDACIONES:

Recomendación siempre Documentar el código para saber qué hace cada método.

**Nombre de estudiante:** José Quinde

**Firma de estudiante: **

![image](https://user-images.githubusercontent.com/49071271/57816782-30b18d00-7742-11e9-85df-16be4bf50b69.png)


