package ir.sina.test.number1_unit_test.homework

object Homework1 {
    fun fib(n: Int): Long {
        if (n == 0 || n == 1) return n.toLong()
        var a = 0L
        var b = 1L
        var c = 1L
        (1..n - 2).forEach { _ ->
            c = a + b
            a = b
            b = c
        }
        return c
    }
}