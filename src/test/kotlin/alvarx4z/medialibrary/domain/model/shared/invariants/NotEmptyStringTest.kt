package alvarx4z.medialibrary.domain.model.shared.invariants

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class NotEmptyStringTest {
  @Test
  fun `should instantiate a valid NotEmptyString`() {
    val notEmptyString = alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString(VALUE)

    assertThat(notEmptyString)
      .isInstanceOf(alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString::class.java)
    assertThat(notEmptyString.value).isEqualTo(VALUE)
  }

  @Test
  fun `should throw IllegalArgumentException when invalid NotEmptyString`() {
    assertThrows<IllegalArgumentException> {
      alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString("")
    }
  }

  private companion object {
    const val VALUE = "Value"
  }
}
