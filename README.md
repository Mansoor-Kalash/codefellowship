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

# (lab18+19); we build on the work made at the last labs on which two pages were added:
1. (/suggest) : this will list all of the users so the user can add any one at the list to his following list to create this feature many to many relation were created in the Application users (following/ follower)

2. the (/feed) path list all the people in the following list so that you can see there post beside that the user can access to there profile.

3. the application is checked to be immune against sql and html injection.

4. three pages (/signup,/ login,/home) were tested using MockMvc, and the result is pass.