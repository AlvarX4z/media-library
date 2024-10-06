package alvarx4z.medialibrary.domain.shared.professional

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class ProfessionTest {
  @Test
  fun `should return the correct enum constant from value`() {
    assertThat(Profession.WRITER).isEqualTo(Profession.fromValue("Writer"))
  }

  @Test
  fun `should throw IllegalArgumentException when creating a new Profession from invalid value`() {
    assertThrows<IllegalArgumentException> { Profession.valueOf("Fake") }
  }
}
