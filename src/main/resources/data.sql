DROP TABLE IF EXISTS insurance;
--DROP TABLE IF EXISTS 'customer';

CREATE TABLE insurance(
customer_id int NOT NULL,
insurance_number int AUTO_INCREMENT PRIMARY KEY,
insurance_type varchar(250) NOT NULL,
insured_amount int NOT NULL,
insurance_end_date DATE DEFAULT CURDATE()
);
--CREATE TABLE 'customer'(
--'customer_id' int NOT NULL
--);

INSERT INTO insurance(customer_id , insurance_type , insured_amount , insurance_end_date) VALUES (1, 'VEHICLE INSURANCE', 99000, CURDATE()+365);

INSERT INTO insurance(customer_id , insurance_type , insured_amount , insurance_end_date) VALUES (1, 'HOME INSURANCE', 557000, CURDATE()+100);

INSERT INTO insurance(customer_id , insurance_type , insured_amount , insurance_end_date) VALUES (2, 'TERM INSURANCE', 458000, CURDATE()+1000);

INSERT INTO insurance(customer_id , insurance_type , insured_amount , insurance_end_date) VALUES (2, 'TRAVEL INSURANCE', 359888, CURDATE()+90);