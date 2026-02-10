# Storage Management Project (Console Application- JAVA)

## 📦 Project Overview
Storage Management Project is a **Java console-based application** designed to manage products in a warehouse system.  
The application allows users to define products, list them, and manage basic inventory operations through a menu-driven interface.

This project is **still in progress** and is being developed as a learning project to improve Java fundamentals, object-oriented programming (OOP), and data structures.

---

## 🚀 Features
- Menu-based console interface
- Product definition and storage
- Product listing with formatted output
- Input validation and error handling
- Uses `HashMap` to store products dynamically
- Object-Oriented Design (Interface, Inheritance, Encapsulation)

---

## 🛠 Technologies Used
- **Java**
- **Java Collections (HashMap, Set, Map)**
- **OOP Principles**
- **Scanner for user input**

---

## 📁 Project Structure
```
Storage_Managment_Project
│
├── GirisCikisInterface.java # Interface for menu actions
├── Runner.java # Main class to start the application
├── Methods.java # Core logic and menu operations
└── Products.java # Product model class
```


---

## 📌 Class Descriptions

### `GirisCikisInterface`
Defines the main input/output actions for the application:
- `girisPaneli()`
- `cikisYap()`

---

### `Runner`
- Entry point of the application
- Extends `Methods`
- Starts the menu system

---

### `Products`
- Represents a product entity
- Contains product attributes such as:
  - id
  - product name
  - producer
  - quantity
  - unit
  - shelf
- Includes constructors, getters, setters, and `toString()` method

---

### `Methods`
- Implements `GirisCikisInterface`
- Contains the main business logic
- Manages:
  - Product definition
  - Product listing
  - User menu interactions
- Stores products in a `HashMap<Integer, Products>`
- Handles invalid user input using exception handling

---

## 🖥 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/ImrenR/Storage_Managment_Project.git
