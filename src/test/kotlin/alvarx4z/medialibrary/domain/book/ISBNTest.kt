package alvarx4z.medialibrary.domain.book

import alvarx4z.medialibrary.BookHelper
import alvarx4z.medialibrary.domain.shared.invariant.NotEmptyString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class ISBNTest {
  @Test
  fun `should instantiate a full, valid ISBN`() {
    val isbn = BookHelper.isbn()

    assertThat(isbn).isInstanceOf(ISBN::class.java)
    assertThat(isbn.standardId).isInstanceOf(NotEmptyString::class.java)
    assertThat(isbn.legacyId).isInstanceOf(NotEmptyString::class.java)
  }

  @Test
  fun `should instantiate a valid ISBN with null optional properties`() {
    val isbn = BookHelper.isbn(legacyIsbn = null)

    assertThat(isbn).isInstanceOf(ISBN::class.java)
    assertThat(isbn.standardId).isInstanceOf(NotEmptyString::class.java)
    assertThat(isbn.legacyId).isNull()
  }

  @Test
  fun `should throw IllegalArgumentException when invalid standard ISBN`() {
    assertThrows<IllegalArgumentException> {
      BookHelper.isbn(isbn = BookHelper.isbnId(FAKE_ISBN_ID_VALUE))
    }
  }

  @Test
  fun `should throw IllegalArgumentException when invalid legacy ISBN`() {
    assertThrows<IllegalArgumentException> {
      BookHelper.isbn(legacyIsbn = BookHelper.legacyIsbnId(FAKE_ISBN_ID_VALUE))
    }
  }

  private companion object {
    const val FAKE_ISBN_ID_VALUE = "123"
  }
}
