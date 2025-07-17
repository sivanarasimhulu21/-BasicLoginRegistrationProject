# 🔐 Java Full Stack Login & Registration Project

A simple **Java Full Stack Web Application** for user **Registration and Login**, built using **Servlets, HTML, and JDBC**. This project demonstrates how to build a secure login system and connect it with a MySQL database.

# 📁 Folder Structure

LoginRegistrationProject/
├── src/
│ └── main/
│ ├── java/
│ │ ├── loginservlet.java
│ │ └── Registrationservlet.java
│ └── webapp/
│ ├── META-INF/
│ ├── WEB-INF/
│ ├── Home.html
│ ├── login.html
│ └── Registration.html


#  💻 Technologies Used
- Java
- HTML
- Servlets
- JDBC
- Apache Tomcat
- MySQL Database


## 🛠️ Setup & Run Instructions

# 1️⃣ Prerequisites

- JDK 8 or above
- Apache Tomcat 9 or 10
- MySQL Server
- IDE like Eclipse or IntelliJ

# 2️⃣ Database Setup (MySQL)

1. Open MySQL and run this:

CREATE DATABASE userdb;

USE userdb;

CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    firstname VARCHAR(10),
    lastname VARCHAR(10),
    username VARCHAR(10),
    password VARCHAR(10)
  
);
