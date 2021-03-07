package lotto

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LottoNumberTest {

    @Test
    fun `로또번호 생성`() {
        val value = 1
        val result = LottoNumber(value)
        assertThat(result).isNotNull
    }

    @Test
    fun `로또번호의 값이 같으면 동등하다`() {
        val expected = LottoNumber(1)
        val result = LottoNumber(1)
        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun `로또번호의 값이 다르면 동등하지 않다`() {
        val one = LottoNumber(1)
        val two = LottoNumber(2)
        assertThat(one).isNotEqualTo(two)
    }
}
