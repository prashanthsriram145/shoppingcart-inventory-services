insert into category(category_id,category_name) values (1,'Books');
insert into category(category_id,category_name) values (2,'Clothing');

insert into product(product_id,product_name,product_description,product_price,currency,category_id) values ('ABC12345','Thinking in JAVA','This book speaks about Java fundamentals',1000,'Rupees',1);
insert into product(product_id,product_name,product_description,product_price,currency,category_id) values ('ABC12346','Head First JAVA','This book speaks about Java fundamentals in funny way',800,'Rupees',1);
insert into product(product_id,product_name,product_description,product_price,currency,category_id) values ('ABC12347','T2F track pants','T2F boys track pants',400,'Rupees',2);

insert into customer(customer_id,firstname,lastname,addr1,addr2,city,country,zipcode,mobile,email) values('prashanthsriram145','Prashanth','Sriram','9AM-420', 'HBRB Layout I block','Bangalore','India',560043,'9741204293','prashanthsriram145@gmail.com')