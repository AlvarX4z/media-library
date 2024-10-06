package alvarx4z.medialibrary

import alvarx4z.medialibrary.domain.shared.invariant.NotEmptyString
import alvarx4z.medialibrary.domain.shared.professional.Name
import alvarx4z.medialibrary.domain.shared.professional.birth.Date
import java.time.LocalDate
import java.time.Month

object SharedHelper {
  private const val FIRST_NAME_VALUE = "Stephen Edwin"
  private const val LAST_NAME_VALUE = "King"
  private const val FIRST_PSEUDONYM_VALUE = "Richard Bachman"
  private const val SECOND_PSEUDONYM_VALUE = "John Swithen"
  private const val THIRD_PSEUDONYM_VALUE = "Beryl Evans"

  private const val YEAR_VALUE = 1947
  private const val DAY_VALUE = 21

  private fun firstName(firstName: String = FIRST_NAME_VALUE) = NotEmptyString(firstName)

  private fun lastName(lastName: String = LAST_NAME_VALUE) = NotEmptyString(lastName)

  private fun pseudonym() =
    listOf(
      NotEmptyString(FIRST_PSEUDONYM_VALUE),
      NotEmptyString(SECOND_PSEUDONYM_VALUE),
      NotEmptyString(THIRD_PSEUDONYM_VALUE),
    )

  fun name(
    firstName: NotEmptyString = firstName(),
    lastName: NotEmptyString = lastName(),
    pseudonym: List<NotEmptyString>? = pseudonym(),
  ) = Name(firstName = firstName, lastName = lastName, pseudonyms = pseudonym)

  fun birthDate(year: Int = YEAR_VALUE, month: Month = Month.SEPTEMBER, day: Int = DAY_VALUE) =
    Date(LocalDate.of(year, month, day))
}
