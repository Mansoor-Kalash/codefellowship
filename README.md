# codefellowship

## Application User

***java language***

## class
1. ControllerUserAplication
**method**
* getSignUpPage
* signUpUser
* getLoginPage
* getUser
* getprofile
* allpost
* postprofile



* "/signup"
* "/login"
* "/users/{id}"
* "/myprofile"
* "/posts"
* "/addpost"

**root**

2. GeneralController
* getHomePage

**root**

* "/"

## information
1. if you are registered then put user name and password to login.
   if not registered press in signup.

2. press profile to the you can see your information and your posts.
3. you can add post write in the form then press post.
4 press in posts to shaw other users posts
5. press in logout if you want leave.

## Instruction

1. must create database

the application properties

server.port=8080
spring.sql.init.platform=postgres
spring.datasource.url=jdbc:postgresql://localhost:5432/ name of data base
spring.datasource.username=user name of database
spring.datasource.password= password for database
spring.jpa.hibernate.ddl-auto= in first time should be "creat" then "ubdate"
spring.sql.init.mode=always
