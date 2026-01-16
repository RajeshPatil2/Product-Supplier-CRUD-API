Product–Supplier CRUD API (Spring Boot)
🔹 Project Overview

This project is a Spring Boot REST API that manages Products and their Supplier Details.

One Product is linked with one Supplier

Built using real-world inventory use case

Backend API ready to connect with Angular frontend

🔹 What I Implemented (Easy Explanation)

Created REST APIs for Product and Supplier

Used One-to-One JPA mapping

Implemented CRUD operations:

Create Product

View Single Product

View All Products

Update Product

Delete Product

Used Service Layer for business logic

Used Repository Layer for database operations

🔹 Technologies Used

Java

Spring Boot

Spring Web (REST APIs)

Spring Data JPA

Hibernate

MySQL

Lombok

🔹 JPA Relationship
Product  ---- OneToOne ----  Supplier

🔹 Important Annotation Used

@CrossOrigin("http://localhost:4200
")

Allows API access from Angular frontend

Prevents CORS errors

Helps backend and frontend communicate smoothly

🔹 REST API Endpoints

Product APIs

POST /save_product → Save product with supplier

GET /view_product/{id} → Get product by ID

GET /view_product → Get all products

PUT /postproduct/{productId} → Update product

DELETE /postproduct/{productId} → Delete product


🔹 Author

Rajesh Patil
Java | Spring Boot | REST APIs | Microservices
