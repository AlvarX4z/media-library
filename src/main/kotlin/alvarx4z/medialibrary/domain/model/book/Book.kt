package alvarx4z.medialibrary.domain.model.book

import alvarx4z.medialibrary.domain.model.book.series.Series
import alvarx4z.medialibrary.domain.model.shared.Cover
import alvarx4z.medialibrary.domain.model.shared.Genre
import alvarx4z.medialibrary.domain.model.shared.Summary
import alvarx4z.medialibrary.domain.model.shared.Title

data class Book(
  val isbn: ISBN,
  val title: Title,
  val authors: List<Author>,
  val publicationDate: PublicationDate,
  val pageCount: PageCount,
  val genre: Genre,
  val series: Series?,
  val cover: Cover,
  val summary: Summary?,
)
