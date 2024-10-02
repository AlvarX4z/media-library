package alvarx4z.medialibrary.domain.book

import alvarx4z.medialibrary.BookHelper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.time.Month

internal class PublicationDateTest {
    @Test
    fun `Should instantiate a valid PublicationDate`() {
        val pastDate = BookHelper.publicationDate()

        assertThat(pastDate).isInstanceOf(PublicationDate::class.java)
    }

    @Test
    fun `Should throw IllegalArgumentException when future PublicationDate`() {
        assertThrows<IllegalArgumentException> { BookHelper.publicationDate(3024, Month.OCTOBER, 1) }
    }
}
