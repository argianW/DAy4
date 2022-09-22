//Buatlah script untuk menentukan rating suatu film, dengan ketentuan sebagai berikut:
//
//Jika usia yang dimasukkan lebih atau sama dengan 21, maka rating film adalah DEWASA.
//Jika usia yang dimasukkan lebih atau sama dengan 13, maka rating film adalah REMAJA.
//Jika usia yang dimasukkan lebih atau sama dengan 9, maka rating film adalah BIMBINGAN ORANG TUA.
//Jika usia yang dimasukkan kurang dari 9, maka rating film adalah SEMUA USIA.

fun main() {
    var a = readLine()!!
    var b = a.toInt()
    if (b >= 21)
        println("DEWASA")
    else if (b in 13..21)
        println("REMAJA")
    else if (b in 9..21)
        println("BIMBINGAN ORANG TUA")
    else if (b < 9)
        println("SEMUA USIA")
}