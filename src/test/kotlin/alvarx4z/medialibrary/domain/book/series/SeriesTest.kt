package alvarx4z.medialibrary.domain.book.series

import alvarx4z.medialibrary.BookHelper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SeriesTest {
  @Test
  fun `should instantiate a valid Series`() {
    val series = BookHelper.series()

    assertThat(series).isInstanceOf(Series::class.java)
    assertThat(series.saga).isInstanceOf(Saga::class.java)
    assertThat(series.order).isInstanceOf(Order::class.java)
  }
}
