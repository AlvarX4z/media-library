package alvarx4z.medialibrary.domain.book.series

import alvarx4z.medialibrary.BookHelper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class OrderTest {
  @Test
  fun `should instantiate a valid Order`() {
    val order = BookHelper.order()

    assertThat(order).isInstanceOf(Order::class.java)
  }

  @Test
  fun `should throw IllegalArgumentException when invalid Order`() {
    assertThrows<IllegalArgumentException> { BookHelper.order(0) }
  }
}
