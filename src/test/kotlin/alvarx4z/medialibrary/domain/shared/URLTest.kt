package alvarx4z.medialibrary.domain.shared

import alvarx4z.medialibrary.SharedHelper
import alvarx4z.medialibrary.domain.shared.invariants.NotEmptyString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class URLTest {
  @Test
  fun `should instantiate a valid URL`() {
    val url = SharedHelper.url()

    assertThat(url).isInstanceOf(URL::class.java)
    assertThat(url.resource).isInstanceOf(NotEmptyString::class.java)
  }

  @Test
  fun `should throw IllegalArgumentException when creating an invalid URL`() {
    assertThrows<IllegalArgumentException> { URL(NotEmptyString("Fake")) }
  }
}
