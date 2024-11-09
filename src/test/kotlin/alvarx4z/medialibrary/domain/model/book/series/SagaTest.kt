package alvarx4z.medialibrary.domain.model.book.series

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class SagaTest {
  @Test
  fun `should return the correct enum constant from value`() {
    assertThat(Saga.HORUS_HERESY).isEqualTo(Saga.fromValue("The Horus Heresy"))
  }

  @Test
  fun `should throw IllegalArgumentException when creating a new Saga from invalid value`() {
    assertThrows<IllegalArgumentException> { Saga.valueOf("Fake") }
  }
}
