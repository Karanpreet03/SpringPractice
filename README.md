# Quiz Application
This is a simple quiz application built using Spring Boot and PostgreSQL. It allows users to manage quiz questions, including adding, updating, deleting, and retrieving questions by category.

Features
Add new quiz questions
Update existing quiz questions
Delete quiz questions
Retrieve quiz questions by category
View all quiz questions
Technologies Used
Java
Spring Boot
PostgreSQL
RESTful API
Setup
Clone the repository.
Configure the PostgreSQL database settings in application.properties.
Run the application using Maven or your IDE.
Access the application at http://localhost:8083.
Endpoints
GET /question/allQuestions: Get all quiz questions.
GET /question/category/{category}: Get quiz questions by category.
POST /question/add: Add a new quiz question.
PUT /question/update/{id}: Update an existing quiz question by ID.
DELETE /question/delete/{id}: Delete a quiz question by ID.
Feel free to contribute to this project by forking the repository, making changes, and creating pull requests!
