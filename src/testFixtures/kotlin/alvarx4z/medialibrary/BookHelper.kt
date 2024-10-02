package alvarx4z.medialibrary

import alvarx4z.medialibrary.domain.book.ISBN
import alvarx4z.medialibrary.domain.shared.invariant.NotEmptyString

object BookHelper {
  private const val ISBN_ID_VALUE = "9781844162949"
  private const val LEGACY_ISBN_ID_VALUE = "184416294X"

  private const val TITLE_VALUE = "Horus Rising"
  private const val ENGLISH_TITLE_VALUE = "Horus Rising"
  private const val SPANISH_TITLE_VALUE = "Horus, Señor de la Guerra"

  private const val PUBLISHER_NAME_VALUE = "Games Workshop"

  fun isbnId(value: String = ISBN_ID_VALUE) = NotEmptyString(value)

  fun legacyIsbnId(value: String = LEGACY_ISBN_ID_VALUE) = NotEmptyString(value)

  fun isbn(
    isbn: NotEmptyString = isbnId(),
    legacyIsbn: NotEmptyString? = legacyIsbnId()
  ) = ISBN(
    standardId = isbn,
    legacyId = legacyIsbn
  )
}
