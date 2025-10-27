# 💬 One-on-One Chat Application

A simple **real-time chat application** built using **Java**,**Spring Boot** ,**Socket Programming**, and **MySQL**, designed to enable private one-on-one communication between users.  

This project demonstrates core backend development concepts such as **network programming**, **multithreading**, and **database integration**.

---

## 🚀 Features

- 🔐 **User Authentication** — Registration and Login using MySQL database  
- 💬 **Private Chat** — Real-time one-on-one messaging between users  
- ⚙️ **Multithreading** — Server handles multiple clients simultaneously  
- 🗄️ **Database Integration** — User info and chat history stored securely in MySQL  
- 🧩 **Scalable Design** — Server architecture can easily be extended for group chat  

---

## 🧠 Tech Stack

| Layer | Technology Used |
|-------|------------------|
| **Language** | Java |
| **Networking** | Java Socket Programming |
| **Database** | MySQL |
| **Database Connectivity** | JDBC |
| **UI** | Java Swing |
| **Concurrency** | Multithreading |


Each client connects to the server through sockets.  
Messages are sent via output streams and received via input streams in real time.

---

## ⚙️ How to Run

### 1️⃣ Prerequisites
- Java JDK 8 or above  
- MySQL installed and running  
- MySQL JDBC Connector (added to project classpath)

### 2️⃣ Database Setup
```sql
CREATE DATABASE chat_app;
USE chat_app;

CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(50) UNIQUE NOT NULL,
  password VARCHAR(50) NOT NULL
);

CREATE TABLE messages (
  id INT AUTO_INCREMENT PRIMARY KEY,
  sender VARCHAR(50),
  receiver VARCHAR(50),
  message TEXT,
  timestamp DATETIME DEFAULT CURRENT_TIMESTAMP
);


