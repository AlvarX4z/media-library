package alvarx4z.medialibrary.domain.model.shared

import alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString

data class Summary(
  val resource: alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString
)
