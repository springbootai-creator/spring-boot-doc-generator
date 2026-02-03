CREATE TABLE IF NOT EXISTS person (id SERIAL PRIMARY KEY, full_name VARCHAR(255), email VARCHAR(255), tax_id VARCHAR(50));
CREATE TABLE IF NOT EXISTS investment (id SERIAL PRIMARY KEY, type VARCHAR(100), amount_usd DOUBLE, investment_date DATE, person_id INTEGER REFERENCES person(id));
INSERT INTO person (full_name, email, tax_id) VALUES ('John Doe', 'john.doe@example.com', '123456789');
INSERT INTO investment (type, amount_usd, investment_date, person_id) VALUES ('Stocks', 1000.00, '2023-01-01', 1);
INSERT INTO investment (type, amount_usd, investment_date, person_id) VALUES ('Bonds', 500.00, '2023-02-01', 1);
