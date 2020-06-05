create or replace procedure PROC_CUSTOMER is 
v_CNT number;
begin

  select count(*) INTO v_CNT
  from all_Tables
  where owner = ' demo' and
      table_name = 'Customer';

      IF v_CNT = 0 Then
        execute immediate '
                    Create table Customer (
                                                            Customer_ID               Integer,
                                                            Email                     Varchar(50),
                                                            Fistname                  Varchar(40),
                                                            Lastname                  Varchar(40),
                                                            Gender                    Varchar(20),
                                                            Birthdate                 Date,
                                                            Credits                   Decimal(4)
                                              )';
    commit;
    End IF;
    
 SELECT count(*) INTO V_CNT
    FROM   ALL_SEQUENCES
    WHERE  SEQUENCE_OWNER = 'DEMO' AND
           SEQUENCE_NAME =   'SEQ_CUSTOMER_ID';    
  IF V_CNT = 0 THEN
        EXECUTE IMMEDIATE 'CREATE SEQUENCE SEQ_CUSTOMER_ID
                           START WITH    10000
                           INCREMENT BY  1
                           CACHE         50';
  commit;
  End IF;

End PROC_CUSTOMER;







