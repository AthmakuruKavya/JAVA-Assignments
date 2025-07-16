
Java Assignments – Day 1 & 2

Topics Covered:
- Variables
- Classes (basic structure)
- Input/Output using Scanner
- Functions
- Type Casting
- Call by Value vs Call by Reference
- Debugging via Call Stack (VS Code)

Assignment 1: Basic User Details Input
Question:
Take the following inputs from the user using Scanner:
- Name (String)
- Age (int)
- CGPA (float)
Print them in a formatted way.
Input Format:
Ravi
20
8.5
Output Format:
Name: Ravi
Age: 20
CGPA: 8.5

Assignment 2: Type Conversion Practice
Question:
Take three inputs:
- Integer number
- Float number
- A number in string format (e.g., "45")

Now:
1. Convert int to float (implicitly)
2. Convert float to int (explicitly)
3. Convert the string to int using Integer.parseInt()

Print all converted values.
Input Format:
12
3.8
"50"
Output Format:
Int to Float: 12.0
Float to Int: 3
String to Int: 50

Assignment 3: Greeting Function
Question:
Create a method greetUser(String name) that prints:
Hello <name>, welcome to the MERN + DSA batch!
Take input from the user in main() and call the function.
Input Format:
Prudhvi
Output Format:
Hello Prudhvi, welcome to the MERN + DSA batch!


Assignment 4: Call by Value Demonstration
Question:
Create a method changeValue(int x) which sets x = 100.
In main(), take an integer input from the user, call changeValue() with it, and then print the value of the original variable.
Input Format:
10
Output Format:
Original value before function call: 10
Value inside function: 100
Original value after function call: 10


Assignment 5: Call by Reference using Arrays
Question:
Create a method modifyArray(int[] arr) that changes arr[0] = 99.
In main(), create an array, print it before and after calling the method.
Input Format:
[1, 2, 3]
Output Format:
Before function call: [1, 2, 3]
Inside function: [99, 2, 3]
After function call: [99, 2, 3]


Assignment 6: Debugging Call Stack
Question:
Write a Java program with three methods:
- main()
- firstStep()
- secondStep()

From main(), call firstStep(), and inside that call secondStep().
Print messages at start and end of each method.
Use breakpoints in VS Code to observe the call stack step-by-step.
Output Format:
Main started
First Step started
Second Step started
Second Step ended
First Step ended
Main ended
