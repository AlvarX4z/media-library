package alvarx4z.medialibrary.domain.shared.professional

enum class Profession(val value: String) {
  WRITER("Writer");

  companion object {
    fun fromValue(value: String): Profession? = Profession.entries.find { it.value == value }
  }
}
