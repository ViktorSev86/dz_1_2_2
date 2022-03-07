fun main() {
    val likes = 61
    val res = if (likes % 10 != 1) "людям" else "человеку"
    println("Понравилось " + likes + " " + res)
}