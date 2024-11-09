package alvarx4z.medialibrary.domain.shared.professional

import alvarx4z.medialibrary.SharedHelper
import alvarx4z.medialibrary.domain.shared.Country
import alvarx4z.medialibrary.domain.shared.invariants.NotEmptyString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocationTest {
  @Test
  fun `should instantiate a valid Location`() {
    val location = SharedHelper.location()

    assertThat(location).isInstanceOf(Location::class.java)
    assertThat(location.city).isInstanceOf(NotEmptyString::class.java)
    assertThat(location.country).isInstanceOf(Country::class.java)
  }
}
