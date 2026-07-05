# 🏦 Futurama Banking API

## 📌 Description

A Spring Boot REST API inspired by the Futurama universe for managing banks, customer accounts and financial transactions.

The application allows users to create banks and accounts, perform deposits, withdrawals and transfers, and record transactions while following a layered Spring Boot architecture.

---

## 🚀 Features

- Create, read, update and delete banks
- Create, read and delete accounts
- Deposit money into accounts
- Withdraw money from accounts
- Transfer money between accounts
- Create and retrieve transactions
- Entity validation
- RESTful API design
- Layered architecture (Controller → Service → Repository)
- H2 Database
- Swagger / OpenAPI documentation

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- H2 Database
- Lombok
- Maven
- Swagger / OpenAPI
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
git clone <repository-url>
```

Navigate to the project

```bash
cd futurarma
```

Run the application

```bash
mvn spring-boot:run
```

Open Swagger

```
http://localhost:8080/swagger-ui/index.html
```

---

## 📸 Screenshots

### Project Structure

![Project Structure](screenshots/01-project-structure.png)

### Create Bank

![Create Bank](screenshots/02-create-bank.png)

### Get All Banks

![Get All Banks](screenshots/03-get-all-banks.png)

### Get Bank By ID

![Get Bank](screenshots/04-get-bank-by-id.png)

### Update Bank

![Update Bank](screenshots/05-update-bank.png)

### Delete Bank

![Delete Bank](screenshots/06-delete-bank.png)

### Create Account

![Create Account](screenshots/07-create-account.png)

### Get All Accounts

![Get All Accounts](screenshots/08-get-all-accounts.png)

### Get Account By ID

![Get Account](screenshots/09-get-account-by-id.png)

### Deposit Money

![Deposit](screenshots/10-deposit-money.png)

### Withdraw Money

![Withdraw](screenshots/11-withdraw-money.png)

### Transfer Money

![Transfer](screenshots/12-transfer-money.png)

### Create Transaction

![Create Transaction](screenshots/13-create-transaction.png)

### Get All Transactions

![Get Transactions](screenshots/14-get-all-transactions.png)

### Get Transaction By ID

![Get Transaction](screenshots/15-get-transaction-by-id.png)

---

## 📚 What I Learned

During this project I strengthened my understanding of:

- Spring Boot application architecture
- RESTful API development
- CRUD operations
- Layered architecture
- JPA/Hibernate relationships
- Transaction handling
- Validation using Jakarta Validation
- API testing using Swagger
- Repository and Service patterns

---

## 👨‍💻 Author

**Peter Cross**

GitHub: https://github.com/Peter-c-dev-c-dev