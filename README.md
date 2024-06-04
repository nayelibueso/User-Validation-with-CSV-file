# User Validation with CSV File

This Java console application mimics a user login system by prompting users for a username and password and validating the input against data stored in a CSV file. The application provides feedback on whether the login attempt is successful or not, with a limited number of attempts allowed.

## Key Features
- User Authentication: Users are prompted to enter a username and password, simulating a real-world login scenario.
- Data Storage: User information, including usernames, passwords, and names, is stored in a CSV file named "data.txt".
- User POJO: A User POJO (Plain Old Java Object) class is created to represent user data, containing properties for username, password, and name.
- CSV File Handling: The application reads user data from the "data.txt" CSV file and stores it as an array of User objects in the Java application.
- Matching Algorithm: The application checks if the inputted username and password match any user data stored in the array of User objects. A match is determined based on case-insensitive username comparison and case-sensitive password comparison.
- Limited Attempts: Users are given a maximum of 5 attempts to log in. If they fail to log in after the 5th attempt, they are locked out of the system.
- Console Interface: Interaction with the application occurs through the console, with users entering their credentials and receiving feedback messages.
