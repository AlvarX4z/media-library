package alvarx4z.medialibrary.domain.book

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class SeriesTest {
  @Test
  fun `should return the correct enum constant from value`() {
    assertThat(Series.HORUS_HERESY).isEqualTo(Series.fromValue("The Horus Heresy"))
  }

  @Test
  fun `should throw IllegalArgumentException when creating a new Series from invalid value`() {
    assertThrows<IllegalArgumentException> { Series.valueOf("Fake") }
  }
}
