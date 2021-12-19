DROP TABLE IF EXISTS car_category;

CREATE TABLE car_category(
    car_category_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    car_category VARCHAR (10) NOT NULL,
    base_price DOUBLE,
    base_price_with_insurance  DOUBLE,
    base_price_with_top_insurance DOUBLE,
    price_tire_and_glass_protection DOUBLE);