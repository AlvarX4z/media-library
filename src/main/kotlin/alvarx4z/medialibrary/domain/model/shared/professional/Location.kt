package alvarx4z.medialibrary.domain.model.shared.professional

import alvarx4z.medialibrary.domain.model.shared.Country
import alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString

data class Location(val city: NotEmptyString, val country: Country)
