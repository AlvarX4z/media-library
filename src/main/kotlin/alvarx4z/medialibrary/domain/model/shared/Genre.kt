package alvarx4z.medialibrary.domain.model.shared

enum class Genre(val value: String) {
  SCIENCE_FICTION("Science Fiction");

  companion object {
    fun fromValue(value: String): Genre? = entries.find { it.value == value }
  }
}
