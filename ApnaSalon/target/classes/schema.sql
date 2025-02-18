CREATE TABLE users (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(100) NOT NULL,
                       email VARCHAR(100) UNIQUE NOT NULL,
                       password VARCHAR(255) NOT NULL,
                       phone VARCHAR(15),
                       role ENUM('CUSTOMER', 'SALON_OWNER') NOT NULL
);

CREATE TABLE salons (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(100) NOT NULL,
                        location VARCHAR(255) NOT NULL,
                        contact VARCHAR(20),
                        owner_id INT,
                        FOREIGN KEY (owner_id) REFERENCES users(id) ON DELETE CASCADE
);

CREATE TABLE bookings (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          user_id INT NOT NULL,
                          salon_id INT NOT NULL,
                          appointment_date DATE NOT NULL,
                          appointment_time TIME NOT NULL,
                          status ENUM('PENDING', 'CONFIRMED', 'CANCELLED') DEFAULT 'PENDING',
                          FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
                          FOREIGN KEY (salon_id) REFERENCES salons(id) ON DELETE CASCADE
);
