DROP TABLE IF EXISTS cars;

CREATE TABLE cars (
                    car_id     BIGINT AUTO_INCREMENT PRIMARY KEY,
                    car_category_id BIGINT ,
                    car_make  VARCHAR(50) NOT NULL,
                    car_model VARCHAR(60) NOT NULL,
                    transmission VARCHAR (9) NOT NULL,
                    ac        BOOLEAN,
                    car_seats INT         NOT NULL,
                    car_doors INT         NOT NULL,
                    car_photo VARCHAR(90)


);

INSERT INTO cars (car_category_id, car_make, car_model,transmission, ac, car_seats, car_doors, car_photo) VALUES
                    (3,'Mercedes', 'G350','AUTOMATIC','true',5,5,'mercedes_g350_black.jpg'),
                    (3,'Mercedes', 'GLS400','AUTOMATIC','true',5,5,'mercedes_gls400_red.jpg'),
                    (3,'Mercedes', 'V CLASS','AUTOMATIC','true',5,7,'mercedes_vClass_black.jpg'),
                    (2,'Volkswagen', 'UP','MANUAL','false',5,4,'up_lrg.jpg'),
                    (2,'Nissan', 'Juke','MANUAL','false',3,5,'juke_lrg.jpg'),
                    (1,'BMW','320d','MANUAL','true',5,4,'bmw_3_series_white.jpg');