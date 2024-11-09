package alvarx4z.medialibrary.domain.model.book

import alvarx4z.medialibrary.domain.model.shared.invariants.PastDate
import java.time.LocalDate

class PublicationDate(date: LocalDate) : PastDate(date)
