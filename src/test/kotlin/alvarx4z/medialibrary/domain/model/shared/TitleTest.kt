package alvarx4z.medialibrary.domain.model.shared

import alvarx4z.medialibrary.BookHelper
import alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TitleTest {
  @Test
  fun `should instantiate a full, valid Title`() {
    val title =
      BookHelper.title(
        romanization =
          alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString("Romanization")
      )

    assertThat(title).isInstanceOf(Title::class.java)
    assertThat(title.original)
      .isInstanceOf(alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString::class.java)
    assertThat(title.english)
      .isInstanceOf(alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString::class.java)
    assertThat(title.spanish)
      .isInstanceOf(alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString::class.java)
    assertThat(title.romanization)
      .isInstanceOf(alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString::class.java)
  }

  @Test
  fun `should instantiate a valid Title with null optional properties`() {
    val title = BookHelper.title()

    assertThat(title).isNotNull
    assertThat(title.romanization).isNull()
  }
}
