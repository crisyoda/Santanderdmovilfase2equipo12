fun main() {
    print("Escribe la cancion: ")
    val userInput = readLine()
    println("Cantidad de digitos: ${countDigits(userInput)}")
}
 
fun countDigits(userInput: String?): Int {
    if (userInput.isNullOrBlank()) {
        throw IllegalArgumentException("Entrada inválida, la palabra debe tener al menos un carácter")
    }
    return userInput.count(Char::isDigit)
}





