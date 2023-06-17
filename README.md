# SprintM4
El "Main" comienza con un switch , las opciones ejecutan las funciones listadas en la guia ,las cuales dan inicio a las opciones que se imprimen en pantalla : 
- agregarCliente(Pan); >> OPCION 1 del switch
-	agregarProfesional(Pan); >> OPCION 2 del switch
- agregarAdministrativo(Pan); >> OPCION 3 del switch
- agregarCapacitacion(Pan); >> OPCION 4 del switch

Estas funciones capturan los datos que el objeto necesite para su llenado.
Cada una de las funciones anteriores traen sus respectivos atributos, constructores , metodos accesores , mutadores, toString , y AnalizasUsuario aprendido
por herencia para los primeros tres casos , ya que este se obtiene de la clase padre "Usuario" que a su vez implementa una interfaz llamada "asesoria",
y sus respectivos metodos segun indica la guía.

|-------------------------------------------------------------------0-------------------------------------------------------------------------------|

Las siguiente 4 funciones :
- eliminarUsuario(Pan):
Ejecutada en la opcion 5 del switch , procede a iniciar la funcion del mismo nombre la cual consulta el Rut al cual se apuntara para eliminar el 
usuario ingresado previamente , dandoselo al constructor del objeto "contenedores" pasandole a consumir el dato del run con el cual el metodo
"eliminar" consumirá para hacer el objeto "asesoria" un objeto iterador dandole la capacidad de ser recorrido, para asi encontrar el dato en la lista asesoria 
comparando la coincidencia con los datos del objeto usuario (run). De ser correcta la comparacion procederá a removerlo de la lista y terminar el bucle forzadamente.

- listarUsuarios():
Es ejecutada en la opcion 6 del switch , procede a iniciar la funcion del mismo nombre la cual a traves de una lista de asesoria  se asigna
a traves de la instanciacion de constructores,  ejecuta el metodo get.Asesoria trae los datos de la lista asesoria , una vez con ello se ejecuta un 
ciclo for -each ,si los datos traidos por get.Asesoria coinciden con los datos del objeto usuario , estos datos pasarian a cargarse a la lista local.
Con ello dandonos acceso al metodo "analizarUsuario" de objeto usuario , pudiendo imprimir informacion importante que caracteriza cada usuario.

- listarUsuariosPorTipo(Pan):		
Es ejecutada en la opcion 7 del switch , procede a iniciar la funcion del mismo nombre ,aqui se solicita que ingrese el numero de la opcion del tipo de usuario
que desea buscar (el tipo 1(cliente), 2(profesional), 3(administrativo)) ,dependiendo del numero ingresado una variable de tipo texto asigna 
el nombre del tipo antes mencionado , y este dato es el que se envia al metodo listarUsuariosTipo en el objeto contenedor, siguiendo los mismos pasos del
metodo listarUsuario , una vez que llegue a la comparacion entre los datos del objeto usuario con los contenido de la lista asesoria , se hace uso de if
encadenados para detectar el nombre del objeto donde se encontro la coincidencia con el que consumio el metodo (variable String antes mencionada),
para ejectuar el analizarUsuario del objeto correspondiendte al if que coincide.


- listarCapacitaciones():
Es ejecutada en la opcion 8 del switch , procede a iniciar la funcion del mismo nombre la cual es traida directamente de contenedores.

En contenedores este metodo su proposito es mostrar una lista de capacitaciones y los datos de los clientes
El metodo recorre utilizando un bucle for -each para poder imprimir los siguientes datos :
        System.out.println("Datos de la capacitación:");
        System.out.println("Identificador: " + capacitacion.getIdentificador());
        System.out.println("Dia: " + capacitacion.getDia());
        System.out.println("Duración: " + capacitacion.getDuracion());
        
luego se obtiene el identificador del cliente asociado a la capacitación utilizando el método "getRut" del objeto "capacitacion",
se busca al cliente correspondiente llamando al metodo "buscarClientePorRun" y se asigna el resultado a la variable "clienteAsociado"
Si se encuentra un cliente asociado,  se muestra en la consola la informacion del cliente utilizando el metodo "analizarUsuario" 

|-------------------------------------------------------------------0-------------------------------------------------------------------------------|

Adicionalmente existen 2 funciones:

-esDiaValido(String dia):
Recibe el texto digitado en la funcion "agregarCapacitaciones" que es un atributo de capacitacion.
Lo trasforma a minusculas para compararlo con los 7 dias de la semana.
Si se encuentra una coincidencia regresa una respuesta booleana(true) donde permite finalizar al bucle que solicita este dato en la funcion anterior.

-esHoraValida(String hora):
Recibe el texto digitado en la funcion "agregarCapacitaciones" que es un atributo de capacitacion.
Verifica si el dato tiene longitud = 5 , de ser correcto procede a comparar caracter por caracter , para establecer si coincide la estructura
con el formato de la hora.
Si se encuentra una coincidencia regresa una respuesta booleana(true) donde permite finalizar al bucle que solicita este dato en la funcion anterior.


