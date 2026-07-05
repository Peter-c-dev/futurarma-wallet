# 🏦 Futurama Banking API

## 📌 Description

A Spring Boot REST API inspired by the Futurama universe for managing banks, customer accounts and financial transactions.

The application allows users to create banks, manage accounts, perform deposits, withdrawals and transfers, and record financial transactions while following a clean layered architecture.

This project demonstrates backend software development using Java, Spring Boot, REST APIs, JPA/Hibernate and database persistence.

---

## 🚀 Features

- Create banks
- View all banks
- View bank by ID
- Update banks
- Delete banks
- Create accounts
- View all accounts
- View account by ID
- Deposit money
- Withdraw money
- Transfer money
- Create transactions
- View all transactions
- View transaction by ID
- RESTful API design
- Layered architecture (Controller → Service → Repository)


- Swagger/OpenAPI documentation


- Input validation using Jakarta Validation

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven


- Swagger / OpenAPI


- H2 Database


- Lombok


- IntelliJ IDEA

---



## 📂 Project Structure

```
Controller
│
├── Service
│
├── Repository
│
├── Entity
│
├── DTO
│
├── Mapper
│
├── Exception
│
└── Enums
```

---

## ▶️ Running the Project

Clone the repository

```bash
git clone https://github.com/Peter-c-dev/futurarma.git
```

Navigate into the project

```bash
cd futurarma
```

Run

```bash
mvn spring-boot:run
```

Open Swagger

```text
http://localhost:8080/swagger-ui/index.html
```

---

## 📸 Screenshots

### 🏗️ Project Structure

![Project Structure](screenshots/01-project-structure.png)

### 🏦 Create Bank

![Create Bank](screenshots/02-create-bank.png)

### 📋 Get All Banks

![Get All Banks](screenshots/03-get-all-banks.png)

### 🔍 Get Bank By ID

![Get Bank](screenshots/04-get-bank-by-id.png)

### ✏️ Update Bank

![Update Bank](screenshots/05-update-bank.png)

### 🗑️ Delete Bank

![Delete Bank](screenshots/06-delete-bank.png)

### 💳 Create Account

![Create Account](screenshots/07-create-account.png)

### 📋 Get All Accounts

![Get Accounts](screenshots/08-get-all-accounts.png)

### 🔍 Get Account By ID

![Get Account](screenshots/09-get-account-by-id.png)

### 💰 Deposit Money

![Deposit Money](screenshots/10-deposit-money.png)

### 💸 Withdraw Money

![Withdraw Money](screenshots/11-withdraw-money.png)

### 🔄 Transfer Money

![Transfer Money](screenshots/12-transfer-money.png)

### 🧾 Create Transaction

![Create Transaction](screenshots/13-create-transaction.png)

### 📋 Get All Transactions

![Transactions](screenshots/14-get-all-transactions.png)

### 🔍 Get Transaction By ID

![Transaction](screenshots/15-get-transaction-by-id.png)

---



## 📡 API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | /banks | Create bank |
| GET | /banks | Get all banks |
| GET | /banks/{id} | Get bank |
| PUT | /banks/{id} | Update bank |
| DELETE | /banks/{id} | Delete bank |
| POST | /accounts | Create account |
| GET | /accounts | Get all accounts |
| GET | /accounts/{id} | Get account |
| POST | /accounts/deposit | Deposit money |
| POST | /accounts/withdraw | Withdraw money |
| POST | /accounts/transfer | Transfer money |
| POST | /transactions | Create transaction |
| GET | /transactions | Get all transactions |
| GET | /transactions/{id} | Get transaction |

---

## 📚 What I Learned

Through this project I improved my understanding of:

- REST API development
- Spring Boot architecture
- Layered backend design
- Database persistence with JPA/Hibernate


- API testing with Postman


- API testing using Swagger/OpenAPI


- CRUD operations


- Service and Repository patterns


- Entity relationships


- Validation using Jakarta Validation


- Transaction handling

---

## 👨‍💻 Author

Peter Cross

GitHub:
https://github.com/Peter-c-dev