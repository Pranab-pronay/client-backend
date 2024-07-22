# Client-backend

This is a basic Spring Boot application designed to demonstrate CRUD operations. It provides RESTful APIs for managing client information, and this document outlines how the API works in a Spring Boot application.

## API Documentation

The API provides endpoints to manage clients:

### Retrieve All Clients (GET /clients)
- **Description**: Fetches a list of all clients in the system.
- **Response**:
    - **Status Code**: 200 OK
    - **Response Body**:
      ```json
      [
          {
              "id": 1,
              "name": "John Doe",
              "email": "john@example.com"
          },
          {
              "id": 2,
              "name": "Jane Smith",
              "email": "jane@example.com"
          }
      ]
      ```

### Retrieve a Specific Client (GET /clients/{id})
- **Response**:
    - **Status Code**: 200 OK
    - **Response Body**:
      ```json
      {
          "id": 1,
          "name": "John Doe",
          "email": "john@example.com"
      }
      ```
    - **Error Response**:
        - **Status Code**: 404 Not Found
        - **Response Body**:
          ```json
          {
              "error": "Client not found."
          }
          ```

### Create a New Client (POST /clients)
- **Description**: Creates a new client and returns the created client.
- **Request**:
    - **Method**: POST
    - **URL**: /clients
    - **Request Body**:
      ```json
      {
          "name": "John Doe",
          "email": "john@example.com"
      }
      ```
- **Response**:
    - **Status Code**: 201 Created
    - **Response Body**:
      ```json
      {
          "id": 1,
          "name": "John Doe",
          "email": "john@example.com"
      }
      ```
### Update an Existing Client (PUT /clients/{id})
- **Description**: Updates an existing client by their ID.
- **Request**:
    - **Method**: PUT
    - **URL**: /clients/{id}
    - **Request Body**:
      ```json
      {
          "name": "John Updated",
          "email": "john.updated@example.com"
      }
      ```
- **Response**:
    - **Status Code**: 200 OK
    - **Response Body**:
      ```json
      {
          "id": 1,
          "name": "John Updated",
          "email": "john.updated@example.com"
      }
      ```
    - **Error Response**:
        - **Status Code**: 404 Not Found
        - **Response Body**:
          ```json
          {
              "error": "Client not found."
          }
          ```

### Delete a Client (DELETE /clients/{id})
- **Request**:
    - **Method**: DELETE
    - **URL**: /clients/{id}
- **Response**:
    - **Status Code**: 200 OK
    - **Response Body**: No content (empty response).
    - **Error Response**:
        - **Status Code**: 404 Not Found
        - **Response Body**:
          ```json
          {
              "error": "Client not found."
          }
          ```
