DROP TABLE IF EXISTS car_category;

CREATE TABLE car_category(
    car_category_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    car_category VARCHAR (10) NOT NULL,
    base_price DOUBLE,
    base_price_with_insurance  DOUBLE,
    base_price_with_top_insurance DOUBLE,
    price_tire_and_glass_protection DOUBLE,
    car_id BIGINT,
    CONSTRAINT FK_car_categoryCars FOREIGN KEY(car_id) REFERENCES cars(car_id));

INSERT INTO car_category (car_category, base_price, base_price_with_insurance
                          , base_price_with_top_insurance, price_tire_and_glass_protection) VALUES
                         ('standart',50.00,75.00,95.00,15.00),
                         ('economy',30.00,45.00,55.00,15.00),
                         ('premium',90.00,1055.00,195.00,35.00);