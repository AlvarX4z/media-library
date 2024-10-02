package alvarx4z.medialibrary

import alvarx4z.medialibrary.domain.shared.invariant.NotEmptyString
import alvarx4z.medialibrary.domain.shared.professional.BirthDate
import alvarx4z.medialibrary.domain.shared.professional.Name
import java.time.LocalDate
import java.time.Month

object SharedHelper {
    private const val FIRST_NAME_VALUE = "Michael Peter"
    private const val LAST_NAME_VALUE = "Balzary"
    private const val PSEUDONYM_VALUE = "Flea"

    private const val YEAR_VALUE = 1962
    private const val DAY_VALUE = 16

    private fun firstName(firstName: String = FIRST_NAME_VALUE) = NotEmptyString(firstName)

    private fun lastName(lastName: String = LAST_NAME_VALUE) = NotEmptyString(lastName)

    private fun pseudonym(pseudonym: String = PSEUDONYM_VALUE) = NotEmptyString(pseudonym)

    fun name(
        firstName: NotEmptyString = firstName(),
        lastName: NotEmptyString = lastName(),
        pseudonym: NotEmptyString = pseudonym(),
    ) = Name(
        firstName = firstName,
        lastName = lastName,
        pseudonym = pseudonym,
    )

    fun publicationDate(
        year: Int = YEAR_VALUE,
        month: Month = Month.OCTOBER,
        day: Int = DAY_VALUE,
    ) = BirthDate(LocalDate.of(year, month, day))
}
