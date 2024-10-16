package alvarx4z.medialibrary.domain.shared

import alvarx4z.medialibrary.SharedHelper
import alvarx4z.medialibrary.domain.shared.invariant.NotEmptyString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SummaryTest {
  @Test
  fun `should instantiate a valid Summary`() {
    val summary = SharedHelper.summary()

    assertThat(summary).isInstanceOf(Summary::class.java)
    assertThat(summary.resource).isInstanceOf(NotEmptyString::class.java)
  }
}
