package alvarx4z.medialibrary.domain.shared.professional

import alvarx4z.medialibrary.domain.shared.invariants.PastDate
import java.time.LocalDate

class Date(date: LocalDate) : PastDate(date)
