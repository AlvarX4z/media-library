package alvarx4z.medialibrary.domain.shared.invariant

import java.time.LocalDate

open class PastDate(date: LocalDate) {
    init {
        require(date.isBefore(LocalDate.now())) {
            "The date cannot be in the future"
        }
    }
}
