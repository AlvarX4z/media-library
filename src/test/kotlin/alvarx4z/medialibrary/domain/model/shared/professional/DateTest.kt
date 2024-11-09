package alvarx4z.medialibrary.domain.model.shared.professional

import alvarx4z.medialibrary.SharedHelper
import java.time.Month
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class DateTest {
  @Test
  fun `should instantiate a valid Birth Date`() {
    val birthDate = SharedHelper.birthDate()

    assertThat(birthDate).isInstanceOf(Date::class.java)
  }

  @Test
  fun `should throw IllegalArgumentException when future Birth Date`() {
    assertThrows<IllegalArgumentException> { SharedHelper.birthDate(3024, Month.OCTOBER, 1) }
  }
}
