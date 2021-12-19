DROP TABLE IF EXISTS customers;

CREATE TABLE customers (
                        customer_id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        customer_name VARCHAR (35) NOT NULL,
                        customer_last_name VARCHAR (35) NOT NULL,
                        customer_phone_number VARCHAR (25) NOT NULL,
                        customer_email VARCHAR (35) NOT NULL,
                        customer_address VARCHAR (75) NOT NULL,
                        customer_postal_code VARCHAR (15) NOT NULL,
                        customer_city VARCHAR (35) NOT NULL,
                        customer_country VARCHAR (35) NOT NULL
);

INSERT INTO customers ( customer_name, customer_last_name, customer_phone_number
                        , customer_email, customer_address, customer_postal_code
                        , customer_city, customer_country)  VALUES
                                     ('Arturs','Peterons','+37129117777','arturs@gmail.com','Rue Du fauburg','L-6840','Mactum','Luxembourg'),
                                     ('Janis','Berzins', '+37259846789','berzins@gmail.com','Brivibas iela ', 'LV-1010','Riga','Latvia' ),
                                     ('Dainis','Kalnins', '+49857847777','kalnins@gmail.com','trier strasse ', '548785','Temmels','Germany' );