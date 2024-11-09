package alvarx4z.medialibrary.domain.model.shared.professional

import alvarx4z.medialibrary.SharedHelper
import alvarx4z.medialibrary.domain.model.shared.Country
import alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString
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
