package alvarx4z.medialibrary.domain.shared.invariant

import java.time.LocalDate

open class PastDate(date: LocalDate) {
    init {
        require(date.isBefore(LocalDate.now())) {
            "The provided date cannot be set in the future"
        }
    }
}
