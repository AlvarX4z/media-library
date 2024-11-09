package alvarx4z.medialibrary.domain.model.book

import alvarx4z.medialibrary.BookHelper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PageCountTest {
  @Test
  fun `should instantiate a valid PageCount`() {
    val pageCount = BookHelper.pageCount()

    assertThat(pageCount).isInstanceOf(PageCount::class.java)
  }
}
