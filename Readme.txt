Install MySQL
create database userportal
use ddl-auto=create to create database tables automatically
spring.jpa.hibernate.ddl-auto=create

After running ZUUL API GATEWAY 
http://localhost:9090/api/user-service/user
http://localhost:9090/api/user-service/register

If running standalone
http://localhost:8098/user