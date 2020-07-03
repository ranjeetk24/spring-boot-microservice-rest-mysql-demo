Install MySQL
create database userportal
use ddl-auto=create to create database tables automatically
spring.jpa.hibernate.ddl-auto=create
Refer https://github.com/ranjeetk24
After running zuul-api-gateway-spring-boot, eureka-server-spring-boot and spring-boot-microservice-rest-mysql-demo 
http://localhost:9090/api/user-service/user
http://localhost:9090/api/user-service/register

If running standalone
http://localhost:8098/user
