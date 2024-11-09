package alvarx4z.medialibrary.domain.model.shared

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class CountryTest {
  @Test
  fun `should return the correct enum constant from value`() {
    assertThat(Country.UNITED_STATES).isEqualTo(Country.fromValue("United States"))
  }

  @Test
  fun `should throw IllegalArgumentException when creating a new Country from invalid value`() {
    assertThrows<IllegalArgumentException> { Country.valueOf("Fake") }
  }
}
