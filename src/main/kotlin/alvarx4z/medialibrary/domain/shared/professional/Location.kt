package alvarx4z.medialibrary.domain.shared.professional

import alvarx4z.medialibrary.domain.shared.Country
import alvarx4z.medialibrary.domain.shared.invariants.NotEmptyString

data class Location(val city: NotEmptyString, val country: Country)
