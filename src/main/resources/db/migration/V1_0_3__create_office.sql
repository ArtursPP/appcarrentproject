DROP TABLE IF EXISTS office;

CREATE TABLE office(
                    office_id          BIGINT AUTO_INCREMENT PRIMARY KEY,
                    office_code        VARCHAR(4)  NOT NULL,
                    office_name        VARCHAR(30) NOT NULL,
                    office_address     VARCHAR(35) NOT NULL,
                    office_post_code VARCHAR(15) NOT NULL,
                    office_city        VARCHAR(35) NOT NULL,
                    office_country     VARCHAR(35) NOT NULL
);

INSERT INTO office ( office_code, office_name
                    , office_address, office_post_code
                    , office_city, office_country) VALUES
                    ('RIX','Riga Airport','Lidosta Riga','LV-1053','Lidosta Riga', 'Latvia'),
                    ('RIX','Riga Center','Brivibas iela 10','LV-1010','Riga', 'Latvia'),
                    ('RIX','Riga Train Station','Stacijas laukums 2','LV-1010','Riga', 'Latvia'),
                    ('VEN','Ventspils','Brivibas iela 5','LV-5410','Ventspils', 'Latvia');