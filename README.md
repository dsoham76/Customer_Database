# Customer Database Application

## Framework and Language

> Backend Framework: SpringBoot

> Language: Java 17

> Database: MySQL

## Data flow

1.  Controllers

        Customer Controller

        - Get Customers
                Retrieve a list of customers with optional pagination.
                Endpoint: GET /customers
                Parameters:
                pageNumber (optional, default: 0) - Page number for pagination
                pageSize (optional, default: 5) - Number of items per page

        - Get Customer by ID
                Retrieve a customer by ID.
                Endpoint: GET /customer/{customerId}
                Path Variable:
                customerId - ID of the customer

        - Delete Customer by ID
                Delete a customer by ID.
                Endpoint: DELETE /customer/{customerId}
                Path Variable:
                customerId - ID of the customer

        - Create Customer
                Create a new customer.
                Endpoint: POST /customer
                Request Body: JSON representation of the customer

        - Update Customer
                Update an existing customer by ID.
                Endpoint: PUT /customer/{customerId}
                Path Variable:
                customerId - ID of the customer
                Request Body: JSON representation of the updated customer

        JWT Authentication Controller

                Description

                The `/login` endpoint in this Spring Boot project is responsible for handling user authentication and generating a JSON Web Token (JWT) for successful logins.

                Endpoint Details

                - **Endpoint:** `POST /login`
                - **Request Body:** JSON representation of `JWTRequest` containing `username` and `password`.

                ```json
                {
                "username": "your_username",
                "password": "your_password"
                }

2.  Database Design

        2.1 Customer Model:
                - int customerId
                - String firstName
                - String lastName
                - String street
                - String address
                - String city
                - String state
                - String email
                - String phone
        2.2 JWT Token Model:
                - String username
                - String password
        2.3 JWT Response Model:
                - String username
                - String tokenValue

## Data Structure Used in Project

     JPARepository has been used as primay datastructure

## Project Summary

The Customer Database API is a powerful and versatile tool that enables developers to integrate comprehensive data maintaine functionality into their applications. It offers a range of features to manage customer data effectively, including creation, updating, and deletion. The API also includes secure authentication and authentication using jwt tokens in addtion to it pagination has also been implemented.
