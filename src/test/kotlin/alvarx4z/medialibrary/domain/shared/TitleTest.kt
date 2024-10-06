package alvarx4z.medialibrary.domain.shared

import alvarx4z.medialibrary.BookHelper
import alvarx4z.medialibrary.domain.shared.invariant.NotEmptyString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TitleTest {
  @Test
  fun `should instantiate a full, valid Title`() {
    val title = BookHelper.title(romanization = NotEmptyString("Romanization"))

    assertCommonBase(title)
    assertThat(title.romanization).isInstanceOf(NotEmptyString::class.java)
  }

  @Test
  fun `should instantiate a valid Title with null optional properties`() {
    val title = BookHelper.title()

    assertCommonBase(title)
    assertThat(title.romanization).isNull()
  }

  private fun assertCommonBase(title: Title) {
    assertThat(title).isInstanceOf(Title::class.java)
    assertThat(title.original).isInstanceOf(NotEmptyString::class.java)
    assertThat(title.english).isInstanceOf(NotEmptyString::class.java)
    assertThat(title.spanish).isInstanceOf(NotEmptyString::class.java)
  }
}
