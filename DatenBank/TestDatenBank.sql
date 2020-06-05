update  CUSTOMER set CREDITS = -2000
where  CUSTOMER_id= 99;

update  CUSTOMER set birthdate = '06-09-20'
where  CUSTOMER_id= 99;

update  CUSTOMER set birthdate = '05-10-20'
where  CUSTOMER_id= 56;

update  CUSTOMER set email = 'swalchj.newyork.com'
where  CUSTOMER_id= 56;

select * from CUSTOMER
where   CUSTOMER_id= 56;

select * from customer
where fistname= 'Naghmeh';

select * from customer
where lastname= 'Sali';