CREATE DATABASE scenario_dev_app;

USE scenario_dev_app;

CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(20) NOT NULL
);

INSERT INTO users (username, password, role) VALUES
('admin', '$2a$10$eB6KPqYUs6dhBnT4BxTqhetyRymfrp79vKbnpRj3R5XrAWNpphYg2', 'ADMIN'), -- password: password
('user1', '$2a$10$eB6KPqYUs6dhBnT4BxTqhetyRymfrp79vKbnpRj3R5XrAWNpphYg2', 'USER');



