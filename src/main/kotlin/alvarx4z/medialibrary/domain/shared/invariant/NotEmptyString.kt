package alvarx4z.medialibrary.domain.shared.invariant

data class NotEmptyString(val value: String) {
  init {
    require(value.isNotBlank()) { "The provided String cannot be blank" }
  }
}
