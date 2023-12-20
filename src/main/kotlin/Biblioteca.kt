val librosPrestados = mutableListOf<ListaLibros>()
class Biblioteca (){


    companion object{
        fun mostrarUsuarios() {
            println("Nombre\t Edad")
            registroUsuarios.forEach {
                println("${it.nombre} \t ${it.edad} ")
            }
        }

        fun mostrarLibros() {
            println("Título\t Autor\t Año")
            inventario.forEach {
                if (it.disponible) {
                    println("${it.titulo}\t ${it.autor}\t ${it.anioPresentacion}")
                }
            }
        }

        fun mostrarPrestamos() {

            println("Título:\t Usuario: ")

            librosPrestados.forEach {
                println("${it.titulo}\t ${it.usuario}")
            }
        }
    }


    fun prestarLibro(){
        mostrarLibros()
        println("Ingrese el nombre del libro que desea")
        val book:String = readLine().toString().toUpperCase()
        inventario.forEach(){
            if (it.titulo == book){
                mostrarUsuarios()
                println("Ingrese el usuario que desea el libro")
                val user:String = readLine().toString().toUpperCase()
                registroUsuarios.forEach(){
                    if (it.nombre == user){
                        val lista:ListaLibros = ListaLibros(book, user)
                        librosPrestados.add(lista)
                    }else {
                        println("El usuario no existe")
                    }
                }
                it.disponible = false
            }else {
                println("Libro no existente o no disponible")
            }
        }
    }

}

class ListaLibros( val titulo: String, val usuario: String)