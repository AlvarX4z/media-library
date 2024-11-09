package alvarx4z.medialibrary.domain.model.shared

import alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString

data class Title(
  val original: alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString,
  val english: alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString,
  val spanish: alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString,
  val romanization: alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString?,
)
