package alvarx4z.medialibrary

import alvarx4z.medialibrary.domain.book.Book
import alvarx4z.medialibrary.domain.book.ISBN
import alvarx4z.medialibrary.domain.book.PageCount
import alvarx4z.medialibrary.domain.book.PublicationDate
import alvarx4z.medialibrary.domain.shared.Title
import alvarx4z.medialibrary.domain.shared.invariant.NotEmptyString
import java.time.LocalDate
import java.time.Month

object BookHelper {
  private const val ISBN_ID_VALUE = "9781844162949"
  private const val LEGACY_ISBN_ID_VALUE = "184416294X"

  private const val TITLE_VALUE = "Horus Rising"
  private const val ENGLISH_TITLE_VALUE = "Horus Rising"
  private const val SPANISH_TITLE_VALUE = "Horus, Señor de la Guerra"

  private const val YEAR_VALUE = 2006
  private const val DAY_VALUE = 25

  private const val PAGE_COUNT_VALUE = 416

  fun isbnId(value: String = ISBN_ID_VALUE) = NotEmptyString(value)

  fun legacyIsbnId(value: String = LEGACY_ISBN_ID_VALUE) = NotEmptyString(value)

  fun isbn(isbn: NotEmptyString = isbnId(), legacyIsbn: NotEmptyString? = legacyIsbnId()) =
    ISBN(standardId = isbn, legacyId = legacyIsbn)

  private fun originalTitle(value: String = TITLE_VALUE) = NotEmptyString(value)

  private fun englishTitle(value: String = ENGLISH_TITLE_VALUE) = NotEmptyString(value)

  private fun spanishTitle(value: String = SPANISH_TITLE_VALUE) = NotEmptyString(value)

  fun title(
    original: NotEmptyString = originalTitle(),
    english: NotEmptyString = englishTitle(),
    spanish: NotEmptyString = spanishTitle(),
    romanization: NotEmptyString? = null,
  ) = Title(original = original, english = english, spanish = spanish, romanization = romanization)

  fun publicationDate(year: Int = YEAR_VALUE, month: Month = Month.APRIL, day: Int = DAY_VALUE) =
    PublicationDate(LocalDate.of(year, month, day))

  fun pageCount(value: Int = PAGE_COUNT_VALUE) = PageCount(value)

  fun book(
    isbn: ISBN = isbn(),
    title: Title = title(),
    publicationDate: PublicationDate = publicationDate(),
    pageCount: PageCount = pageCount(),
  ) = Book(isbn = isbn, title = title, publicationDate = publicationDate, pageCount = pageCount)
}
