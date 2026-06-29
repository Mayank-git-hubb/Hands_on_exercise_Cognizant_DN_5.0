-- Scenario 1
DECLARE
BEGIN
FOR c IN (
        SELECT c.CustomerID, c.Age, l.LoanID, l.InterestRate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
    )
    LOOP
        IF c.Age > 60 THEN
UPDATE Loans
SET InterestRate = InterestRate - 1
WHERE LoanID = c.LoanID;
END IF;
END LOOP;

COMMIT;
END;
/


-- Scenario 2
DECLARE
BEGIN
FOR c IN (
        SELECT CustomerID, Balance
        FROM Customers
    )
    LOOP
        IF c.Balance > 10000 THEN
UPDATE Customers
SET IsVIP = 'TRUE'
WHERE CustomerID = c.CustomerID;
END IF;
END LOOP;

COMMIT;
END;
/


-- Scenario 3
SET SERVEROUTPUT ON;

DECLARE
BEGIN
FOR l IN (
        SELECT LoanID,
               CustomerID,
               DueDate
        FROM Loans
        WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Customer '
            || l.CustomerID
            || ' has Loan '
            || l.LoanID
            || ' due on '
            || TO_CHAR(l.DueDate,'DD-MON-YYYY')
        );
END LOOP;
END;
/


