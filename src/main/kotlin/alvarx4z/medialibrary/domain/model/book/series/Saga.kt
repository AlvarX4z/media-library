package alvarx4z.medialibrary.domain.model.book.series

enum class Saga(val value: String) {
  HORUS_HERESY("The Horus Heresy");

  companion object {
    fun fromValue(value: String): Saga? = entries.find { it.value == value }
  }
}
