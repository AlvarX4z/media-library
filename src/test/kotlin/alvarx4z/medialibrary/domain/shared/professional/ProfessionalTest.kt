package alvarx4z.medialibrary.domain.shared.professional

import alvarx4z.medialibrary.SharedHelper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfessionalTest {
  @Test
  fun `should instantiate a full, valid Professional`() {
    val professional = SharedHelper.professional()

    assertThat(professional).isInstanceOf(Professional::class.java)
    assertThat(professional.name).isInstanceOf(Name::class.java)
    assertThat(professional.birth).isInstanceOf(Birth::class.java)
    assertThat(professional.death).isInstanceOf(Death::class.java)
  }

  @Test
  fun `should instantiate a valid Professional with null optional properties`() {
    val professional = SharedHelper.professional(death = null)

    assertThat(professional).isNotNull
    assertThat(professional.death).isNull()
  }
}
