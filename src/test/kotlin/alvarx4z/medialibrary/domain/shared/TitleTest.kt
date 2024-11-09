package alvarx4z.medialibrary.domain.shared

import alvarx4z.medialibrary.BookHelper
import alvarx4z.medialibrary.domain.shared.invariants.NotEmptyString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TitleTest {
  @Test
  fun `should instantiate a full, valid Title`() {
    val title = BookHelper.title(romanization = NotEmptyString("Romanization"))

    assertThat(title).isInstanceOf(Title::class.java)
    assertThat(title.original).isInstanceOf(NotEmptyString::class.java)
    assertThat(title.english).isInstanceOf(NotEmptyString::class.java)
    assertThat(title.spanish).isInstanceOf(NotEmptyString::class.java)
    assertThat(title.romanization).isInstanceOf(NotEmptyString::class.java)
  }

  @Test
  fun `should instantiate a valid Title with null optional properties`() {
    val title = BookHelper.title()

    assertThat(title).isNotNull
    assertThat(title.romanization).isNull()
  }
}
