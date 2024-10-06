package alvarx4z.medialibrary.domain.shared.invariant

import java.time.LocalDate
import java.time.Month
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class PastDateTest {
  @Test
  fun `should instantiate a valid PastDate`() {
    val pastDate = PastDate(LocalDate.of(2024, Month.OCTOBER, 1))

    assertThat(pastDate).isInstanceOf(PastDate::class.java)
  }

  @Test
  fun `should throw IllegalArgumentException when future PastDate`() {
    assertThrows<IllegalArgumentException> { PastDate(LocalDate.of(3024, Month.OCTOBER, 1)) }
  }
}
