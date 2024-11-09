package alvarx4z.medialibrary.domain.model.shared.professional

import alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString

data class Name(
  val name: NotEmptyString,
  val fullName: NotEmptyString,
  val nonLatinName: NotEmptyString?,
  val pseudonyms: List<NotEmptyString>?,
)
