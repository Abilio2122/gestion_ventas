
Instrucciones de instalación/ejecución del algoritmo:

Instalación: se debe abrir la carpeta gestion_ventas en una IDE de java al gusto

Pasos para ejecutar: La clase main es gestion_ventas.java la cual ejecutara y se utilizaran las clases restantes al ejecutar aparecen dos opciones, registrarse y salir. Al registrarte se pedirá nombre, edad, rut y contraseña. Luego aparecerá un menú con las siguientes opciones donde cada número entre paréntesis son los comandos que se requieren para iniciar con su tarea. 

Ver perfil(1) 
Ver eventos disponibles(2) 
Ver recomendaciones(3) 
Ver regiones(4) 
(Admin)-Agregar Evento(5) 
Cerrar Sesion (6)

Para que la función de Ver eventos disponibles(2) cargue los eventos.csv se debe;

- Ingresar el nombre de usuario de su equipo y su direccion donde tiene guardado el repositorio en su equipo para guiarse en el csv. Asegurese de reemplazarlo en importar csv

 - Ejemplo: gestionEventos.importarEventosDesdeCSV("D:\\karth\\Documentos\\NetBeansProjects\\gestion_ventas\\Eventos.csv");//aqui hay que poner la ruta en la que tengan el archivo csv del main

Hay opciones Admin que son agregar evento y listar clientes, la contraseña para ingresar como administrador es: 2122.


Instrucciones para ventanas:

El package Ventanas es donde se guardan todas las ventanas.

La ventana inicial para empezar sería la de MenuInicio, desde ahi se ejecutará correctamente el código.
Se es libre de ejecutar cualquier otra ventana pero no se asegurará la importación de datos correcta.
