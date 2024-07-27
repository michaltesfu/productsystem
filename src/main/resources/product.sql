INSERT INTO Supplier (supplierId, name, contactPhone) VALUES
                                                          (1, 'Iowa Farms', NULL),
                                                          (2, 'Hallmark Agro Inc.', '(641) 451-0009');

INSERT INTO Product (productId, name, unitPrice, quantityInStock, dateSupplied, supplierId) VALUES
                                                                                                (1, 'Santa sweet apples', 1.09, 124, '2023-05-31', 1),
                                                                                                (2, 'Chicken drumsticks', 2.25, 18, '2023-04-10', 1),
                                                                                                (3, 'Dole Bananas', 0.55, 1097, '2023-05-15', 2);
