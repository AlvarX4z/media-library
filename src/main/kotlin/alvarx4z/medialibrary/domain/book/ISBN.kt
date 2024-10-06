package alvarx4z.medialibrary.domain.book

import alvarx4z.medialibrary.domain.shared.invariant.NotEmptyString

data class ISBN(val standardId: NotEmptyString, val legacyId: NotEmptyString?) {
  init {
    checkStandardIsbn()
    checkLegacyIsbn()
  }

  private fun checkStandardIsbn() =
    require(standardFormatRegex.matches(standardId.value)) { INVALID_MESSAGE }

  private fun checkLegacyIsbn() =
    legacyId?.value?.let { require(legacyFormatRegex.matches(it)) { INVALID_MESSAGE } }

  private companion object {
    const val INVALID_MESSAGE = "The provided ISBN is invalid"

    val standardFormatRegex = "^\\d{13}\$".toRegex()
    val legacyFormatRegex = "^\\d{9}[A-Za-z]\$".toRegex()
  }
}
