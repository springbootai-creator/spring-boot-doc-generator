# investment

## Overview

The investment project is a backend application developed in Java 8 that provides a robust framework for managing investment-related data. It offers RESTful APIs for handling various operations related to investments and users, ensuring a seamless experience for clients and stakeholders.

## Purpose

The purpose of this project is to create a scalable and maintainable backend service that allows users to manage their investments efficiently. It aims to provide a reliable platform for investment tracking, user management, and data processing.

## Technologies Used

- Java 8
- Spring Boot
- Maven
- JPA (Java Persistence API)
- H2 Database (for development and testing)
- Lombok
- RESTful APIs

## Project Structure

The project follows a standard structure for Java applications, ensuring clarity and organization. Below is the folder structure:

```
Project Folder Structure:

└── java/
    └── com/
        └── example/
            └── investment/
                ├── InvestmentApplication.java
                ├── controller/
                │   ├── InvestmentController.java
                │   └── PersonController.java
                ├── dto/
                │   ├── InvestmentDTO.java
                │   └── PersonDTO.java
                ├── exception/
                │   └── GlobalExceptionHandler.java
                ├── mapper/
                │   ├── InvestmentMapper.java
                │   └── PersonMapper.java
                ├── model/
                │   ├── Investment.java
                │   └── Person.java
                ├── repository/
                │   ├── InvestmentRepository.java
                │   └── PersonRepository.java
                └── service/
                    ├── InvestmentService.java
                    └── PersonService.java
```

## Installation and Execution Instructions

To install and run the investment project, follow these steps:

1. Clone the repository:
   
   ```
   git clone https://github.com/yourusername/investment.git
   ```

2. Navigate to the project directory:

   ```
   cd investment
   ```

3. Build the project using Maven:

   ```
   mvn clean install
   ```

4. Run the application:

   ```
   mvn spring-boot:run
   ```

5. Access the API at `http://localhost:8080`.

## Technical Summary of Classes and Layer Relationships

The project is organized into several layers, each responsible for different aspects of the application:

- **Controller Layer**: Handles incoming HTTP requests and maps them to appropriate service methods. Contains `InvestmentController` and `PersonController`.
  
- **Service Layer**: Contains business logic and interacts with the repository layer. Includes `InvestmentService` and `PersonService`.

- **Repository Layer**: Manages data access and persistence. Consists of `InvestmentRepository` and `PersonRepository`.

- **Model Layer**: Defines the data structures used in the application, represented by `Investment` and `Person`.

- **DTO Layer**: Contains Data Transfer Objects for transferring data between layers, represented by `InvestmentDTO` and `PersonDTO`.

- **Mapper Layer**: Responsible for mapping between entities and DTOs, includes `InvestmentMapper` and `PersonMapper`.

- **Exception Handling**: Centralized exception handling is managed by `GlobalExceptionHandler`.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.

## Contact Information

For any inquiries or contributions, please contact:

- Name: John Doe
- Email: johndoe@example.com
- GitHub: https://github.com/yourusername