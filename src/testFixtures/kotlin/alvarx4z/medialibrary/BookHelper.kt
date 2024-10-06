package alvarx4z.medialibrary

import alvarx4z.medialibrary.domain.book.*
import alvarx4z.medialibrary.domain.shared.Genre
import alvarx4z.medialibrary.domain.shared.Title
import alvarx4z.medialibrary.domain.shared.URL
import alvarx4z.medialibrary.domain.shared.invariant.NotEmptyString
import alvarx4z.medialibrary.domain.shared.professional.Death
import alvarx4z.medialibrary.domain.shared.professional.Profession
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

  private const val COVER_URL_VALUE =
    "https://m.media-amazon.com/images/I/81Q-cK3hDmL._AC_UF894,1000_QL80_.jpg"

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

  fun authors(death: Death? = null): List<Author> {
    val professional =
      SharedHelper.professional(profession = listOf(Profession.WRITER), death = death)
    return listOf(
      Author(
        name = professional.name,
        profession = professional.profession,
        birth = professional.birth,
        death = professional.death,
      )
    )
  }

  fun publicationDate(year: Int = YEAR_VALUE, month: Month = Month.APRIL, day: Int = DAY_VALUE) =
    PublicationDate(LocalDate.of(year, month, day))

  fun pageCount(value: Int = PAGE_COUNT_VALUE) = PageCount(value)

  fun cover(resource: URL = SharedHelper.url(NotEmptyString(COVER_URL_VALUE))) = Cover(resource)

  fun book(
    isbn: ISBN = isbn(),
    title: Title = title(),
    authors: List<Author> = authors(),
    publicationDate: PublicationDate = publicationDate(),
    pageCount: PageCount = pageCount(),
    genre: Genre = Genre.SCIENCE_FICTION,
    cover: Cover = cover(),
  ) =
    Book(
      isbn = isbn,
      title = title,
      authors = authors,
      publicationDate = publicationDate,
      pageCount = pageCount,
      genre = genre,
      cover = cover,
    )
}
