-- Insert Sample Users
INSERT INTO users (name, email, password, phone, role)
VALUES
    ('John Doe', 'john@example.com', 'hashed_password', '9876543210', 'CUSTOMER'),
    ('Salon Owner', 'owner@example.com', 'hashed_password', '9123456789', 'SALON_OWNER');

-- Insert Sample Salons
INSERT INTO salons (name, location, contact, owner_id)
VALUES
    ('Luxury Salon', 'Mumbai, India', '9823456789', 2),
    ('Glamour Hub', 'Delhi, India', '9786543210', 2);

-- Insert Sample Bookings
INSERT INTO bookings (user_id, salon_id, appointment_date, appointment_time, status)
VALUES
    (1, 1, '2025-02-20', '14:00:00', 'CONFIRMED'),
    (1, 2, '2025-02-21', '16:30:00', 'PENDING');
