package alvarx4z.medialibrary.domain.book

import alvarx4z.medialibrary.domain.shared.professional.*

class Author(name: Name, birth: Birth, death: Death?) : Professional(name, birth, death)
