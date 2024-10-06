package alvarx4z.medialibrary

import alvarx4z.medialibrary.domain.shared.Country
import alvarx4z.medialibrary.domain.shared.URL
import alvarx4z.medialibrary.domain.shared.invariant.NotEmptyString
import alvarx4z.medialibrary.domain.shared.professional.*
import java.time.LocalDate
import java.time.Month

object SharedHelper {
  private const val FIRST_NAME_VALUE = "Stephen Edwin"
  private const val LAST_NAME_VALUE = "King"
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

  private fun firstName(firstName: String = FIRST_NAME_VALUE) = NotEmptyString(firstName)

  private fun lastName(lastName: String = LAST_NAME_VALUE) = NotEmptyString(lastName)

  private fun pseudonym() =
    listOf(
      NotEmptyString(FIRST_PSEUDONYM_VALUE),
      NotEmptyString(SECOND_PSEUDONYM_VALUE),
      NotEmptyString(THIRD_PSEUDONYM_VALUE),
    )

  fun name(
    firstName: NotEmptyString = firstName(),
    lastName: NotEmptyString = lastName(),
    pseudonyms: List<NotEmptyString>? = pseudonym(),
  ) = Name(firstName = firstName, lastName = lastName, pseudonyms = pseudonyms)

  fun birthDate(
    year: Int = BIRTH_YEAR_VALUE,
    month: Month = Month.SEPTEMBER,
    day: Int = BIRTH_DAY_VALUE,
  ) = Date(LocalDate.of(year, month, day))

  private fun city(value: String = CITY_VALUE) = NotEmptyString(value)

  fun location(city: NotEmptyString = city(), country: Country = Country.UNITED_STATES) =
    Location(city = city, country = country)

  fun birth(date: Date = birthDate(), location: Location = location()) =
    Birth(date = date, location = location)

  private fun deathDate(
    year: Int = DEATH_YEAR_VALUE,
    month: Month = Month.JULY,
    day: Int = DEATH_DAY_VALUE,
  ) = Date(LocalDate.of(year, month, day))

  fun death(date: Date = deathDate(), location: Location = location()) =
    Death(date = date, location = location)

  fun professional(
    name: Name = name(),
    profession: List<Profession> = listOf(Profession.WRITER),
    birth: Birth = birth(),
    death: Death? = death(),
  ) = Professional(name = name, profession = profession, birth = birth, death = death)

  fun url(resource: NotEmptyString = NotEmptyString(URL_VALUE)) = URL(resource)
}
