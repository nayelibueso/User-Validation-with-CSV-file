package com.coderscampus;
//Read file.
//needs a method named "loadUsersFromFile" that reads data from the specified file (data.txt) and stores it in an array of User objects.
//needs a method "validateUser" that iterates through the array of User objects and checks if the inputted username and password match any user in the array.This laso 
	//checks if the inputted username is a case-insensitive match and if the password is a case-sensitive match with any User object in the array.
//This class is meant to handle user-related functionalities like loading users from a file and validating user credentials.

public class UserService {
	private User[]users; //import class
	
	public UserService (String fileName) {
		users = new User [4];// Initializing the users array with a size of 4
		loadUsersFromFile(fileName);
	}
	
	public void loadUsersFromFile(String fileName) {
		
	}
}


