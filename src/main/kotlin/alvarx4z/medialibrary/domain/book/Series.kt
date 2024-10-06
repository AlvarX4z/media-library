package alvarx4z.medialibrary.domain.book

enum class Series(val value: String) {
  HORUS_HERESY("The Horus Heresy");

  companion object {
    fun fromValue(value: String): Series? = entries.find { it.value == value }
  }
}
