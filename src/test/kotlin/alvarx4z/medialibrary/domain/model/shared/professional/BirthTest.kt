package alvarx4z.medialibrary.domain.model.shared.professional

import alvarx4z.medialibrary.SharedHelper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BirthTest {
  @Test
  fun `should instantiate a valid Birth`() {
    val birth = SharedHelper.birth()

    assertThat(birth).isInstanceOf(Birth::class.java)
    assertThat(birth.date).isInstanceOf(Date::class.java)
    assertThat(birth.location).isInstanceOf(Location::class.java)
  }
}
