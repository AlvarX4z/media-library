package alvarx4z.medialibrary.domain.shared.invariant

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class NotEmptyStringTest {
  @Test
  fun `should instantiate a valid NotEmptyString`() {
    val notEmptyString = NotEmptyString(VALUE)

    assertThat(notEmptyString).isInstanceOf(NotEmptyString::class.java)
    assertThat(notEmptyString.value).isEqualTo(VALUE)
  }

  @Test
  fun `should throw IllegalArgumentException when invalid NotEmptyString`() {
    assertThrows<IllegalArgumentException> { NotEmptyString("") }
  }

  private companion object {
    const val VALUE = "Value"
  }
}
