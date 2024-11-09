package alvarx4z.medialibrary.domain.model.book

import alvarx4z.medialibrary.domain.model.shared.professional.Birth
import alvarx4z.medialibrary.domain.model.shared.professional.Death
import alvarx4z.medialibrary.domain.model.shared.professional.Name
import alvarx4z.medialibrary.domain.model.shared.professional.Professional

class Author(name: Name, birth: Birth, death: Death?) : Professional(name, birth, death)
