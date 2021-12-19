DROP TABLE IF EXISTS reservation;

CREATE TABLE reservation (
    reservation_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    actual_date DATE NOT NULL,
    init_date DATE NOT NULL,
    final_date DATE NOT NULL,
    pick_up_time TIME NOT NULL,
    drop_off_time TIME NOT NULL,
    office_code VARCHAR (10) NOT NULL,
    office_return_code VARCHAR (10) NOT NULL,
    car_category VARCHAR (15) NOT NULL,
    top_Insurance BOOLEAN ,
    tire_and_glass_protection BOOLEAN,
    customer_id BIGINT,
    CONSTRAINT FK_reservationCustomers FOREIGN KEY (customer_id) REFERENCES customers(customer_id)


);