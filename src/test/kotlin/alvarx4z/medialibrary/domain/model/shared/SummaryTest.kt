package alvarx4z.medialibrary.domain.model.shared

import alvarx4z.medialibrary.SharedHelper
import alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SummaryTest {
  @Test
  fun `should instantiate a valid Summary`() {
    val summary = SharedHelper.summary()

    assertThat(summary).isInstanceOf(Summary::class.java)
    assertThat(summary.resource)
      .isInstanceOf(alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString::class.java)
  }
}
