package alvarx4z.medialibrary.domain.model.shared.invariants

data class NotEmptyString(val value: String) {
  init {
    require(value.isNotBlank()) { "The provided String cannot be blank" }
  }
}
