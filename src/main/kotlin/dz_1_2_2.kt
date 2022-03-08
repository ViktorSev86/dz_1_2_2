fun main() {
    val likes = 211
    val res = if (likes % 100 == 11) "человекам" else if (likes % 10 != 1) "людям" else "человеку"
    println("Понравилось " + likes + " " + res)
}