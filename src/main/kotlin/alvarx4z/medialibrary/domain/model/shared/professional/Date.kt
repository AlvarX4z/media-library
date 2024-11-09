package alvarx4z.medialibrary.domain.model.shared.professional

import alvarx4z.medialibrary.domain.model.shared.invariants.PastDate
import java.time.LocalDate

class Date(date: LocalDate) : PastDate(date)
