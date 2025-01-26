-- SCHEMA
CREATE SCHEMA IF NOT EXISTS book;
SET SCHEMA book;

-- TABLES
CREATE TABLE IF NOT EXISTS book.authors(
    id                  SMALLINT PRIMARY KEY,
    name                VARCHAR NOT NULL,
    full_name           VARCHAR DEFAULT NULL,
    non_latin_name      VARCHAR DEFAULT NULL,
    birth_date          DATE DEFAULT NULL,
    birth_city          VARCHAR DEFAULT NULL,
    birth_region        VARCHAR DEFAULT NULL,
    birth_country       VARCHAR DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS book.short_stories(
    id                  SMALLINT PRIMARY KEY,
    original_title      VARCHAR NOT NULL,
    english_title       VARCHAR DEFAULT NULL,
    spanish_title       VARCHAR DEFAULT NULL,
    romanized_title     VARCHAR DEFAULT NULL,
    original_year       VARCHAR(4) DEFAULT NULL,
    genre               VARCHAR ARRAY NOT NULL,
    main_saga           VARCHAR DEFAULT NULL,
    sub_saga            VARCHAR DEFAULT NULL,
    rating              SMALLINT NOT NULL,
    summary             VARCHAR DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS book.books(
    isbn                VARCHAR(13) PRIMARY KEY,
    legacy_isbn         VARCHAR(10) DEFAULT NULL,
    original_title      VARCHAR NOT NULL,
    english_title       VARCHAR DEFAULT NULL,
    spanish_title       VARCHAR DEFAULT NULL,
    romanized_title     VARCHAR DEFAULT NULL,
    original_year       VARCHAR(4) DEFAULT NULL,
    genre               VARCHAR ARRAY NOT NULL,
    main_saga           VARCHAR DEFAULT NULL,
    sub_saga            VARCHAR DEFAULT NULL,
    number_saga         SMALLINT DEFAULT NULL,
    page_count          SMALLINT NOT NULL,
    rating              SMALLINT NOT NULL,
    cover_url           VARCHAR DEFAULT NULL,
    summary             VARCHAR DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS book.short_stories_authors(
    short_stories_id    VARCHAR(13),
    author_id           SMALLINT,
    PRIMARY KEY (short_stories_id, author_id),
    CONSTRAINT fk_short_stories_id FOREIGN KEY (short_stories_id) REFERENCES book.short_stories(id),
    CONSTRAINT fk_authors_id_short_stories FOREIGN KEY (author_id) REFERENCES book.authors(id)
);

CREATE TABLE IF NOT EXISTS book.books_authors(
    book_isbn VARCHAR(13),
    author_id SMALLINT,
    PRIMARY KEY (book_isbn, author_id),
    CONSTRAINT fk_books_isbn FOREIGN KEY (book_isbn) REFERENCES book.books(isbn),
    CONSTRAINT fk_authors_id_books FOREIGN KEY (author_id) REFERENCES book.authors(id)
);

-- INDEXES
CREATE INDEX authors_name ON book.authors(name);
CREATE INDEX authors_birth_country ON book.authors(birth_country);

CREATE INDEX short_stories_original_title ON book.books(original_title);
CREATE INDEX short_stories_english_title ON book.books(english_title);
CREATE INDEX short_stories_spanish_title ON book.books(spanish_title);
CREATE INDEX short_stories_original_year ON book.books(original_year);
CREATE INDEX short_stories_genre ON book.books(genre);
CREATE INDEX short_stories_main_saga ON book.books(main_saga);
CREATE INDEX short_stories_sub_saga ON book.books(sub_saga);
CREATE INDEX short_stories_rating ON book.books(rating);

CREATE INDEX books_original_title ON book.books(original_title);
CREATE INDEX books_english_title ON book.books(english_title);
CREATE INDEX books_spanish_title ON book.books(spanish_title);
CREATE INDEX books_original_year ON book.books(original_year);
CREATE INDEX books_genre ON book.books(genre);
CREATE INDEX books_main_saga ON book.books(main_saga);
CREATE INDEX books_sub_saga ON book.books(sub_saga);
CREATE INDEX books_rating ON book.books(rating);

-- INSERT AUTHORS
INSERT INTO book.authors
VALUES (
    0,
    'Unknown',
    NULL,
    NULL,
    NULL,
    NULL,
    NULL,
    NULL
);

INSERT INTO book.authors
VALUES (
    1,
    'Several',
    NULL,
    NULL,
    NULL,
    NULL,
    NULL,
    NULL
);

INSERT INTO book.authors
VALUES (
    2,
    'Bryan Ansell',
    'Bryan Charles Ansell',
    NULL,
    '1955-10-11',
    NULL,
    'England',
    'United Kingdom'
);

INSERT INTO book.authors
VALUES (
    3,
    'William King',
    NULL,
    NULL,
    '1959-12-07',
    NULL,
    'Scotland',
    'United Kingdom'
);

INSERT INTO book.authors
VALUES (
    4,
    'Ian Watson',
    NULL,
    NULL,
    '1943-04-20',
    NULL,
    'England',
    'United Kingdom'
);

INSERT INTO book.authors
VALUES (
    5,
    'Storm Constantine',
    NULL,
    NULL,
    '1956-10-12',
    'Stafford',
    'England',
    'United Kingdom'
);

INSERT INTO book.authors
VALUES (
    6,
    'Charles Stross',
    'Charles David George Stross',
    NULL,
    '1964-10-18',
    'Leeds',
    'England',
    'United Kingdom'
);

INSERT INTO book.authors
VALUES (
    7,
    'Neil McIntosh',
    NULL,
    NULL,
    NULL,
    NULL,
    NULL,
    NULL
);

INSERT INTO book.authors
VALUES (
    8,
    'Dan Abnett',
    'Daniel P. Abnett',
    NULL,
    '1965-10-12',
    'Rochester',
    'England',
    'United Kingdom'
);

INSERT INTO book.authors
VALUES (
    9,
    'Gav Thorpe',
    'Gavin Thorpe',
    NULL,
    NULL,
    NULL,
    NULL,
    'United Kingdom'
);

INSERT INTO book.authors
VALUES (
    10,
    'Graham McNeill',
    NULL,
    NULL,
    NULL,
    NULL,
    NULL,
    'United Kingdom'
);

-- INSERT SHORT STORIES
INSERT INTO book.short_stories
VALUES (
    1,
    'Deathwing',
    'Deathwing',
    'Deathwing',
    'Deathwing',
    '1990',
    ('Science Fiction'),
    'Warhammer 40,000',
    'Dark Angels',
    5,
    'Dark Angels Sergeant Ezekiel returns to his home world to recruit new battle-brothers for the Chapter, but finds his people dead and their villages burned. Discovering an insidious alien threat behind the destruction, Ezekiel reclaims his birth-name of Cloud Runner and undergoes the Rite of the Deathwing, beginning a crusade that will leave a mark on the history of the Dark Angels Chapter.'
);

-- INSERT BOOKS
INSERT INTO book.books
VALUES (
    '9780743411714',
    '0743411714',
    'Deathwing',
    'Deathwing',
    'Deathwing',
    'Deathwing',
    '1990',
    ('Science Fiction'),
    'Warhammer 40,000',
    NULL,
    NULL,
    288,
    5,
    'https://m.media-amazon.com/images/I/51qk0F8AG+L.jpg',
    'The Deathwing are the secretive inner circle of the most vigilant and zealous of the Emperor''s warriors, the Dark Angels. They alone bear the truth of the hidden shame that taints them. This gripping collection is set in the stark and brutal universe of Warhammer 40,000, and stretch from the exploits of the lethal agents of the Officio Assassinorum to the babbling of incarcerated lunatics.'
);

-- INSERT SHORT STORIES | AUTHORS
INSERT INTO book.short_stories_authors VALUES (1, 2);
INSERT INTO book.short_stories_authors VALUES (1, 3);

-- INSERT BOOKS | AUTHORS
INSERT INTO book.books_authors VALUES ('9780743411714', 2);
INSERT INTO book.books_authors VALUES ('9780743411714', 3);
INSERT INTO book.books_authors VALUES ('9780743411714', 4);
INSERT INTO book.books_authors VALUES ('9780743411714', 5);
INSERT INTO book.books_authors VALUES ('9780743411714', 6);
INSERT INTO book.books_authors VALUES ('9780743411714', 7);
INSERT INTO book.books_authors VALUES ('9780743411714', 8);
INSERT INTO book.books_authors VALUES ('9780743411714', 9);
INSERT INTO book.books_authors VALUES ('9780743411714', 10);
