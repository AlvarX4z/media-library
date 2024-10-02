package alvarx4z.medialibrary.domain.shared.professional

import alvarx4z.medialibrary.domain.shared.invariant.NotEmptyString

data class Name(
    val firstName: NotEmptyString,
    val lastName: NotEmptyString,
    val pseudonym: NotEmptyString?,
)
