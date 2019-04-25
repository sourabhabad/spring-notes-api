# Spring Boot, MySQL, Rest API

The app will start running at http://localhost:8080.

## Explore Rest APIs

### The app defines following CRUD APIs.

GET /api/notes

POST /api/notes

GET /api/notes/{noteId}

PUT /api/notes/{noteId}

DELETE /api/notes/{noteId}

You can test them using postman or any other rest client.

## Example
http://localhost:8080/api/notes --> GET Request

POST 
http://localhost:8080/api/notes/
select row json body
{
    "title": "RCB",
    "content": "Royal challenger bangalore"
}


