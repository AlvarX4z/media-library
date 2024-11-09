package alvarx4z.medialibrary.domain.shared

import alvarx4z.medialibrary.domain.shared.invariants.NotEmptyString

data class Title(
  val original: NotEmptyString,
  val english: NotEmptyString,
  val spanish: NotEmptyString,
  val romanization: NotEmptyString?,
)
