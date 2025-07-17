# 🔐 Java Full Stack Login & Registration Project

A simple **Java Full Stack Web Application** for user **Registration and Login**, built using **Servlets, HTML, and JDBC**. This project demonstrates how to build a secure login system and connect it with a MySQL database.

# 📁 Folder Structure<br>

LoginRegistrationProject/<br>
├── src/<br>
│ └── main/<br>
│ ├── java/<br>
│ │ ├── loginservlet.java<br>
│ │ └── Registrationservlet.java<br>
│ └── webapp/<br>
│ ├── META-INF/<br>
│ ├── WEB-INF/<br>
│ ├── Home.html<br>
│ ├── login.html<br>
│ └── Registration.html<br>


#  💻 Technologies Used
- Java
- HTML
- Servlets
- JDBC
- Apache Tomcat
- MySQL Database


# 1️⃣ Prerequisites

- JDK 8 or above
- Apache Tomcat 9 or 10
- MySQL Server
- IDE like Eclipse or IntelliJ

# 2️⃣ Database Setup (MySQL)

1. Open MySQL and run this:

CREATE DATABASE login;<br>
USE login;<br>
CREATE TABLE user (<br>
    id INT PRIMARY KEY AUTO_INCREMENT,<br>
    firstname VARCHAR(10),<br>
    lastname VARCHAR(10),<br>
    username VARCHAR(10),<br>
    password VARCHAR(10)<br>
);<br>
Database image<br>
<img width="544" height="192" alt="Screenshot from 2025-07-17 15-17-38" src="https://github.com/user-attachments/assets/9a975509-b88e-4982-a22c-5da1ef3b2e8c" />


# 3️⃣ Configure JDBC Connection<br>
Edit your database connection class (e.g., DBConnection.java):<br>
String url = "jdbc:mysql://localhost:3306/userdb";<br>
String user = "root";<br>
String password = "your_mysql_password";<br>

# 4️⃣ Deploy to Tomcat<br>
Export your project as a WAR file or run from Eclipse<br>
Place the WAR in the webapps/ folder of Apache Tomcat<br>
Start Tomcat server<br>

# 🔗 Access the App:<br>
After depoly in the server then you check 
http://localhost:8080/LoginRegistrationProject/login.html

After that you see like this as the Home page
<img width="1072" height="361" alt="Screenshot from 2025-07-17 15-18-55" src="https://github.com/user-attachments/assets/9c2d20fc-4d80-4bf1-935d-2e839664b856" />
Then try to login the page

<img width="1072" height="361" alt="Screenshot from 2025-07-17 15-31-29" src="https://github.com/user-attachments/assets/75e95374-89ae-4a96-951e-34e640c9a7b8" />


<img width="1072" height="361" alt="Screenshot from 2025-07-17 15-31-55" src="https://github.com/user-attachments/assets/6edfa421-0614-45f9-a3fe-254a6be38874" />

<img width="1072" height="361" alt="Screenshot from 2025-07-17 15-32-02" src="https://github.com/user-attachments/assets/b949a817-7762-4d02-b895-20776f5d35e6" />
Registration page

<img width="1072" height="361" alt="Screenshot from 2025-07-17 15-32-09" src="https://github.com/user-attachments/assets/e156d7fb-73a7-45a4-b017-9c6af82d130d" />

<img width="1072" height="361" alt="Screenshot from 2025-07-17 15-32-22" src="https://github.com/user-attachments/assets/5385884b-41f9-4610-8118-a1877db0351e" />


<img width="1072" height="361" alt="Screenshot from 2025-07-17 15-32-27" src="https://github.com/user-attachments/assets/94b08b94-516d-4d84-a15e-fede965f0af5" />

<img width="1072" height="361" alt="Screenshot from 2025-07-17 15-31-55" src="https://github.com/user-attachments/assets/6edfa421-0614-45f9-a3fe-254a6be38874" />

After successfull login then you get it
<img width="1072" height="361" alt="Screenshot from 2025-07-17 15-32-39" src="https://github.com/user-attachments/assets/5afae826-e208-438b-b06e-37da740a3d5f" />

# Tips
Make the All files in a correct path<br>
Add the MySQL Connector JAR to your project’s libraries.<br>
make the JDBC connection properly<br>
Make sure that database is correct and the table is created<br>
maintain the correct servlets files with proper syntax<br>


# 🙋‍♂️ Author
Chittiboina Siva Narasimhulu

# 🤝 Contributions
Pull requests are welcome. For major changes, please open an issue first to discuss what you'd like to change.
