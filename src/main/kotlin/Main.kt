fun main() {
    do {
        menu()
        when (readLine()?.toIntOrNull()) {
            1 -> {
                val usuario: Usuario = nuevoUsuario()
                usuario.registrarUsuario(usuario)
            }
            2 -> {
                val libro: Libro = nuevoLibro()
                libro.agregarLibro(libro)
            }
            3 -> {
                val prestamo:Biblioteca = Biblioteca()
                prestamo.prestarLibro()
            }
            4 -> {
                Biblioteca.mostrarLibros()
            }
            5 -> {
                Biblioteca.mostrarUsuarios()
            }
            6 -> {
                Biblioteca.mostrarPrestamos()
            }
            7 -> {
                println("Elegiste salir, hasta la vista!!! ")
                break
            }
            else -> println("Opción no válida. Por favor, elige nuevamente.")
        }
    } while (true)
}