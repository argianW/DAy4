//Buatlah script untuk menentukan suatu tahun merupakan tahun kabisat atau bukan.
fun main() {
    var a = readLine()!!
    var b = a.toInt()
    if (b % 400 == 0) {
        println("$b Kabisat");
    } else if (b % 100 == 0) {
        println("$b Bukan Kabisat");
    } else if (b % 4 == 0) {
        println("$b Kabisat");
    } else {
        println("$b Bukan Kabisat");
    }
}