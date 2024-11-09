package alvarx4z.medialibrary

import alvarx4z.medialibrary.domain.shared.Country
import alvarx4z.medialibrary.domain.shared.Cover
import alvarx4z.medialibrary.domain.shared.Summary
import alvarx4z.medialibrary.domain.shared.URL
import alvarx4z.medialibrary.domain.shared.invariants.NotEmptyString
import alvarx4z.medialibrary.domain.shared.professional.*
import java.time.LocalDate
import java.time.Month

object SharedHelper {
  private const val NAME_VALUE = "Stephen King"
  private const val FULL_NAME_VALUE = "Stephen Edwin King"
  private const val NON_LATIN_NAME_VALUE = "スティーヴン・キング"
  private const val FIRST_PSEUDONYM_VALUE = "Richard Bachman"
  private const val SECOND_PSEUDONYM_VALUE = "John Swithen"
  private const val THIRD_PSEUDONYM_VALUE = "Beryl Evans"
  private const val BIRTH_YEAR_VALUE = 1947
  private const val BIRTH_DAY_VALUE = 21
  private const val DEATH_YEAR_VALUE = 2024
  private const val DEATH_DAY_VALUE = 17
  private const val CITY_VALUE = "Portland"
  private const val URL_VALUE =
    "https://upload.wikimedia.org/wikipedia/commons/e/e3/Stephen_King%2C_Comicon.jpg"
  private const val COVER_URL_VALUE =
    "https://m.media-amazon.com/images/I/81Q-cK3hDmL._AC_UF894,1000_QL80_.jpg"
  private const val SUMMARY_VALUE = "After thousands of years of expansion and conquest..."

  private fun firstName(firstName: String = NAME_VALUE) = NotEmptyString(firstName)

  private fun lastName(lastName: String = FULL_NAME_VALUE) = NotEmptyString(lastName)

  private fun nonLatinName(lastName: String = NON_LATIN_NAME_VALUE) = NotEmptyString(lastName)

  private fun pseudonym() =
    listOf(
      NotEmptyString(FIRST_PSEUDONYM_VALUE),
      NotEmptyString(SECOND_PSEUDONYM_VALUE),
      NotEmptyString(THIRD_PSEUDONYM_VALUE),
    )

  fun name(
    firstName: NotEmptyString = firstName(),
    lastName: NotEmptyString = lastName(),
    nonLatinName: NotEmptyString? = nonLatinName(),
    pseudonyms: List<NotEmptyString>? = pseudonym(),
  ) = Name(firstName, lastName, nonLatinName, pseudonyms)

  fun birthDate(
    year: Int = BIRTH_YEAR_VALUE,
    month: Month = Month.SEPTEMBER,
    day: Int = BIRTH_DAY_VALUE,
  ) = Date(LocalDate.of(year, month, day))

  private fun city(value: String = CITY_VALUE) = NotEmptyString(value)

  fun location(city: NotEmptyString = city(), country: Country = Country.UNITED_STATES) =
    Location(city, country)

  fun birth(date: Date = birthDate(), location: Location = location()) = Birth(date, location)

  private fun deathDate(
    year: Int = DEATH_YEAR_VALUE,
    month: Month = Month.JULY,
    day: Int = DEATH_DAY_VALUE,
  ) = Date(LocalDate.of(year, month, day))

  fun death(date: Date = deathDate(), location: Location = location()) = Death(date, location)

  fun professional(
    name: Name = name(),
    profession: List<Profession> = listOf(Profession.WRITER),
    birth: Birth = birth(),
    death: Death? = death(),
  ) = Professional(name, profession, birth, death)

  fun url(resource: NotEmptyString = NotEmptyString(URL_VALUE)) = URL(resource)

  fun cover(resource: URL = url(NotEmptyString(COVER_URL_VALUE))) = Cover(resource)

  fun summary(value: NotEmptyString = NotEmptyString(SUMMARY_VALUE)) = Summary(value)
}
