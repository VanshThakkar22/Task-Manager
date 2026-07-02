# Task Manager REST API

A backend Task Manager application built with **Spring Boot** that provides a RESTful API for managing tasks. The project demonstrates the implementation of CRUD operations using a layered architecture, Spring Data JPA, and MySQL.

---

## Features

* Create a new task
* Retrieve all tasks
* Retrieve a task by ID
* Update an existing task
* Delete a task
* Automatic timestamp generation for task creation
* MySQL database integration using Spring Data JPA

---

## Tech Stack

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* MySQL
* Maven
* REST API
* Git & GitHub

---

## Project Structure

```
src
├── controller
│   └── TaskController.java
├── service
│   └── TaskService.java
├── repository
│   └── TaskRepository.java
├── model
│   └── Task.java
└── resources
    └── application.properties
```

---

## REST API Endpoints

| Method | Endpoint      | Description       |
| ------ | ------------- | ----------------- |
| POST   | `/tasks`      | Create a new task |
| GET    | `/tasks`      | Get all tasks     |
| GET    | `/tasks/{id}` | Get a task by ID  |
| PUT    | `/tasks/{id}` | Update a task     |
| DELETE | `/tasks/{id}` | Delete a task     |

---

## Sample Request

**POST** `/tasks`

```json
{
  "title": "Learn Spring Boot",
  "description": "Build a CRUD REST API",
  "completed": false
}
```

### Sample Response

```json
{
  "id": 1,
  "title": "Learn Spring Boot",
  "description": "Build a CRUD REST API",
  "completed": false,
  "createdAt": "2026-06-30T14:52:11"
}
```

---

## Database Configuration

Create a MySQL database:

```sql
CREATE DATABASE task_manager;
```

Update `application.properties` with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/task_manager
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## Running the Project

Clone the repository:

```bash
git clone git@github.com:VanshThakkar22/Task-Manager.git
```

Navigate to the project:

```bash
cd Task-Manager
```

Run the application:

```bash
mvn spring-boot:run
```

The API will be available at:

```
http://localhost:8080
```

---

## Skills Demonstrated

* REST API Development
* Layered Architecture (Controller → Service → Repository)
* Dependency Injection
* Object Relational Mapping (JPA/Hibernate)
* CRUD Operations
* MySQL Integration
* Maven Project Management
* Git Version Control

---

## Future Improvements

* ResponseEntity for proper HTTP status codes
* Request validation using Bean Validation
* Global exception handling
* DTO pattern
* Swagger/OpenAPI documentation
* Unit and integration tests
* Pagination and sorting
* Docker support

---

## Author

**Vansh Thakkar**

GitHub: https://github.com/VanshThakkar22
