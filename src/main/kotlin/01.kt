//Buatlah script untuk menentukan suatu nilai dengan ketentuan berikut:
//
//Jika nilai yang dimasukkan lebih besar dan sama dengan 90 maka output yang keluar adalah A.
//Jika nilai yang dimasukkan lebih besar dan sama dengan 80; dan lebih kecil dan sama dengan 89, maka output yang keluar adalah B.
//Jika nilai yang dimasukkan lebih besar dan sama dengan 70; dan lebih kecil dan sama dengan 79, maka output yang keluar adalah C.
//Jika nilai yang dimasukkan lebih besar dan sama dengan 60; dan lebih kecil dan sama dengan 69, maka output yang keluar adalah D.
//Jika nilai yang dimasukkan lebih kecil dan sama dengan 59 maka output yang keluar adalah E.

fun main() {
    var a = readLine()!!
    var b = a.toInt()
    if (b >= 90)
        println("A")
    else if (b in 80..89)
        println("B")
    else if (b in 70..79)
        println("C")
    else if (b in 60..69)
        println("D")
    else if (b <= 59)
        println("E")
    else
        println("ora masuk masehhh")
}