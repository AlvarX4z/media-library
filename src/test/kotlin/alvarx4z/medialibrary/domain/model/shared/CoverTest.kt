package alvarx4z.medialibrary.domain.model.shared

import alvarx4z.medialibrary.SharedHelper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CoverTest {
  @Test
  fun `should instantiate a valid Cover`() {
    val cover = SharedHelper.cover()

    assertThat(cover).isInstanceOf(Cover::class.java)
    assertThat(cover.url).isInstanceOf(URL::class.java)
  }
}
