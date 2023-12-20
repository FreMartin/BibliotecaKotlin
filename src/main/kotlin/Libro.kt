val inventario = mutableListOf<Libro>()
class Libro( val titulo: String, val autor: String, val anioPresentacion: Int, var disponible: Boolean){
    fun agregarLibro(libro: Libro){

        inventario.add(libro)
        println("Se agregó con éxito el libro ${libro.titulo}")

    }
}

fun nuevoLibro(): Libro{
    println("Ingrese el titulo del libro")
    val titulo = readln().toString().toUpperCase()
    println("Ingrese el autor del libro")
    val autor = readln().toString().toUpperCase()
    println("Ingrese el año de publicación")
    val anio = readln().toInt()
    var libro: Libro = Libro(titulo, autor, anio, disponible = true)
    return libro
}