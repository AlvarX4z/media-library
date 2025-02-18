package alvarx4z.medialibrary.domain.model.shared.invariants

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class PositiveIntTest {
  @Test
  fun `should instantiate a valid PositiveInt`() {
    val positiveInt = PositiveInt(VALUE)

    assertThat(positiveInt).isInstanceOf(PositiveInt::class.java)
    assertThat(positiveInt.value).isEqualTo(VALUE)
  }

  @Test
  fun `should throw IllegalArgumentException when invalid PositiveInt`() {
    assertThrows<IllegalArgumentException> { PositiveInt(0) }
  }

  private companion object {
    const val VALUE = 5
  }
}
