package alvarx4z.medialibrary

import alvarx4z.medialibrary.domain.shared.invariant.NotEmptyString
import alvarx4z.medialibrary.domain.shared.professional.Name

object SharedHelper {
    private const val FIRST_NAME_VALUE = "Michael Peter"
    private const val LAST_NAME_VALUE = "Balzary"
    private const val PSEUDONYM_VALUE = "Flea"

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
}
