create or replace TRIGGER TRG_CUSTOMER
    Before insert or update on CUSTOMER
    for each row 
    Declare 
begin
---------------------EXCEPTION CREDIT ------------------------------------
  IF (:NEW.CREDITS < 0) THEN
        RAISE_APPLICATION_ERROR(-20900, 'The credits has to be greater or equal to 0 ');
    END IF;
    IF (UPDATING) THEN
        :NEW.CREDITS := :OLD.CREDITS;
    END IF;
---------------------EXCEPTION Birtdate ------------------------------------
IF (UPDATING ) THEN
    IF(sysdate <= :NEW.birthdate)THEN
    :NEW.birthdate := :old.birthdate;
    RAISE_APPLICATION_ERROR(-20901, 'The birthdate must be below the current date  ');
    END IF;
END IF;

end TRG_CUSTOMER;