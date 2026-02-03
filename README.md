# Student Management System (Java + JDBC + MySQL)

A console-based Java application that performs FULL CRUD operations on student records using JDBC and MySQL.

## Features
- Add student
- View all students
- Update student details
- Delete student
- Input validation
- DAO design pattern

## Technologies Used
- Java
- JDBC
- MySQL

## Project Structure
- src
  - com.sms.main
    - MainApp.java
  - com.sms.model
    - Student.java
  - com.sms.dao
    - StudentDAO.java
    - StudentDAOImpl.java
  - com.sms.util
    - DBConnection.java

## How to Run
1. Create MySQL database `student_db`
2. Create `students` table
3. Update database credentials in `DBConnection.java`
4. Run `MainApp.java`

## Author
Santhosh Ravichandran
