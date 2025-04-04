# user-management-system-backend
This is a console-based Java backend project built for managing basic user/employee information. It allows users to create, view, update, delete, and search user records using a simple command-line interface. The goal is to demonstrate core programming concepts in Java such as OOP, arrays, conditional statements, and basic CRUD operations — in a way that is beginner-friendly and easy to understand.

📌 Features
✅ Create New Users

📋 View All Users

❌ Delete Users by ID

🔍 Search Users by Salary

✏️ Update User Details (Name, Age, Salary, City, Department)

🧱 Technologies Used
Java (Core Java Concepts)

Command-Line Interface (CLI)

Scanner for Input Handling

Custom Classes and Objects

🧾 Code Overview
🏁 Main.java
The main entry point of the application. It presents a menu-driven interface that lets the user perform operations like add, view, delete, search, and update employees in a loop.

👤 User.java
This is the model (POJO) class representing a user with the following fields:

id

name

age

salary

city

department

It includes getters, setters, and a toString() method for pretty printing.

🧑‍💼 UserController.java
This class handles the logic and operations on the array of users, including:

Creating a new user

Displaying all users

Deleting users by ID

Searching users by salary

Updating individual fields of a user based on ID

🧪 Sample Run
sql
Copy
Edit
Choose an option:
1. create new user
2. view all users
3. delete a user
4. search by salary
5. update a user
After each operation, the program prompts the user to continue or exit.

🚀 How to Run
Open the code in your favorite Java IDE (like IntelliJ or Eclipse) or a simple text editor.

Compile and run the Main.java file.

Interact with the menu to perform operations on users.

📂 Folder Structure (if applicable)
bash
Copy
Edit
/project-root
│
├── Main.java
├── User.java
└── UserController.java
💡 Note
This is a basic in-memory application (no database used).

Designed for beginners to understand the basics of Java and OOP.

Easily extendable to integrate a database or GUI in the future.
