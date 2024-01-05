package ir.sina.test.number1_unit_test

object RegistrationUtil {
    private val existingUsers = listOf("Sina","Ali")

    fun validRegistrationInput(
        username: String,
        password: String,
        confirmPassword: String,
    ): Boolean {
        if (username.isEmpty()|| password.isEmpty()) return false
        if (username in existingUsers) return false
        if (password!=confirmPassword) return false
        return password.count{it.isDigit()} >= 2
    }
}