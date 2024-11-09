package alvarx4z.medialibrary.domain.model.shared

import alvarx4z.medialibrary.SharedHelper
import alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class URLTest {
  @Test
  fun `should instantiate a valid URL`() {
    val url = SharedHelper.url()

    assertThat(url).isInstanceOf(URL::class.java)
    assertThat(url.resource)
      .isInstanceOf(alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString::class.java)
  }

  @Test
  fun `should throw IllegalArgumentException when creating an invalid URL`() {
    assertThrows<IllegalArgumentException> {
      URL(alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString("Fake"))
    }
  }
}
