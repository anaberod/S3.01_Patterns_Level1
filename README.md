Patterns Level 1 – Singleton & Undo Manager

📄 Description – Exercise Statement
This exercise focuses on identifying and implementing design patterns in Java. The goal is to create software that is reusable and extensible using well-known object-oriented design techniques.

The task consists of implementing a Singleton pattern to simulate a basic Undo command manager, which stores a history of user orders. The application allows adding orders, undoing the last one, and listing all previous orders.

💻 Technologies Used
- Java 17+
- IntelliJ IDEA (or any preferred Java IDE)
- Git
- Console I/O (Scanner)
- Standard Java Collections (Stack)

📋 Requirements
- Java JDK 17 or later
- Git installed
- IntelliJ IDEA / VS Code / Eclipse (optional but recommended)
- Internet connection (for cloning the repository)

🛠️ Installation
1. Clone the repository:
   git clone https://github.com/anaberod/S3.01_Patterns_Level1.git
2. Open the project in your IDE.
3. Ensure that your Java SDK is set to version 17 or later.
4. Build the project.

▶️ Execution
1. Locate the Main class inside the project.
2. Run the program from your IDE or terminal:
   java Main
3. Interact with the console menu:
   - Option 1: Add a new order
   - Option 2: Undo the last order
   - Option 3: Show order history
   - Option 4: Exit the program

🌐 Deployment
This project runs locally in console mode and is not intended for deployment in a production server environment.
However, you can:
- Package it as a .jar file
- Run it on any machine with Java 17 installed

Example:
jar cfe UndoManagerApp.jar Main *.class
java -jar UndoManagerApp.jar

🤝 Contributing
Contributions are welcome! To contribute:

1. Fork the repository
2. Create a new branch:
   git checkout -b feature/your-feature-name
3. Commit your changes with meaningful messages
4. Push to your fork:
   git push origin feature/your-feature-name
5. Open a pull request
