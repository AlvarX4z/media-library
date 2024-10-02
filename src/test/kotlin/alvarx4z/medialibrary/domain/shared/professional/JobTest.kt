package alvarx4z.medialibrary.domain.shared.professional

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class JobTest {
    @Test
    fun `Should match the Job enum entry with its String value`() {
        assertThat(Job.WRITER.value).isEqualTo("Writer")
    }

    @Test
    fun `Should match the size of listed Job to 1`() {
        assertThat(Job.entries.size).isEqualTo(1)
    }

    @Test
    fun `Should throw IllegalArgumentException when a Job doesn't exist`() {
        assertThrows<IllegalArgumentException> { Job.valueOf("Fake Job") }
    }
}
