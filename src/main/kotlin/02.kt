//Buatlah script untuk menentukan suatu angka merupakan bilangan ganjil atau genap.

fun main() {
    var a = readLine()!!
    var b = a.toInt()
    if (b % 2 == 0)
        println("Genap")
    else
        println("Ganjil")
}