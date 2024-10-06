package alvarx4z.medialibrary.domain.book

import alvarx4z.medialibrary.BookHelper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PageCountTest {
  @Test
  fun `Should instantiate a valid PageCount`() {
    val pageCount = BookHelper.pageCount()

    assertThat(pageCount).isInstanceOf(PageCount::class.java)
  }
}
