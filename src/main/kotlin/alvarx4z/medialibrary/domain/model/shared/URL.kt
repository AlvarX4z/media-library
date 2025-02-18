package alvarx4z.medialibrary.domain.model.shared

import alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString

data class URL(val resource: alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString) {
  init {
    require(urlFormatRegex.matches(resource.value)) { "The provided URL is invalid" }
  }

  private companion object {
    val urlFormatRegex =
      "[(http(s)?):\\/\\/(www\\.)?a-zA-Z0-9@:%._\\+~#=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:,%_\\+.~#?&//=]*)"
        .toRegex()
  }
}
