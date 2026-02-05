CREATE TABLE movies
(
    id              BIGSERIAL PRIMARY KEY,
    imdb_id         VARCHAR(20) UNIQUE NOT NULL,
    title           VARCHAR(255)       NOT NULL,
    director        VARCHAR(255),
    release_year    INT,
    runtime_minutes INT,
    plot            TEXT
);