# 💸 Expense Tracker

A simple Spring Boot-based Expense Tracker REST API for managing expenses.


## 🚀 Features
- Add, update, delete, and fetch expenses
- Calculate total expenses
- Exception handling for non-existing expenses
- Basic authentication (admin/password)


## 🛠️ Tech Stack
- **Backend:** Spring Boot, Java
- **Database:** H2 / MySQL
- **Security:** Spring Security (Basic Auth)
- **Tools:** Maven, Postman



## 🔧 Setup Instructions

1. **Clone the repo:**  
    ```bash
    git clone https://github.com/yourusername/expense-tracker.git
    

2. **Install dependencies:**
    ```bash
    mvn clean install
    

3. **Run the application:**
    ```bash
    mvn spring-boot:run
    

4. **Access the API in Postman:**
    - `GET /expenses` — Fetch all expenses
    - `POST /expenses` — Add a new expense
    - `PUT /expenses/{id}` — Update an expense
    - `DELETE /expenses/{id}` — Delete an expense  
    *(Basic auth: `admin/password`)*


 🏅 Badges

![Java](https://img.shields.io/badge/Java-17-blue)
![SpringBoot](https://img.shields.io/badge/SpringBoot-3.2.0-brightgreen)

