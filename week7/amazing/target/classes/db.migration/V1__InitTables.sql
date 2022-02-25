CREATE TABLE customer
(
    id   BIGINT PRIMARY KEY,
    name TEXT NOT NULL,
    age  INT  NOT NULL,
    UNIQUE (name)

);