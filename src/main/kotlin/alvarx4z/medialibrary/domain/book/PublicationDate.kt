package alvarx4z.medialibrary.domain.book

import alvarx4z.medialibrary.domain.shared.invariant.PastDate
import java.time.LocalDate

class PublicationDate(date: LocalDate) : PastDate(date)
