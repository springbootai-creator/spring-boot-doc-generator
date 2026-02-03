# Traceability Document for Investment Management System

**Author:** [Your Name]  
**Date:** [Current Date]  
**Version:** 1.0  
**Logo:** [Optional Logo Here]

---

## Table of Contents

1. [Objectives and Scope](#objectives-and-scope)  
2. [Functional Requirements](#functional-requirements)  
3. [HTTP Routes Summary](#http-routes-summary)  
4. [Controller, Service, and DTO Relationship](#controller-service-and-dto-relationship)  
5. [Technical Architecture](#technical-architecture)  
6. [Data Validation Mechanisms](#data-validation-mechanisms)  
7. [Error Handling](#error-handling)  
8. [System Security](#system-security)  
9. [Conclusions](#conclusions)  

---

## Objectives and Scope

The Investment Management System aims to provide a robust backend solution for managing investments and associated persons. The system will facilitate the creation, retrieval, updating, and deletion of investment records and person profiles, ensuring data integrity and security.

---

## Functional Requirements

<table style="border-collapse:collapse;width:100%;table-layout:auto"><thead><tr><th style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Endpoint</th><th style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Method</th><th style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Description</th></tr></thead><tbody><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">/api/investments</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">POST</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Create a new investment.</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">/api/investments/person/{personId}</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">GET</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Retrieve investments by person ID.</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">/api/investments/person/{personId}/total</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">GET</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Calculate total invested amount by person.</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">/api/investments/{id}</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">PUT</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Update an existing investment.</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">/api/investments/{id}</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">DELETE</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Delete an investment.</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">/api/persons</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">POST</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Create a new person.</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">/api/persons</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">GET</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Retrieve all persons.</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">/api/persons/{id}</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">GET</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Retrieve a person by ID.</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">/api/persons/{id}</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">PUT</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Update a person by ID.</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">/api/persons/{id}</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">DELETE</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Delete a person by ID.</td></tr></tbody></table>
---

## HTTP Routes Summary

<table style="border-collapse:collapse;width:100%;table-layout:auto"><thead><tr><th style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Route</th><th style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Method</th><th style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Controller</th><th style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Description</th></tr></thead><tbody><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">/api/investments</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">POST</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">InvestmentController</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Create a new investment.</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">/api/investments/person/{personId}</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">GET</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">InvestmentController</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Get investments by person ID.</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">/api/investments/person/{personId}/total</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">GET</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">InvestmentController</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Calculate total invested by person.</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">/api/investments/{id}</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">PUT</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">InvestmentController</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Update an existing investment.</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">/api/investments/{id}</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">DELETE</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">InvestmentController</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Delete an investment.</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">/api/persons</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">POST</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">PersonController</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Create a new person.</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">/api/persons</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">GET</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">PersonController</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Get all persons.</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">/api/persons/{id}</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">GET</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">PersonController</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Get person by ID.</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">/api/persons/{id}</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">PUT</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">PersonController</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Update person by ID.</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">/api/persons/{id}</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">DELETE</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">PersonController</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Delete person by ID.</td></tr></tbody></table>
---

## Controller, Service, and DTO Relationship

<table style="border-collapse:collapse;width:100%;table-layout:auto"><thead><tr><th style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Controller</th><th style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">Service</th><th style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">DTOs</th></tr></thead><tbody><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">InvestmentController</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">InvestmentService</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">InvestmentDTO</td></tr><tr><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">PersonController</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">PersonService</td><td style="border:1px solid #444;padding:6px;vertical-align:top;text-align:left;white-space:pre-wrap;word-break:break-word">PersonDTO</td></tr></tbody></table>
---

## Technical Architecture

The system follows the Model-View-Controller (MVC) pattern, separating concerns into distinct layers:

- **Controllers:** Handle HTTP requests and responses.
- **Services:** Contain business logic and interact with repositories.
- **Repositories:** Manage data persistence.
- **Models:** Represent the data structure.
- **DTOs:** Facilitate data transfer between layers.

### Architecture Diagram




```
[Client] --> [Controller] --> [Service] --> [Repository] --> [Database]
```


---

## Data Validation Mechanisms

Data validation is implemented using annotations from the `javax.validation.constraints` package in DTOs. For instance, `@NotNull` ensures required fields are not empty, while `@Email` validates email formats.

---

## Error Handling

The system employs a global exception handler to manage errors. Common error responses include:

- **404 Not Found:** When a resource is not found.
- **400 Bad Request:** When input validation fails.

Example response for a 404 error:



```json
{
  "status": 404,
  "error": "Not Found",
  "message": "Resource not found"
}
```


---

## System Security

The system uses Spring Security for authentication and authorization. Key features include:

- **Authentication:** Validates user credentials.
- **Authorization:** Controls access to endpoints based on roles.
- **Roles:** Define user permissions, e.g., ADMIN, USER.

---

## Conclusions

The Investment Management System is designed to provide a secure and efficient backend for managing investments and associated persons. Future enhancements may include additional features such as reporting and analytics.

**Next Steps:**
- Implement unit and integration tests.
- Conduct security audits.
- Gather user feedback for further improvements.


