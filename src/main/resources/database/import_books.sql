-- SCHEMA
CREATE SCHEMA IF NOT EXISTS book;
SET SCHEMA book;

-- TABLES
CREATE TABLE IF NOT EXISTS book.authors(
    id                  SMALLINT PRIMARY KEY,
    name                VARCHAR NOT NULL,
    full_name           VARCHAR DEFAULT NULL,
    non_latin_name      VARCHAR DEFAULT NULL,
    pseudonyms          VARCHAR ARRAY DEFAULT NULL,
    birth_year          VARCHAR DEFAULT NULL,
    birth_city          VARCHAR DEFAULT NULL,
    birth_region        VARCHAR DEFAULT NULL,
    birth_country       VARCHAR DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS book.books(
    isbn                VARCHAR(13) PRIMARY KEY,
    legacy_isbn         VARCHAR(10) DEFAULT NULL,
    original_title      VARCHAR NOT NULL,
    english_title       VARCHAR DEFAULT NULL,
    spanish_title       VARCHAR DEFAULT NULL,
    romanized_title     VARCHAR DEFAULT NULL,
    original_year       VARCHAR(4) DEFAULT NULL,
    type                VARCHAR NOT NULL,
    genre               VARCHAR ARRAY NOT NULL,
    main_saga           VARCHAR DEFAULT NULL,
    sub_saga            VARCHAR DEFAULT NULL,
    number_saga         SMALLINT DEFAULT NULL,
    page_count          SMALLINT NOT NULL,
    rating              SMALLINT NOT NULL,
    cover_url           VARCHAR DEFAULT NULL,
    summary             VARCHAR DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS book.books_authors(
    book_isbn VARCHAR(13),
    author_id SMALLINT,
    PRIMARY KEY (book_isbn, author_id),
    CONSTRAINT fk_books_isbn FOREIGN KEY (book_isbn) REFERENCES book.books(isbn),
    CONSTRAINT fk_authors_id FOREIGN KEY (author_id) REFERENCES book.authors(id)
);

-- INDEXES
CREATE INDEX authors_name ON book.authors(name);
CREATE INDEX authors_birth_country ON book.authors(birth_country);

CREATE INDEX books_original_title ON book.books(original_title);
CREATE INDEX books_english_title ON book.books(english_title);
CREATE INDEX books_spanish_title ON book.books(spanish_title);
CREATE INDEX books_original_year ON book.books(original_year);
CREATE INDEX books_type ON book.books(type);
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
    NULL,
    NULL
);

INSERT INTO book.authors
VALUES (
    2,
    'Dan Abnett',
    'Daniel P. Abnett',
    NULL,
    NULL,
    '1965',
    'Rochester',
    'England',
    'United Kingdom'
);

INSERT INTO book.authors
VALUES (
    3,
    'Graham McNeill',
    NULL,
    NULL,
    NULL,
    '1971',
    'Glasgow',
    'Scotland',
    'United Kingdom'
);

INSERT INTO book.authors
VALUES (
    4,
    'Ben Counter',
    NULL,
    NULL,
    NULL,
    '1979',
    'Cambridge',
    'England',
    'United Kingdom'
);

INSERT INTO book.authors
VALUES (
    5,
    'James Swallow',
    NULL,
    NULL,
    NULL,
    '1970',
    'London',
    'England',
    'United Kingdom'
);

INSERT INTO book.authors
VALUES (
    6,
    'Mitchel Scanlon',
    NULL,
    NULL,
    NULL,
    NULL,
    NULL,
    'Wales',
    'United Kingdom'
);

-- INSERT BOOKS
INSERT INTO book.books
VALUES (
    '9781849706179',
    '1849706174',
    'Horus Rising',
    'Horus Rising',
    'Horus, Señor de la Guerra',
    NULL,
    '2006',
    'Book',
    ('Science Fiction', 'Space Opera'),
    'Warhammer 40,000',
    'The Horus Heresy',
    1,
    416,
    100,
    'https://m.media-amazon.com/images/I/81Q-cK3hDmL.jpg',
    'At the dawn of the 31st millennium, the Imperium of Man has reasserted its dominance over the galaxy. It is a golden age of rediscovery and conquest, and the Emperor''s Great Crusade has placed his superhuman primarch sons at the head of the mighty Space Marine Legions--the most powerful military force ever assembled. Newly promoted to serve as the Emperor''s Warmaster, the idealistic Horus now stands above his brothers, even as the Crusade enters what must surely be its final stages and dark, cosmic truths begin to reveal themselves. Far beyond the alien threat of malignant xenos breeds or rogue human civilisations, a war now looms that could threaten the final extinction of mankind.'
);

INSERT INTO book.books
VALUES (
    '9781844163700',
    '1844163709',
    'False Gods',
    'False Gods',
    'Falsos Dioses',
    NULL,
    '2006',
    'Book',
    ('Science Fiction', 'Space Opera'),
    'Warhammer 40,000',
    'The Horus Heresy',
    2,
    406,
    100,
    'https://m.media-amazon.com/images/I/61l5uzpfGwL.jpg',
    'The human Imperium stands at its height of glory - thousands of worlds have been brought to heel by the conquering armies of mankind. At the peak of his powers, Warmaster Horus wields absolute control - but can even he resist the corrupting whispers of Chaos?'
);

INSERT INTO book.books
VALUES (
    '9781849706223',
    '1849706220',
    'Galaxy in Flames',
    'Galaxy in Flames',
    'La Galaxia en Llamas',
    NULL,
    '2006',
    'Book',
    ('Science Fiction', 'Space Opera'),
    'Warhammer 40,000',
    'The Horus Heresy',
    3,
    416,
    100,
    'https://m.media-amazon.com/images/I/81bVk3IbVpL.jpg',
    'Having recovered from his grievous injuries, Warmaster Horus leads the triumphant Imperial forces against the rebel world of Isstvan III. Though the rebels are swiftly crushed, Horus''s treachery is finally revealed when the planet is razed by virus bombs and Space Marines turn on their battle-brothers in the most bitter struggle imaginable.'
);

INSERT INTO book.books
VALUES (
    '9781849708036',
    '1849708037',
    'The Flight of the Eisenstein',
    'The Flight of the Eisenstein',
    'La Huida de la Eisenstein',
    NULL,
    '2007',
    'Book',
    ('Science Fiction', 'Space Opera'),
    'Warhammer 40,000',
    'The Horus Heresy',
    4,
    416,
    100,
    'https://m.media-amazon.com/images/I/81imY16u8DL.jpg',
    'Having witnessed the events on Istvaan III, Deathguard Captain Garro seizes a ship and heads to Terra to warn the Emperor of Horus'' treachery. But the fleeing Eisenstein is damaged by enemy fire, and becomes stranded in the warp. Can Garro and his men survive the depredations of Chaos and get his warning to Terra in time?'
);

INSERT INTO book.books
VALUES (
    '9781849708043',
    '1849708045',
    'Fulgrim',
    'Fulgrim',
    'Fulgrim',
    NULL,
    '2007',
    'Book',
    ('Science Fiction', 'Space Opera'),
    'Warhammer 40,000',
    'The Horus Heresy',
    5,
    512,
    100,
    'https://m.media-amazon.com/images/I/51HHVXEq9LL.jpg',
    'Under the command of the newly appointed Warmaster Horus, the Great Crusade continues. Fulgrim, Primarch of the Emperor''s Children, leads his warriors into battle against a vile alien foe, unaware of the darker forces that have already set their sights upon the Imperium of Man. Loyalties are tested, and every murderous whim indulged as the Emperor''s Children take their first steps down the road to true corruption – a road that will ultimately lead them to the killing fields of Isstvan V...'
);

INSERT INTO book.books
VALUES (
    '9781849708142',
    '1849708142',
    'Descent of Angels',
    'Descent of Angels',
    'El Descenso de los Ángeles',
    NULL,
    '2007',
    'Book',
    ('Science Fiction', 'Space Opera'),
    'Warhammer 40,000',
    'The Horus Heresy',
    6,
    416,
    100,
    'https://m.media-amazon.com/images/I/81BjfYOljcL.jpg',
    'The planet of Caliban exists much as it has for thousands of years – the knightly orders protect the common people, fighting back the beasts that lurk in the depths of the seemingly endless forests. Young Zahariel and Nemiel aspire to join the greatest of the orders, led by the example of mighty Lion El''Jonson and his vision of a peaceful and unified world. But the coming of the Imperium brings new concerns and a new destiny for the Lion as part of the Great Crusade, and the sons of Caliban must decide if they will follow him to glory among the stars.'
);

INSERT INTO book.books
VALUES (
    '9781849708067',
    '1849708061',
    'Legion',
    'Legion',
    'Legión',
    NULL,
    '2008',
    'Book',
    ('Science Fiction', 'Space Opera'),
    'Warhammer 40,000',
    'The Horus Heresy',
    7,
    416,
    100,
    'https://m.media-amazon.com/images/I/81i8k5l5zWL.jpg',
    'A Great War is coming, and it will engulf the Imperium of Man. The Space Marines of the Alpha Legion, the last and most secretive of all the Astartes brotherhoods, arrive on a heathen world to support the Imperial Army in a pacification campaign against strange and uncanny forces. But what drives the Alpha Legion? Can they be trusted, and what side will they choose when the Heresy begins? Loyalties are put to the test, the cunning schemes of an alien intelligence are revealed, and the fate of mankind hangs in the balance.'
);

INSERT INTO book.books
VALUES (
    '9781849708074',
    '184970807X',
    'Battle for the Abyss',
    'Battle for the Abyss',
    'Batalla por el Abismo',
    NULL,
    '2008',
    'Book',
    ('Science Fiction', 'Space Opera'),
    'Warhammer 40,000',
    'The Horus Heresy',
    8,
    416,
    100,
    'https://m.media-amazon.com/images/I/7136T1rE5OL.jpg',
    'Now that the news of Horus''s Treachery is in the open, a time of testing has come. Some Legions have already declared allegiance to the Warmaster, while the loyalty of the others lies firmly with the Emperor. As Horus deploys his forces, loyalist Astartes learn that the Wordbearers are sending a fleet to Ultramar, home of the Ultramarines. Unless they can intercept and destroy it, the Ultramarines may suffer a blow from which they will never recover. Battle for the Abyss continues the epic tale of the Horus Heresy, a galactic civil war that threatened to bring about the extinction of humanity.'
);

INSERT INTO book.books
VALUES (
    '9789635891115',
    '9635891113',
    'Mechanicum',
    'Mechanicum',
    'Mechanicum',
    NULL,
    '2008',
    'Book',
    ('Science Fiction', 'Space Opera'),
    'Warhammer 40,000',
    'The Horus Heresy',
    9,
    416,
    100,
    'https://m.media-amazon.com/images/I/61TMp7D4V-L.jpg',
    'As the flames of treachery spread outwards through the Imperium, Horus mobilises those forces who are loyal to him, and plots to subvert or destroy those who stand against him. A battle is being fought for the heart and soul of all the Imperial forces – the Astartes, the Imperial Army, the Titan Legions and more. In this epic story, author Graham McNeill tells the story of the civil war on Mars, and the genesis of the Dark Mechanicum.'
);

INSERT INTO book.books
VALUES (
    '9781849708098',
    '1849708096',
    'Tales of Heresy',
    'Tales of Heresy',
    'Cuentos de la Herejía',
    NULL,
    '2009',
    'Book',
    ('Science Fiction', 'Space Opera'),
    'Warhammer 40,000',
    'The Horus Heresy',
    10,
    416,
    100,
    'https://m.media-amazon.com/images/I/91th6vOTaJL.jpg',
    'It is the 31st millennium, and mankind has spread across the galaxy. When Horus the Warmaster rebelled against the Emperor, the ensuing civil war nearly destroyed the Imperium. War raged across galaxy, pitting Astartes against their battle-brothers in a struggle where death was the only victor. This collection features stories of heroism and tragedy set during this turbulent time, by star Horus Heresy authors Dan Abnett, Graham McNeill, James Swallow and more.'
);

-- INSERT BOOKS|AUTHORS
INSERT INTO book.books_authors VALUES ('9781849706179', 2);
INSERT INTO book.books_authors VALUES ('9781844163700', 3);
INSERT INTO book.books_authors VALUES ('9781849706223', 4);
INSERT INTO book.books_authors VALUES ('9781849708036', 5);
INSERT INTO book.books_authors VALUES ('9781849708043', 3);
INSERT INTO book.books_authors VALUES ('9781849708142', 6);
INSERT INTO book.books_authors VALUES ('9781849708067', 2);
INSERT INTO book.books_authors VALUES ('9781849708074', 4);
INSERT INTO book.books_authors VALUES ('9789635891115', 3);
INSERT INTO book.books_authors VALUES ('9781849708098', 1);
