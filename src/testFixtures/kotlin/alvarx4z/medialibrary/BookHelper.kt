package alvarx4z.medialibrary

import alvarx4z.medialibrary.domain.model.book.*
import alvarx4z.medialibrary.domain.model.book.series.Order
import alvarx4z.medialibrary.domain.model.book.series.Saga
import alvarx4z.medialibrary.domain.model.book.series.Series
import alvarx4z.medialibrary.domain.model.shared.Cover
import alvarx4z.medialibrary.domain.model.shared.Genre
import alvarx4z.medialibrary.domain.model.shared.Summary
import alvarx4z.medialibrary.domain.model.shared.Title
import alvarx4z.medialibrary.domain.model.shared.professional.Death
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
  private const val ORDER_IN_SERIES_VALUE = 1

  fun isbnId(value: String = ISBN_ID_VALUE) =
    alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString(value)

  fun legacyIsbnId(value: String = LEGACY_ISBN_ID_VALUE) =
    alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString(value)

  fun isbn(
    isbn: alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString = isbnId(),
    legacyIsbn: alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString? =
      legacyIsbnId(),
  ) = ISBN(standardId = isbn, legacyId = legacyIsbn)

  private fun originalTitle(value: String = TITLE_VALUE) =
    alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString(value)

  private fun englishTitle(value: String = ENGLISH_TITLE_VALUE) =
    alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString(value)

  private fun spanishTitle(value: String = SPANISH_TITLE_VALUE) =
    alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString(value)

  fun title(
    original: alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString = originalTitle(),
    english: alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString = englishTitle(),
    spanish: alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString = spanishTitle(),
    romanization: alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString? = null,
  ) = Title(original, english, spanish, romanization)

  fun authors(death: Death? = null): List<Author> {
    val professional = SharedHelper.professional(death = death)
    return listOf(Author(professional.name, professional.birth, professional.death))
  }

  fun publicationDate(year: Int = YEAR_VALUE, month: Month = Month.APRIL, day: Int = DAY_VALUE) =
    PublicationDate(LocalDate.of(year, month, day))

  fun pageCount(value: Int = PAGE_COUNT_VALUE) = PageCount(value)

  fun order(number: Int = ORDER_IN_SERIES_VALUE) = Order(number)

  fun series(saga: Saga = Saga.HORUS_HERESY, order: Order = order()) = Series(saga, order)

  fun book(
    isbn: ISBN = isbn(),
    title: Title = title(),
    authors: List<Author> = authors(),
    publicationDate: PublicationDate = publicationDate(),
    pageCount: PageCount = pageCount(),
    genre: Genre = Genre.SCIENCE_FICTION,
    series: Series? = series(),
    cover: Cover = SharedHelper.cover(),
    summary: Summary? = SharedHelper.summary(),
  ) = Book(isbn, title, authors, publicationDate, pageCount, genre, series, cover, summary)
}
