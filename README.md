==================================================
**PRODUCT – SUPPLIER CRUD API (SPRING BOOT PROJECT)**
==================================================

**PROJECT SUMMARY**
--------------------------------------------------
This project is a Spring Boot REST API used to manage
Product and Supplier data.

One Product is linked with One Supplier using
One-To-One JPA mapping.

This project demonstrates real-world backend
development using Spring Boot.

--------------------------------------------------
**WHY THIS PROJECT IS IMPORTANT**
--------------------------------------------------
• Real business use case (Product & Supplier)
• Clean REST API design
• CRUD operations (Create, Read, Update, Delete)
• Backend project used in companies
• Angular frontend ready backend

--------------------------------------------------
**TECHNOLOGIES USED**
--------------------------------------------------
• Java
• Spring Boot
• Spring Web (REST APIs)
• Spring Data JPA
• Hibernate
• MySQL Database
• Lombok
• Maven

--------------------------------------------------
**WHAT I IMPLEMENTED IN THIS PROJECT**
--------------------------------------------------
• REST Controllers using @RestController
• CRUD APIs for Product and Supplier
• One-To-One relationship using JPA
• Service layer for business logic
• Repository layer for database operations
• Proper HTTP status codes
• Transaction management
• Cross-Origin support for frontend

--------------------------------------------------
**ONE-TO-ONE JPA RELATIONSHIP**
--------------------------------------------------
Product  -------- One-To-One -------- Supplier

Each Product has exactly one Supplier.
Supplier details are saved automatically
using CascadeType.ALL.

--------------------------------------------------
**REST API ENDPOINTS**
--------------------------------------------------

POST    /save_product
GET     /view_product
GET     /view_product/{id}
PUT     /postproduct/{productId}
DELETE  /postproduct/{productId}

--------------------------------------------------
**@CrossOrigin EXPLANATION (IMPORTANT)**
--------------------------------------------------
@CrossOrigin("http://localhost:4200")

This annotation allows requests from
Angular frontend running on port 4200.

It helps frontend and backend communicate
without CORS errors.

This makes the backend frontend-ready.

--------------------------------------------------
**PROJECT ARCHITECTURE (LAYERED DESIGN)**
--------------------------------------------------

Controller Layer
↓
Service Layer
↓
Repository Layer
↓
Database (MySQL)

This architecture improves:
• Code readability
• Maintainability
• Scalability

--------------------------------------------------
**AUTHOR**
--------------------------------------------------
Rajesh Patil  
Java | Spring Boot | REST APIs | Microservices
==================================================
