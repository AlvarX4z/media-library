package alvarx4z.medialibrary.domain.shared

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class GenreTest {
  @Test
  fun `should return the correct enum constant from value`() {
    assertThat(Genre.SCIENCE_FICTION).isEqualTo(Genre.fromValue("Science Fiction"))
  }

  @Test
  fun `should throw IllegalArgumentException when creating a new Genre from invalid value`() {
    assertThrows<IllegalArgumentException> { Genre.valueOf("Fake") }
  }
}
