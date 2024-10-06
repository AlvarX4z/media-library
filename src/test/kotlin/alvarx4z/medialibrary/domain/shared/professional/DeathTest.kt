package alvarx4z.medialibrary.domain.shared.professional

import alvarx4z.medialibrary.SharedHelper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeathTest {
  @Test
  fun `should instantiate a valid Death`() {
    val death = SharedHelper.death()

    assertThat(death).isInstanceOf(Death::class.java)
    assertThat(death.date).isInstanceOf(Date::class.java)
    assertThat(death.location).isInstanceOf(Location::class.java)
  }
}
