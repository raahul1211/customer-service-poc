Customer Service:
-----------------

### Configurations required for this project:

$ ensure PostgreSQL is installed on machine.
$ pgAdmin should be running when you try to start your application locally.
$ create database repo as 'postgres' after DB installation.
$ ensure the credentials and other details of DB provided in application.properties to establish a DB connection are
correct.

### To Run this project locally follow the below steps:

$ git clone https://github.com/Infosys-CAPP-CMSA/customer-service-poc
$ Build the project:
    mvn clean install
$ run the main method to start the application locally or run below command in terminal:
    mvn spring-boot:run
$ insert the records into DB present in data.sql file.

$ There are 2 APIs in customer service: to test these APIs go to Postman and run below two GET requests:
1. localhost:8083/customers or curl --> location 'localhost:8083/customers'
2. localhost:8083/customers/{customer-id} --> curl --location 'localhost:8083/customers/{customer-id}'

$ you will get points earned by that customer for a particular purchase.
$ money spent for that purchase.
$ total reward points and total purchases by that customer.
