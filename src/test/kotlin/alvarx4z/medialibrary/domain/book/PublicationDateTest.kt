package alvarx4z.medialibrary.domain.book

import alvarx4z.medialibrary.BookHelper
import java.time.Month
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class PublicationDateTest {
  @Test
  fun `should instantiate a valid PublicationDate`() {
    val pastDate = BookHelper.publicationDate()

    assertThat(pastDate).isInstanceOf(PublicationDate::class.java)
  }

  @Test
  fun `should throw IllegalArgumentException when future PublicationDate`() {
    assertThrows<IllegalArgumentException> { BookHelper.publicationDate(3024, Month.OCTOBER, 1) }
  }
}
