package alvarx4z.medialibrary.domain.shared.professional

import alvarx4z.medialibrary.domain.shared.invariant.PastDate
import java.time.LocalDate

class BirthDate(date: LocalDate) : PastDate(date)
