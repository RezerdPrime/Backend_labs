CREATE TABLE IF NOT EXISTS Users (
    id bigserial,
    username varchar(255),
    password varchar(255),
    CONSTRAINT user_id PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS To_do (
    id bigserial,
    title varchar(255),
    text varchar(255),
    user_id bigserial
)