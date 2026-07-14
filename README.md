# Cognizant Spring Boot Hands-on Projects

## Overview

This repository contains the **6 Spring Boot Hands-on projects** completed as part of the Cognizant training program.

The projects cover important backend development concepts including **Spring Core, REST APIs, Spring Security, JWT Authentication, Spring Data JPA, Microservices, and Spring Cloud**.

These hands-on projects helped in understanding enterprise-level Java application development using the Spring ecosystem.

---

# Technologies Used

- Java
- Spring Framework
- Spring Boot
- Spring MVC
- Spring Security
- JWT (JSON Web Token)
- Spring Data JPA
- Hibernate
- REST APIs
- Microservices Architecture
- Maven
- MySQL
- Git & GitHub
- IntelliJ IDEA

---

# Repository Structure

```
spring-rest-hands-on
│
├── Handson-1
│   └── Spring Core - Dependency Injection
│
├── Handson-2
│   └── Spring REST API Application
│
├── Handson-3
│   └── JWT Authentication & Spring Security
│
├── Handson-4
│   └── Spring Data JPA Application
│
├── Handson-5
│   └── Microservices Application
│
└── Handson-6
    └── Spring Cloud & Eureka Service Discovery
```

---

# Handson - 1  
# Spring Core - Dependency Injection

## Objective

To understand the fundamentals of the Spring Framework and implement Dependency Injection using Spring IoC Container.

## Concepts Covered

- Spring IoC (Inversion of Control)
- Dependency Injection
- Spring Beans
- Application Context
- Bean Configuration

## Description

This project demonstrates how Spring manages object creation and dependency management using the IoC container.

Instead of manually creating objects, Spring automatically injects required dependencies into classes.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Build the Maven project.
3. Run the Spring Boot application.

---

# Handson - 2  
# Spring REST API Application

## Objective

To develop RESTful web services using Spring Boot.

## Concepts Covered

- REST Architecture
- HTTP Methods
- Controller Layer
- Request Mapping
- CRUD Operations

## Description

This project implements REST APIs using Spring Boot.

The application handles client requests and provides responses using REST endpoints.

## Features

✅ Create API endpoints  
✅ Handle HTTP GET requests  
✅ Handle HTTP POST requests  
✅ Update resources  
✅ Delete resources  

## Example Endpoints

```
GET     /api/resources
POST    /api/resources
PUT     /api/resources/{id}
DELETE  /api/resources/{id}
```

---

# Handson - 3  
# JWT Authentication using Spring Security

## Objective

To implement secure authentication using JSON Web Tokens (JWT).

## Concepts Covered

- Spring Security
- JWT Authentication
- Token Generation
- Security Configuration
- Authentication Flow

## Description

This project demonstrates implementing authentication using JWT tokens.

JWT allows users to securely access protected resources without maintaining server-side sessions.

## Features

✅ JWT Token Generation  
✅ Spring Security Configuration  
✅ Authentication Handling  
✅ Secure API Access  

## Authentication Flow

```
User Login
     |
     ↓
Generate JWT Token
     |
     ↓
Send Token With Request
     |
     ↓
Validate Token
     |
     ↓
Access Protected Resources
```

---

# Handson - 4  
# Spring Data JPA & Database Integration

## Objective

To integrate Spring Boot applications with databases using Spring Data JPA.

## Concepts Covered

- JPA
- Hibernate
- Entity Mapping
- Repository Layer
- Database Operations

## Description

This project demonstrates database connectivity and performing CRUD operations using Spring Data JPA.

## Features

✅ Database Connection  
✅ Entity Creation  
✅ Repository Implementation  
✅ CRUD Operations  

## Architecture

```
Controller
    |
    ↓
Service Layer
    |
    ↓
Repository Layer
    |
    ↓
Database
```

---

# Handson - 5  
# Microservices Application

## Objective

To understand and implement applications using Microservices Architecture.

## Concepts Covered

- Microservices
- Service Communication
- REST Communication
- Independent Services

## Description

This project demonstrates breaking a large application into smaller independent services.

Each service performs a specific business function and communicates through REST APIs.

## Benefits of Microservices

✅ Independent deployment  
✅ Better scalability  
✅ Easy maintenance  
✅ Fault isolation  

## Architecture

```
Client
  |
  |
API Gateway
  |
------------------
|                |
Service 1     Service 2
|                |
Database      Database
```

---

# Handson - 6  
# Spring Cloud & Eureka Service Discovery

## Objective

To implement service discovery using Spring Cloud and Eureka Server.

## Concepts Covered

- Spring Cloud
- Eureka Server
- Eureka Client
- Service Registration
- Service Discovery

## Description

This project demonstrates how microservices register themselves with Eureka Server and discover other available services.

## Architecture

```
             Eureka Server
                  |
        ---------------------
        |                   |
 Account Service      Other Services
        |
     Database
```

## Features

✅ Service Registration  
✅ Service Discovery  
✅ Microservice Communication  

---

# How to Run the Projects

## Step 1: Clone Repository

```bash
git clone <repository-url>
```

## Step 2: Navigate to Project Folder

Example:

```bash
cd Handson-3
```

## Step 3: Build Project

```bash
mvn clean install
```

## Step 4: Run Application

```bash
mvn spring-boot:run
```

or run the main application class using IntelliJ IDEA.

---

# Testing Tools Used

- Postman
- Browser
- IntelliJ IDEA Console
- MySQL Database

---
# Learning Outcomes

Through these projects, I gained practical experience in:

- Developing Spring Boot applications
- Building REST APIs
- Implementing JWT Authentication
- Connecting applications with databases
- Understanding Microservices Architecture
- Working with Spring Cloud and Service Discovery
- Using Git and GitHub for version control

---
