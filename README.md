# ApnaSalon

## Overview
ApnaSalon is a salon booking system built using **Java Full Stack Development** with **Spring Boot**, **JPA**, and **Bootstrap**. It allows users to book appointments at salons, manage bookings, and provides authentication using JWT.

## Features
- User Authentication (JWT-based security)
- Salon Management (Add, Update, Delete Salons)
- Booking System (Users can book, update, cancel appointments)
- Admin Dashboard for managing users and salons
- Validation and Exception Handling

## Technologies Used
- **Backend:** Java, Spring Boot, Spring Security, Spring Data JPA, JWT
- **Frontend:** HTML, CSS, Bootstrap, JavaScript
- **Database:** MySQL / H2 (for development)
- **Build Tool:** Maven
- **Other Libraries:** Lombok, JJWT, BCrypt

## Project Structure
```
ApnaSalon/
│── src/
│   ├── main/
│   │   ├── java/com/ApnaSalon/
│   │   │   ├── config/                # Configuration files
│   │   │   ├── controller/            # REST Controllers
│   │   │   ├── service/               # Business Logic
│   │   │   ├── repository/            # JPA Repositories
│   │   │   ├── model/                 # Entity Classes
│   │   │   ├── dto/                   # Data Transfer Objects
│   │   │   ├── security/              # Security & JWT
│   │   │   ├── exception/             # Exception Handling
│   │   │   ├── utils/                 # Utility Functions
│   │   │   ├── ApnaSalonApplication.java  # Main Spring Boot Application
│   │   ├── resources/
│   │   │   ├── templates/             # HTML Pages
│   │   │   ├── static/css/            # CSS Styles
│   │   │   ├── static/js/             # JavaScript
│   │   │   ├── application.properties # Configuration
│── pom.xml                            # Maven Dependencies
│── README.md                          # Project Documentation
```

## Installation & Setup
### Prerequisites
- Java 17
- Maven
- MySQL (if using MySQL)

### Steps to Run
1. **Clone the Repository:**
   ```sh
   git clone https://github.com/your-username/ApnaSalon.git
   cd ApnaSalon
   ```
2. **Update `application.properties`** (Set your database credentials)
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/apnasalon
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   ```
3. **Build and Run the Application:**
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```
4. **Access the Application:**
   - Open `http://localhost:8080` in your browser.


