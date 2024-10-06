package alvarx4z.medialibrary.domain.book

import alvarx4z.medialibrary.BookHelper
import alvarx4z.medialibrary.domain.shared.Genre
import alvarx4z.medialibrary.domain.shared.Title
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookTest {
  @Test
  fun `should instantiate a valid Book`() {
    val book = BookHelper.book()

    assertThat(book).isInstanceOf(Book::class.java)
    assertThat(book.isbn).isInstanceOf(ISBN::class.java)
    assertThat(book.title).isInstanceOf(Title::class.java)
    assertThat(book.publicationDate).isInstanceOf(PublicationDate::class.java)
    assertThat(book.genre).isInstanceOf(Genre::class.java)
  }
}
