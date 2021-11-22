- Joseph Attieh
- Clara Akiki

# BeautySalon-Database

_Submitted on Dec 2017 for the course COE 418 - Database Systems_

# Requirements:

In this project, we are required to create a database system using Java and SQL. The system should allows non-expert users to perform database commands without having to formulate formal SQL queries. The process required to build a Conceptual Data Model (CDM) then a Logical Data Model (LDM). The user input should be validated at all time and no illegal operations should be performed with the database. 

We chose to create a database application for a local Beauty Salon located in Beirut.

# Notes:
- To setup the database, you can either:
  - Import beautysalon.sql
  
  - Run the following commands:
```
DROP DATABASE BEAUTYSALON;
CREATE DATABASE BeautySalon;
USE BeautySalon;
 
CREATE TABLE STAFF(
staffID CHAR(5) NOT NULL ,
fName VARCHAR(20) NOT NULL,
lName VARCHAR(20) NOT NULL,
staffPhoneNb DECIMAL(8),
address VARCHAR(100) NOT NULL,
gender CHAR CHECK (VALUE IN (‘F’, ‘M’)),
salary DECIMAL(7,2) NOT NULL DEFAULT 800 CHECK (VALUE BETWEEN 800 AND 20000),
position VARCHAR(20) NOT NULL CHECK (VALUE IN("manager", "staff")),
password VARCHAR(20) NOT NULL,
PRIMARY KEY(staffID)
)
;
 
CREATE TABLE SERVICE(
serviceID CHAR(5) NOT NULL,
serviceType VARCHAR(30) NOT NULL,
servicePrice DECIMAL(6,0) NOT NULL CHECK (VALUE > 0),
staffID CHAR(5)   ,
PRIMARY KEY(serviceID),
FOREIGN KEY (staffID) REFERENCES STAFF(staffID) ON DELETE SET NULL ON UPDATE SET NULL
);
 
 
CREATE TABLE CUSTOMER(
custID CHAR(4) NOT NULL,
fName VARCHAR(20) NOT NULL,
lName VARCHAR(20) NOT NULL,
custPhoneNb DECIMAL(8),
address VARCHAR(100) NOT NULL,
gender CHAR CHECK( VALUE IN (‘F’, ‘M’)),
staffId CHAR(5)  ,
PRIMARY KEY(custID),
FOREIGN KEY (staffId) REFERENCES staff(staffID) ON DELETE SET NULL ON UPDATE SET NULL
);
 
 
CREATE TABLE APPOINTMENT(
bookingID CHAR(4) NOT NULL,
bookingDate DATE NOT NULL CHECK (bookingDate >=CURRENT_DATE()),
bookingTime TIME NOT NULL CHECK (bookingTime>=CURRENT_TIME()),
duration DECIMAL(3) CHECK (VALUE BETWEEN 0 AND 180),
staffID CHAR(5) ,
serviceID CHAR(5) ,
custID CHAR(4) ,
PRIMARY KEY(bookingID),
FOREIGN KEY (staffID) REFERENCES STAFF(staffID) ON DELETE SET NULL ON UPDATE SET NULL,
FOREIGN KEY (serviceID) REFERENCES SERVICE(serviceID) ON DELETE SET NULL ON UPDATE SET NULL,
FOREIGN KEY (custID) REFERENCES CUSTOMER(custID) ON DELETE SET NULL ON UPDATE SET NULL
);
 
 
CREATE TABLE ORDER_DATA(
orderID CHAR(4) NOT NULL,      
orderDate DATE NOT NULL CHECK (orderDate >=CURRENT_DATE()),
orderTime TIME NOT NULL CHECK (ordertime >=CURRENT_TIME()),
custID CHAR(4) ,
PRIMARY KEY(orderID),
FOREIGN KEY (custID) REFERENCES CUSTOMER(custID) ON DELETE SET NULL ON UPDATE SET NULL
);
 
 
CREATE TABLE SUPPLIER(
suppID CHAR(5) NOT NULL,
companyName VARCHAR(20) NOT NULL,
companyPhoneNb DECIMAL(8),
companyAddress VARCHAR(100),
PRIMARY KEY(suppID));
 
 
CREATE TABLE PRODUCT_LIST(
prodID CHAR(4) NOT NULL,
prodName VARCHAR(100),
prodType VARCHAR(30),
prodPrice DECIMAL(5,2),
suppID CHAR(5) ,
PRIMARY KEY(prodID),
FOREIGN KEY (suppID) REFERENCES SUPPLIER(suppID) ON DELETE SET NULL ON UPDATE SET NULL);
 
 
CREATE TABLE ORDER_DETAILS(
orderID CHAR(4) ,
prodID CHAR(4) ,
qty DECIMAL(3) NOT NULL,
PRIMARY KEY(prodID,orderID),
FOREIGN KEY (prodID) REFERENCES PRODUCT_LIST(prodID) ,
FOREIGN KEY (orderID) REFERENCES ORDER_DATA(orderID)
);
 
 
 
 
 
 
INSERT INTO STAFF VALUES ("ST000","Mia","Antoun",76164636,"Beirut, Achrafieh, Sioufi","F",2000,"manager","Boss");
INSERT INTO STAFF VALUES ("ST001","Joseph","Attieh",76441582,"Nahr Ibrahim, Halat","M",1800,"Staff","joseph123");
INSERT INTO STAFF VALUES ("ST002", "Clara","Akiki", 71840870,"Blat, Byblos","F", 1800,"Staff","clara123");
INSERT INTO STAFF VALUES ("ST003", "Lea","Sawaya", 03158827,"Ghosta","F", 1200,"Staff","lea123");
 
INSERT INTO CUSTOMER VALUES ("C000","Default","Staff",0,"Local,Address ","M","ST000"); 
INSERT INTO CUSTOMER VALUES ("C001","Rachelle","Rachid",76794821,"Amchit, Byblos","F","ST001");
INSERT INTO CUSTOMER VALUES ("C002","Gaelle","Abboud",03207671,"Mazraat yachouh","F","ST001");
INSERT INTO CUSTOMER VALUES ("C003","Maria","Hitti",71321299,"Dbayeh","F","ST002");
 
INSERT INTO CUSTOMER VALUES ("C004","Agapius","Bou ghosn",76154529,"Mtain, Mchikha","M","ST001");
 
INSERT INTO CUSTOMER VALUES ("C005","Marinelle","Attieh",76441584,"Nahr Ibrahim, Halat","F","ST001");
INSERT INTO CUSTOMER VALUES ("C006","Christelle","Saliba",76063227,"Dbayeh Beirut","F","ST002");
 
INSERT INTO CUSTOMER VALUES ("C007","Grace","Akiki",71077482,"Beat, Byblos","F","ST002");
 
INSERT INTO SERVICE VALUES ("SE000","Default", 0,"ST000"); 
INSERT INTO SERVICE VALUES ("SE001","Make up", 40,"ST002");
INSERT INTO SERVICE VALUES ("SE002","Manicure",10,"ST003");
INSERT INTO SERVICE VALUES ("SE003","Pedicure", 10,"ST003");
 
INSERT INTO SERVICE VALUES ("SE004","Waxing", 20,"ST003");
 
INSERT INTO SERVICE VALUES ("SE005","Facial Massage",30,"ST001");
 
INSERT INTO SERVICE VALUES ("SE006","Body Massage", 60,"ST001");
 
INSERT INTO SERVICE VALUES ("SE007","Laser epilation", 100,"ST002");
 
INSERT INTO SERVICE VALUES ("SE008","Electric epilation", 150,"ST002");
 
 
 
 
INSERT INTO APPOINTMENT VALUES  ("B001","2017-12-08","10:00","30","ST002","SE001","C001");
INSERT INTO APPOINTMENT VALUES  ("B002","2017-12-08","10:00","10","ST003","SE002","C002");
INSERT INTO APPOINTMENT VALUES  ("B003","2017-12-08","10:30","10","ST003","SE002","C003");
INSERT INTO APPOINTMENT VALUES  ("B004","2017-12-08","11:00","60","ST001","SE006","C004");
INSERT INTO APPOINTMENT VALUES  ("B005","2017-12-08","13:00","30","ST001","SE005","C005");
 
INSERT INTO APPOINTMENT VALUES  ("B006","2017-12-09","10:00","30","ST002","SE008","C007");
INSERT INTO APPOINTMENT VALUES  ("B007","2017-12-09","11:00","10","ST003","SE002","C005");
INSERT INTO APPOINTMENT VALUES  ("B008","2017-12-09","11:10","10","ST003","SE003","C005");
INSERT INTO APPOINTMENT VALUES  ("B009","2017-12-09","12:00","60","ST001","SE006","C006");
INSERT INTO APPOINTMENT VALUES  ("B010","2017-12-09","14:00","60","ST002","SE007","C001");
INSERT INTO APPOINTMENT VALUES  ("B011","2017-12-09","14:00","30","ST003","SE004","C002");
 
INSERT INTO ORDER_DATA VALUES ("O001","2017-12-08","10:40","C001");
INSERT INTO ORDER_DATA VALUES ("O002","2017-12-08","10:50","C003");
INSERT INTO ORDER_DATA VALUES ("O003","2017-12-08","13:50","C005");
INSERT INTO ORDER_DATA VALUES ("O004","2017-12-09","11:00","C007");
INSERT INTO ORDER_DATA VALUES ("O005","2017-12-09","13:51","C002");
 
 
INSERT INTO SUPPLIER VALUES ("SP000","Default Supplier",0,"Address"); 
INSERT INTO SUPPLIER VALUES ("SP001","La beaute",09447789,"Byblos");
INSERT INTO SUPPLIER VALUES ("SP002","Maybelline",09230580,"Kaslik");
INSERT INTO SUPPLIER VALUES ("SP003","MAC cosmetics",04400400,"Dbayeh");
INSERT INTO SUPPLIER VALUES ("SP004","China Glaze",01405032,"Achrafieh");
INSERT INTO SUPPLIER VALUES ("SP005","Samoa",01550550,"Verdun");
INSERT INTO SUPPLIER VALUES ("SP006","Braun Glaze",01400600,"Forn el chebbak");
 
 
 
INSERT INTO product_list VALUES ("P001","Beaute Sun Creme","Creme",20,"SP001");
INSERT INTO product_list VALUES ("P002","Acne Face Wash ","Cleanser",30,"SP001");
INSERT INTO product_list VALUES ("P003","China Glaze Blue","Nail Polish",10,"SP004");
INSERT INTO product_list VALUES ("P004","China Glaze Red","Nail Polish",10,"SP004");
INSERT INTO product_list VALUES ("P005","China Glaze Black","Nail Polish",10,"SP004");
INSERT INTO product_list VALUES ("P006","Samoa White","Nail Polish",5,"SP005");
INSERT INTO product_list VALUES ("P007","Samoa Pink","Nail Polish",5,"SP005");
INSERT INTO product_list VALUES ("P008","Maybeline Waterproof Mascara","Mascara",25,"SP002");
INSERT INTO product_list VALUES ("P009","Super Stay Full Coverage Foundation","Foundation",30,"SP002");
INSERT INTO product_list VALUES ("P010","Lasting Drama Light Eyeliner Pencil","Eye liner",10,"SP002");
INSERT INTO product_list VALUES ("P011","MAC Cremesheen Lipstick - Hot Gossip","Lipstick",18, "SP003");
 
INSERT INTO product_list VALUES ("P012","MAC Pro Longwear Long-Last Lips","Lipstick",29, "SP003");
 
INSERT INTO product_list VALUES ("P013","MAC Cremesheen Glass - Loud & Lovely","Lipstick",19, "SP003");
 
INSERT INTO product_list VALUES ("P014","Silk-épil epilators","Epilator",120,"SP006");
 
 
INSERT INTO order_details VALUES ("O001","P003",4);
INSERT INTO order_details VALUES ("O002","P002",1);
INSERT INTO order_details VALUES ("O003","P011",1);
INSERT INTO order_details VALUES ("O004","P014",1);
INSERT INTO order_details VALUES ("O005","P008",2);
INSERT INTO order_details VALUES ("O005","P007",2);
```
- The credentials of the manager are the following:
  - username: ST000
  - password: Boss
## License
No license.
