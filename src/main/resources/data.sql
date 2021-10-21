DROP TABLE IF EXISTS clients;
CREATE TABLE clients (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  company_name VARCHAR(250) NOT NULL,
  contact_name VARCHAR(250) NOT NULL,
  contact_last_name VARCHAR(250) NOT NULL,
  phone_number INT
);

INSERT INTO clients (company_name, contact_name, contact_last_name, phone_number) VALUES
  ('Facebook', 'Mark', 'Zuckerberg', 2091234),
  ('Microsoft', 'Bill', 'Gates', 30654789),
  ('Amazon', 'Jeff', 'Bezos', 7851245);