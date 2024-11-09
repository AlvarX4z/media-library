package alvarx4z.medialibrary.domain.model.shared.professional

import alvarx4z.medialibrary.SharedHelper
import alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NameTest {
  @Test
  fun `should instantiate a full, valid Name`() {
    val name = SharedHelper.name()

    assertThat(name).isInstanceOf(Name::class.java)
    assertThat(name.name)
      .isInstanceOf(alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString::class.java)
    assertThat(name.fullName)
      .isInstanceOf(alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString::class.java)
    assertThat(name.nonLatinName)
      .isInstanceOf(alvarx4z.medialibrary.domain.model.shared.invariants.NotEmptyString::class.java)
    assertThat(name.pseudonyms).isInstanceOf(List::class.java)
    assertThat(name.pseudonyms?.size).isEqualTo(3)
  }

  @Test
  fun `should instantiate a Name with null optional properties`() {
    val name = SharedHelper.name(nonLatinName = null, pseudonyms = null)

    assertThat(name).isNotNull
    assertThat(name.nonLatinName).isNull()
    assertThat(name.pseudonyms).isNull()
  }
}
