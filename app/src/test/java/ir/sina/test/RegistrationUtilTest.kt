package ir.sina.test

import com.google.common.truth.Truth.assertThat
import ir.sina.test.number1_unit_test.RegistrationUtil.validRegistrationInput
import org.junit.Test

class RegistrationUtilTest {
    @Test
    fun `empty user return false`() {
        assertThat(validRegistrationInput("", "", "")).isFalse()
    }
    @Test
    fun `valid username and correctly repeated password return true`() {
        /**
         * according your input in assertThat( 'hear' )  the methods could be change
         */
        assertThat(validRegistrationInput("sina", "123", "123")).isTrue()
    }
    @Test
    fun `username already exist return false`() {
        assertThat(validRegistrationInput("dina", "123", "123")).isFalse()
    }

    @Test
    fun `incorrectly confirmed password`() {
        assertThat(validRegistrationInput("sina", "123", "1234")).isFalse()
    }
    @Test
    fun `empty password returns false`() {
        assertThat(validRegistrationInput("sina", "", "")).isFalse()
    }

    @Test
    fun `less than 2 digit password returns false`() {
        assertThat(validRegistrationInput("dina", "123", "123")).isFalse()
    }
}