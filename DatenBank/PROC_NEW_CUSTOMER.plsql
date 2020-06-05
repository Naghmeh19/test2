create or replace PROCEDURE PROC_NEW_CUSTOMER 
(
      CUSTOMER_ID  OUT NUMBER 
    , EMAIL        IN VARCHAR2 
    , FIRSTNAME    IN VARCHAR2 
    , LASTNAME     IN VARCHAR2 
    , GENDER       IN VARCHAR2 
    , BIRTHDATE    IN DATE 
    , CREDITS      IN OUT NUMBER 
) as 

begin
  Customer_ID := SEQ_CUSTOMER_ID.nextval;
  if (CREDITS is Null) then 
    CREDITS := 10;
 end if;

  Insert into Customer VALUES (Customer_ID,EMAIL,FIRSTNAME,LASTNAME,GENDER,BIRTHDATE,CREDITS);

end PROC_NEW_CUSTOMER;