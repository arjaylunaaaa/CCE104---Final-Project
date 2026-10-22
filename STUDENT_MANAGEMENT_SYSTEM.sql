CREATE TABLE users(
	id INT PRIMARY KEY AUTO_INCREMENT,
	username VARCHAR(255) UNIQUE,
	password VARCHAR(255) NOT NULL,
	email_address VARCHAR(50) NOT NULL,
	contact_number VARCHAR(15) NOT NULL,
	role ENUM('admin', 'student', 'instructor') NOT NULL DEFAULT 'student',  
	created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
	
