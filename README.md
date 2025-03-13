# Backend_Traini8_YashRajShrivastav
 Assignment for Buyogo

Training Center Management APls
 
Overview
This project is a RESTful API service built using Java, Spring Boot, and PostgreSQL. It provides functionality to manage training centers by allowing users to:
 • Create and store training center information with proper validations. • Retrieve a list of stored training centers.
 This project follows best practices for API design and validation, ensuring robust error handling and proper JSON responses.

Features
1. Create Training Center (POST API) • Endpoint: /api/training-centers • Description: Creates and saves a new training center with the following details: ◦ CenterName (Text) (Mandatory, max 40 characters) ◦ CenterCode (Text) (Mandatory, exactly 12 alphanumeric characters) ◦ Address (Object) (Mandatory): ‣ Detailed Address ‣ City ‣ State ‣ Pincode ◦ StudentCapacity (Number) (Optional) ◦ CoursesOffered (List of Text) (Optional) ◦ CreatedOn (Auto-generated server timestamp in Epoch format, user input ignored)
◦ ContactEmail (Optional, validated if present) ◦ ContactPhone (Mandatory validated phone number) • Validations: ◦ Mandatory fields must be provided (e.g., CenterName, CenterCode, Address, ContactPhone) ◦ CenterCode must be exactly 12 characters and alphanumeric. ◦ ContactEmail must be a valid email format (if provided). ◦ ContactPhone must be a valid phone number format. ◦ CreatedOn is automatically populated by the server, and user-provided data is disregarded. • Error Handling: On validation failure the API returns appropriate error messages managed by a global ExceptionHandler. • Response on Success: Returns the newly saved training center's details in JSON format. 

2. Get All Training Centers (GET API)
• Endpoint: /api/training-centers • Description: Fetches a list of all stored training centers, If no training centers are available, the API returns an empty list.
Response Format: JSON

[
  {
    "centerName": "Example Center",
    "centerCode": "ABC123XYZ789",
    "address": {
      "detailedAddress": "123 Example Street",
      "city": "Sample City",
      "state": "Example State",
      "pincode": "123456"
    },
    "studentCapacity": 200,
    "coursesOffered": ["Java", "Python", "Data Science"],
    "createdOn": 1678992000,
    "contactEmail": "example@domain.com",
    "contactPhone": "9876543210"
  }
]

Technologies Used
• Java: Programming language for building the API. • Spring Boot: Framework for creating RESTful APIs with Spring • PostgreSQL: Database used to store training center information • Postman: Tool for API testing and verification.

Getting Started
1. Clone the Repository

git clone https://github.com/yrshrivastav/traini8
cd traini8

2. Prerequisites
Ensure you have the following installed:
• Java 17 or higher • PostgreSQL • Maven
 
3. Set Up the Database
1. Create a PostgreSQL database named training_center_db.
2. Update the application.properties file with your database credentials:

spring.datasource.url=jdbc:postgresql://localhost:5432/training_center_db
spring.datasource.username=your_username
spring.datasource.password=your_password

4. Build and Run the Application
mvn clean install
mvn spring-boot:run

The server will start at http://localhost:8080

Testing the APls
You can use Postman to test the APIs:
POST APl:/api/training-centers
• Method: POST 
• Body: Raw JSON (Example)


  {
    "centerName": "Example Center",
    "centerCode": "ABC123XYZ789",
    "address": {
      "detailedAddress": "123 Example Street",
      "city": "Sample City",
      "state": "Example State",
      "pincode": "123456"
    },
    "studentCapacity": 200,
    "coursesOffered": ["Java", "Python", "Data Science"],
    "createdOn": 1678992000,
    "contactEmail": "example@domain.com",
    "contactPhone": "9876543210"
  }
Response Format: JSON

[
  {
    "centerName": "Example Center",
    "centerCode": "ABC123XYZ789",
    "address": {
      "detailedAddress": "123 Example Street",
      "city": "Sample City",
      "state": "Example State",
      "pincode": "123456"
    },
    "studentCapacity": 200,
    "coursesOffered": ["Java", "Python", "Data Science"],
    "createdOn": 1678992000,
    "contactEmail": "example@domain.com",
    "contactPhone": "9876543210"
  }
]

Technologies Used
Java: Programming language for building the API.
Spring Boot: Framework for creating RESTful APIs with Spring.
PostgreSQL: Database used to store training center information.
Postman: Tool for API testing and verification.

Getting Started
1. Clone the Repository
git clone https://github.com/yrshrivastav/traini8
cd traini8

2. Prerequisites
Ensure you have the following installed:

Java 17 or higher
PostgreSQL
Maven

3. Set Up the Database
Create a PostgreSQL database named training_center_db.
Update the application.properties file with your database credentials:

spring.datasource.url=jdbc:postgresql://localhost:5432/training_center_db
spring.datasource.username=your_username
spring.datasource.password=your_password

4. Build and Run the Application

mvn clean install
mvn spring-boot:run

The server will start at http://localhost:8080.

Testing the APIs
You can use Postman to test the APIs.

POST API: /api/training-centers
Method: POST
Body: Raw JSON (Example)

{
  "centerName": "Example Center",
  "centerCode": "ABC123XYZ789",
  "address": {
    "detailedAddress": "123 Example Street",
    "city": "Sample City",
    "state": "Example State",
    "pincode": "123456"
  },
  "studentCapacity": 200,
  "coursesOffered": ["Java", "Python", "Data Science"],
  "createdOn": 1678992000,
  "contactEmail": "example@domain.com",
  "contactPhone": "9876543210"
}

Response:
{
  "centerName": "Example Center",
  "centerCode": "ABC123XYZ789",
  "address": {
    "detailedAddress": "123 Example Street",
    "city": "Sample City",
    "state": "Example State",
    "pincode": "123456"
  },
  "studentCapacity": 200,
  "coursesOffered": ["Java", "Python", "Data Science"],
  "createdOn": 1678992000,
  "contactEmail": "example@domain.com",
  "contactPhone": "9876543210"
}

GET API: /api/training-centers
Method: GET
Description: Retrieve all stored training centers.
Response: 
[
  {
    "centerName": "Example Center",
    "centerCode": "ABC123XYZ789",
    "address": {
      "detailedAddress": "123 Example Street",
      "city": "Sample City",
      "state": "Example State",
      "pincode": "123456"
    },
    "studentCapacity": 200,
    "coursesOffered": ["Java", "Python", "Data Science"],
    "createdOn": 1678992000,
    "contactEmail": "example@domain.com",
    "contactPhone": "9876543210"
  }
]

If no training centers are available, the response will be:
[]

Conclusion
This project demonstrates how to build a Spring Boot RESTful API for managing training centers. The API includes key functionalities like adding new centers, validating inputs, and retrieving stored data, with detailed error handling for a smooth user experience.