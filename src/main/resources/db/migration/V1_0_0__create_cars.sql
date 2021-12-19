DROP TABLE IF EXISTS cars;

CREATE TABLE cars (
                    car_id     BIGINT AUTO_INCREMENT PRIMARY KEY,
                    car_make  VARCHAR(50) NOT NULL,
                    car_model VARCHAR(60) NOT NULL,
                    transmission VARCHAR (9) NOT NULL,
                    ac        BOOLEAN,
                    car_seats INT         NOT NULL,
                    car_doors INT         NOT NULL,
                    car_photo VARCHAR(90)
);

INSERT INTO cars ( car_make, car_model,transmission, ac, car_seats, car_doors, car_photo) VALUES
                    ('Mercedes', 'G350','AUTOMATIC','true',5,5,'mercedes_g350_black.jpg'),
                    ('Mercedes', 'GLS400','AUTOMATIC','true',5,5,'mercedes_gls400_red.jpg'),
                    ('Mercedes', 'V CLASS','AUTOMATIC','true',5,7,'mercedes_vClass_black.jpg'),
                    ('Volkswagen', 'UP','MANUAL','false',5,4,'up_lrg.jpg'),
                    ('Nissan', 'Juke','MANUAL','false',3,5,'juke_lrg.jpg');