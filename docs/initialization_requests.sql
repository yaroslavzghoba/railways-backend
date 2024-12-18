-- Таблиця поїздів
CREATE TABLE train_numbers (
    id SERIAL PRIMARY KEY,
    number VARCHAR(5) UNIQUE NOT NULL
);

-- Таблиця залізничних станцій
CREATE TABLE stations (
    id SERIAL PRIMARY KEY,
    name VARCHAR(64) NOT NULL,
    address VARCHAR(64)
);

-- Таблиця маршрутів
CREATE TABLE routes (
    id SERIAL PRIMARY KEY,
    train_number_id BIGINT REFERENCES train_numbers(id)
);

-- Таблиця зупинок поїздів
CREATE TABLE train_stops (
    id SERIAL PRIMARY KEY,
    expected_arrival_time TIMESTAMP,
    actual_arrival_time TIMESTAMP,
    expected_departure_time TIMESTAMP,
    actual_departure_time TIMESTAMP,
    route_id BIGINT REFERENCES routes(id),
    station_id BIGINT REFERENCES stations(id),
    expected_station_platform SMALLINT,
    actual_station_platform SMALLINT
);

-- Таблиця подій
CREATE TABLE events (
    id SERIAL PRIMARY KEY,
    event VARCHAR(128)
);

-- Таблиця подій маршрутів
CREATE TABLE route_events (
    id SERIAL PRIMARY KEY,
    event_id BIGINT REFERENCES events(id),
    route_id BIGINT REFERENCES routes(id)
);