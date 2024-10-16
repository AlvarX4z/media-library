package alvarx4z.medialibrary.domain.book

import alvarx4z.medialibrary.BookHelper
import alvarx4z.medialibrary.domain.book.series.Series
import alvarx4z.medialibrary.domain.shared.Cover
import alvarx4z.medialibrary.domain.shared.Genre
import alvarx4z.medialibrary.domain.shared.Summary
import alvarx4z.medialibrary.domain.shared.Title
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookTest {
  @Test
  fun `should instantiate a full, valid Book`() {
    val book = BookHelper.book()

    assertThat(book).isInstanceOf(Book::class.java)
    assertThat(book.isbn).isInstanceOf(ISBN::class.java)
    assertThat(book.title).isInstanceOf(Title::class.java)
    assertThat(book.authors).isInstanceOf(List::class.java)
    assertThat(book.authors.size).isEqualTo(1)
    assertThat(book.publicationDate).isInstanceOf(PublicationDate::class.java)
    assertThat(book.pageCount).isInstanceOf(PageCount::class.java)
    assertThat(book.genre).isInstanceOf(Genre::class.java)
    assertThat(book.series).isInstanceOf(Series::class.java)
    assertThat(book.cover).isInstanceOf(Cover::class.java)
    assertThat(book.summary).isInstanceOf(Summary::class.java)
  }

  @Test
  fun `should instantiate a Book with null optional properties`() {
    val book = BookHelper.book(series = null, summary = null)

    assertThat(book).isNotNull
    assertThat(book.series).isNull()
    assertThat(book.summary).isNull()
  }
}
