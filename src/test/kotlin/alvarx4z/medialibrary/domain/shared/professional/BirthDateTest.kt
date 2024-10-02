package alvarx4z.medialibrary.domain.shared.professional

import alvarx4z.medialibrary.BookHelper
import alvarx4z.medialibrary.SharedHelper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.time.Month

internal class BirthDateTest {
    @Test
    fun `Should instantiate a valid BirthDate`() {
        val birthDate = SharedHelper.publicationDate()

        assertThat(birthDate).isInstanceOf(BirthDate::class.java)
    }

    @Test
    fun `Should throw IllegalArgumentException when future BirthDate`() {
        assertThrows<IllegalArgumentException> { BookHelper.publicationDate(3024, Month.OCTOBER, 1) }
    }
}
