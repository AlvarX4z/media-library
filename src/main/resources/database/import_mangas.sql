-- SCHEMA
CREATE SCHEMA IF NOT EXISTS manga;
SET SCHEMA manga;

-- TABLES
CREATE TABLE IF NOT EXISTS manga.professionals(
    id                  SMALLINT PRIMARY KEY,
    non_latin_name      VARCHAR NOT NULL,
    name                VARCHAR NOT NULL,
    pseudonyms          VARCHAR ARRAY DEFAULT NULL,
    birth_year          VARCHAR DEFAULT NULL,
    birth_city          VARCHAR DEFAULT NULL,
    birth_region        VARCHAR DEFAULT NULL,
    birth_country       VARCHAR DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS manga.mangas(
    id                  SMALLINT PRIMARY KEY,
    english_title       VARCHAR NOT NULL,
    spanish_title       VARCHAR NOT NULL,
    romanized_title     VARCHAR NOT NULL,
    original_title      VARCHAR NOT NULL,
    writer_id           SMALLINT NOT NULL,
    artist_id           SMALLINT NOT NULL,
    publisher           VARCHAR NOT NULL,
    imprint             VARCHAR NOT NULL,
    magazine            VARCHAR NOT NULL,
    demographic         VARCHAR NOT NULL,
    genre               VARCHAR ARRAY NOT NULL,
    start_date          DATE NOT NULL,
    end_date            DATE DEFAULT NULL,
    status              VARCHAR NOT NULL,
    number_volumes      SMALLINT DEFAULT NULL,
    rating              SMALLINT NOT NULL,
    cover_url           VARCHAR DEFAULT NULL,
    summary             VARCHAR DEFAULT NULL,
    CONSTRAINT fk_mangas_writer FOREIGN KEY (writer_id) REFERENCES manga.professionals(id),
    CONSTRAINT fk_mangas_artist FOREIGN KEY (artist_id) REFERENCES manga.professionals(id)
);

-- INDEXES
CREATE INDEX professionals_birth_city ON manga.professionals(birth_city);
CREATE INDEX professionals_birth_country ON manga.professionals(birth_country);

CREATE INDEX mangas_publisher ON manga.mangas(publisher);
CREATE INDEX mangas_magazine ON manga.mangas(magazine);
CREATE INDEX mangas_demographic ON manga.mangas(demographic);
CREATE INDEX mangas_start_date ON manga.mangas(start_date);
CREATE INDEX mangas_rating ON manga.mangas(rating);

-- INSERT PROFESSIONALS
INSERT INTO manga.professionals
VALUES (
    1,
    'Yukinobu Tatsu',
    '龍幸伸',
    NULL,
    NULL,
    NULL,
    NULL,
    'Japan'
);

-- INSERT MANGAS
INSERT INTO manga.mangas
VALUES (
    1,
    'Dandadan',
    'Dandadan',
    'Dandadan',
    'ダンダダン',
    1,
    1,
    'Shueisha',
    'Jump Comics+',
    'Shōnen Jump+',
    'Shōnen',
    ('Action', 'Romantic Comedy', 'Supernatural Thriller'),
    '2021-04-06',
    NULL,
    'ONGOING',
    NULL,
    3,
    'https://upload.wikimedia.org/wikipedia/en/f/f2/Dandadan_vol._1_cover.jpg',
    'Momo Ayase is a high school girl who believes in ghosts but not aliens, while her fellow highschooler, Ken Takakura, whom Momo nicknames "Okarun", believes in aliens but not ghosts. In a bet to determine who is correct, the two decide to separately visit locations associated with both the extraterrestrial and the occult—Momo visiting the former, and Okarun the latter. Momo is abducted by a group of aliens who accidentally unblock her chakras, enabling latent psychic abilities. Meanwhile, Okarun is possessed by a spirit who takes over his body. By using Momo''s abilities and Okarun''s possessed form, they defeat the aliens together.\n\nThe rest of the story follows the two, as they team up with fellow students, friends, family, and new acquaintances to fight spirits and aliens; the overarching plot themes include retrieval of Okarun''s penis and testicles (kintama) and the development of romantic feelings between Momo and Okarun.'
);
