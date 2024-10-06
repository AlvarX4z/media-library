package alvarx4z.medialibrary.domain.shared.professional

open class Professional(
  val name: Name,
  val profession: List<Profession>,
  val birth: Birth,
  val death: Death?,
)
