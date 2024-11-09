package alvarx4z.medialibrary.domain.shared.professional

import alvarx4z.medialibrary.domain.shared.invariants.NotEmptyString

data class Name(
  val name: NotEmptyString,
  val fullName: NotEmptyString,
  val nonLatinName: NotEmptyString?,
  val pseudonyms: List<NotEmptyString>?,
)
