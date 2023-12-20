val registroUsuarios = mutableListOf<Usuario>()
class Usuario (val nombre: String, val edad: Int){
    fun registrarUsuario(usuario: Usuario) {
        registroUsuarios.add(usuario)
        println("Se agregó con éxito al usuario ${usuario.nombre}")
    }
}

fun nuevoUsuario(): Usuario{
    println("Ingrese el nombre del usuario")
    val nombre = readln().toString().toUpperCase()
    println("Ingrese la edad del usuario")
    val edad = readln().toInt()
    var usuario: Usuario = Usuario(nombre,edad)
    return usuario
}

fun menu(){
    println("Selecciona una opción:")
    println("1. Registrar Usuario")
    println("2. Agregar Libro")
    println("3. Prestar Libro")
    println("4. Ver Libros Disponibles")
    println("5. Ver Usuarios")
    println("6. Ver Préstamos")
    println("7. Salir")
}

