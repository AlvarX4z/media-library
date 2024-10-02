package alvarx4z.medialibrary.domain.shared.invariant

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.time.LocalDate
import java.time.Month

internal class PastDateTest {
  @Test
  fun `Should instantiate a valid PastDate`() {
    val pastDate = PastDate(LocalDate.of(2024, Month.OCTOBER, 1))

    assertThat(pastDate).isInstanceOf(PastDate::class.java)
  }

  @Test
  fun `Should throw IllegalArgumentException when future PastDate`() {
    assertThrows<IllegalArgumentException> { PastDate(LocalDate.of(3024, Month.OCTOBER, 1)) }
  }
}
