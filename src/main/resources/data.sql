DELETE
FROM orders;

DELETE
FROM customers;

DELETE
FROM agents;

INSERT INTO agents(agentCode, agentName, workingArea, comission, phone, country)
    VALUES (1, 'Mohammad', 'Eastvale', 25.6, '9494496122', 'USA'),
           (2, 'Tourjoman', 'Irvine', 24.6, '9494496122', 'USA');

--String customerCity, String workingArea, String grade, double openingAmt, double receiveAmt, double paymentAmt, double outstandingAmt, String phone, long agentCode
INSERT INTO customers(customerCode, customerName, workingArea, grade, openingAmt, receiveAmt, paymentAmt, outstandingAmt, phone, agentCode)
    VALUES (3, 'Some dummy', 'random place', 'idk what this means', 1000, 1000, 500, 500, '0000000', 1);

alter sequence hibernate_sequence restart with 5;