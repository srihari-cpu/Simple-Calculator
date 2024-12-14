Simple Calculator

This is a simple Java-based calculator program that performs basic arithmetic operations such as addition, subtraction, multiplication, and division. It handles invalid input and division by zero gracefully.

Features
Addition: Adds two numbers.
Subtraction: Subtracts the second number from the first.
Multiplication: Multiplies two numbers.
Division: Divides the first number by the second, with error handling for division by zero.
Input Validation: Handles non-numeric inputs and ensures valid operation choices.
Multiple Calculations: Allows the user to perform multiple calculations without restarting the program.
Requirements
Java: JDK 8 or later
IDE or Command Line: Any Java IDE (e.g., IntelliJ IDEA, Eclipse) or command line to run Java programs.
How to Run
1. Clone the repository
To clone this project to your local machine, run the following command in your terminal:

bash
Copy code
git clone https://github.com/<your-username>/SimpleCalculator.git
2. Compile and Run
Using Command Line:
Navigate to the project directory:
bash
Copy code
cd SimpleCalculator
Compile the program:
bash
Copy code
javac SimpleCalculator.java
Run the program:
bash
Copy code
java SimpleCalculator
Using an IDE:
Open the project in your preferred Java IDE.
Locate the SimpleCalculator.java file and run it from within the IDE.
3. Start Calculating
The program will prompt you to enter two numbers, select an operation, and display the result. You can repeat the calculations as needed or exit the program when done.

Example Usage
vbnet
Copy code
Welcome to the Simple Calculator!
Enter first number: 10
Enter second number: 5
Select an operation:
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
Enter your choice (1/2/3/4): 1
Result: 10.0 + 5.0 = 15.0
Do you want to perform another calculation? (yes/no): yes
Error Handling
If the user tries to divide by zero, the program will display an error message:
"Error! Division by zero is not allowed."
If the user enters invalid input (non-numeric values), the program will prompt the user to enter a valid number.
