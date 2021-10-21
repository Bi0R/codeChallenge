DROP TABLE IF EXISTS clients;
CREATE TABLE clients (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  company_name VARCHAR(250) NOT NULL,
  contact_name VARCHAR(250) NOT NULL,
  contact_last_name VARCHAR(250) NOT NULL,
  phone_number INT
);