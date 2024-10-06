package alvarx4z.medialibrary.domain.book

import alvarx4z.medialibrary.domain.shared.professional.*

class Author(
  name: Name,
  profession: List<Profession> = listOf(Profession.WRITER),
  birth: Birth,
  death: Death?,
) : Professional(name, profession, birth, death)
