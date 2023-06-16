CREATE TABLE tb_foods (
	id SERIAL,
   	name VARCHAR(100) NOT NULL,
	price NUMERIC(38,2) NOT NULL,
   	image TEXT,
    PRIMARY KEY (id)
);