DROP TABLE IF EXISTS customers;
CREATE TABLE customers (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  phone_number INT
);

INSERT INTO customers (name, last_name, phone_number) VALUES
  ('Mark', 'Zuckerberg', 2091234),
  ('Bill', 'Gates', 30654789),
  ('Jeff', 'Bezos', 7851245);