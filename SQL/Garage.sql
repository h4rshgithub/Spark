create DATABASE garage;
USE garage;
create table customer(
    id int AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(30),
    phone VARCHAR(15)
);


create table vehicles(
    id int AUTO_INCREMENT PRIMARY KEY,
    customer_id int,
    number_plate VARCHAR(15),
    model VARCHAR(20) ,
    FOREIGN KEY  (customer_id) REFERENCES customer(id)

);

create table services(
    id int AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(20),
    cost DOUBLE
);

insert INTO services (description , cost) VALUES
('oil change' , 1500),
('Engine Repair' , 5000),
('Tyre Replacement' ,3000),
('Washing' ,100);

CREATE TABLE invoices(
    id int AUTO_INCREMENT PRIMARY KEY,
    customer_id int ,
    vehicle_id int ,
    service_id int ,
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY  (customer_id) REFERENCES customer(id),
    FOREIGN KEY  (vehicle_id) REFERENCES vehicles(id),
    FOREIGN KEY  (service_id) REFERENCES services(id)

)



