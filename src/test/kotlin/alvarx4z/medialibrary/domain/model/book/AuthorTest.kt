package alvarx4z.medialibrary.domain.model.book

import alvarx4z.medialibrary.BookHelper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthorTest {
  @Test
  fun `should instantiate a full, valid Author`() {
    val author = BookHelper.authors().first()

    assertThat(author).isInstanceOf(Author::class.java)
  }

  @Test
  fun `should instantiate a valid Professional with null optional properties`() {
    val author = BookHelper.authors(death = null).first()

    assertThat(author).isNotNull
    assertThat(author.death).isNull()
  }
}
