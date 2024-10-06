package alvarx4z.medialibrary.domain.book

import alvarx4z.medialibrary.BookHelper
import alvarx4z.medialibrary.domain.shared.URL
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CoverTest {
  @Test
  fun `should instantiate a valid Cover`() {
    val cover = BookHelper.cover()

    assertThat(cover).isInstanceOf(Cover::class.java)
    assertThat(cover.url).isInstanceOf(URL::class.java)
  }
}
