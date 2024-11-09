package alvarx4z.medialibrary.domain.model.shared

enum class Country(val value: String) {
  UNITED_STATES("United States");

  companion object {
    fun fromValue(value: String): Country? = entries.find { it.value == value }
  }
}
