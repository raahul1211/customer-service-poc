insert into customer_entity(id, name) values (1000, 'Aman');
insert into customer_entity(id, name) values (1001, 'Alok');
insert into customer_entity(id, name) values (1002, 'Akul');

insert into my_transaction(id, description, total, save_date, customer_id) values (111, 'Purchase 1', 100, '2014-8-06 11:22:33', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (112, 'Purchase 2', 150, '2014-8-05 11:22:35', 1000);
insert into my_transaction(id, description, total, save_date, customer_id) values (113, 'Purchase 3', 221, '2014-8-01 11:22:36', 1001);
insert into my_transaction(id, description, total, save_date, customer_id) values (114, 'Purchase 4', 243.11, '2014-8-02 11:22:37', 1001);
insert into my_transaction(id, description, total, save_date, customer_id) values (115, 'Purchase 5', 122.87, '2014-8-05 11:22:38', 1002);
insert into my_transaction(id, description, total, save_date, customer_id) values (116, 'Purchase 6', 810.12, '2014-8-06 11:22:39', 1002);