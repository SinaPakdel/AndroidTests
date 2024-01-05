package ir.sina.test.number1_unit_test.homework

object Homework2 {
    fun checkBraces(string: String): Boolean {
        return string.count { it == '(' } == string.count { it == ')' }
    }
}