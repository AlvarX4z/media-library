package alvarx4z.medialibrary.domain.shared.professional

import alvarx4z.medialibrary.SharedHelper
import alvarx4z.medialibrary.domain.shared.invariant.NotEmptyString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NameTest {
  @Test
  fun `should instantiate a full, valid Name`() {
    val name = SharedHelper.name()

    assertThat(name).isInstanceOf(Name::class.java)
    assertThat(name.firstName).isInstanceOf(NotEmptyString::class.java)
    assertThat(name.lastName).isInstanceOf(NotEmptyString::class.java)
    assertThat(name.pseudonyms).isInstanceOf(List::class.java)
    assertThat(name.pseudonyms?.size).isEqualTo(3)
  }

  @Test
  fun `should instantiate a Name with null optional properties`() {
    val name = SharedHelper.name(pseudonyms = null)

    assertThat(name.pseudonyms).isNull()
  }
}
