# js_todoApp

In this project, Spring Boot was used for the backend, and html, css, and JavaScript were used for the frontend. The h2 console was used in the database.


## Configuration



```bash
server.port=9090
spring.datasource.url=jdbc:h2:file:./db
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=john
spring.datasource.password=pass
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.path=/h2
```

If you want to see the tables, you should write the following in the browser:

http://localhost:9090/h2

 <img align="left" src="https://github.com/AkhmatovNurbek/js_todoApp/blob/master/src/main/resources/img_1.png" alt="java1" /> 
