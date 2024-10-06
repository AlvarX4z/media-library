package alvarx4z.medialibrary.domain.shared.invariant

open class PositiveInt(val value: Int) {
  init {
    require(value > 1) { "The provided Int cannot be equal or lower than 0" }
  }
}
