## Spring boot authentication with JWT

This is an authentication service built with Spring Boot.

### To run locally
* PostgresSQL-server running on local machine or docker
* Environmental variables:
  * POSTGRES_USERNAME
  * POSTGRES_PASSWORD
  * JWT_SECURITY_KEY

### Endpoints
```
http://localhost:8080/api/v1/auth/register
http://localhost:8080/api/v1/auth/authenticate
http://localhost:8080/api/v1/auth/demo-controller
```

### Register user
```
POST /api/v1/auth/register
Accept: application/json
Content-Type: application/json

{
    "firstname": "test",
    "lastname": "testsson",
    "email": "test@testsson.com"
    "password": "testersson",
}

RESPONSE: 
200 OK
{
    "token": <token>
}

```

### Authenticate user
```
POST /api/v1/auth/authenticate
Accept: application/json
Content-Type: application/json

{
    "email": "test@testsson.com"
    "password": "testersson",
}

RESPONSE: 
200 OK
{
    "token": <token>
}
```

### Demo controller
```
GET /api/v1/auth/demo-controller
-H Authorization: Bearer <token>

RESPONSE:
200 OK
"Hello from secured endpoint"
```