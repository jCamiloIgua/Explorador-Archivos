
##Explorador Archivos con Java

Al iniciar el programa hay una ventana en donde con un desplegable se puede seleccionar el tipo de usuario (administrador, Invitado, estudiante)
Se puede ingresar con un usuario o crear uno nuevo, también en el apartado Root ingresa el que tenga acceso de super usuario, el cual ya tiene una clave preestablecida en el formulario Login, al ingresar tiene todas las opciones habilitadas, como los algoritmos, el CMD, las aplicaciones.

Este programa no guarda los usuarios en una base de datos o un archivo, solo el usuario Root está estipulado, cada vez que se crea y se consulta un usuario se hace con una lista de java.
Para crear el usuario se coloca su rol y dependiendo de eso tendrá deshabilitada opciones dentro del explorador, si quiere crear un usuario de rol administrador con todo habilitado debe tener una clave Root que la da el super usuario.
El rol invitado tiene deshabilitado las opciones de crear, abrir, modificar y eliminar un archivo .txt con el clic derecho y además tiene deshabilitado comunicación, comandos (CMD) y algoritmo
El rol estudiante tiene habilitado el clic derecho, pero deshabilitando comunicación, comandos (CMD) y algoritmo.
Un usuario creado no se puede crear dos veces y las contraseñas se encriptan con MD5.
