package com.coderscampus;

import java.util.Scanner;

//We will be using a Scanner to collect the User's input form console.
//Check to see if inputs received via Scanner match the User objects in Array.
//user has 5 tried attempts. 
  //If a match is found, this class displays a welcome message with the user's name.
  //If no match is found, it displays an invalid login message.
  //If there are too many failed attempts, it displays a message indicating the user is locked out.
//This class contains the main method and orchestrates the login process.
public class UserLoginApplication {

	public static void main(String[] args) {
		UserService userService = new UserService ("data.txt");
		
		Scanner scanner = new Scanner (System.in);
		
		int attempts = 0;
		
		while (attempts < 5) {
			System.out.println("Enter Username: ");
			String username = scanner.nextLine();
			System.out.println("Enter password: ");
			String password = scanner.nextLine();
			
			User user = userService.validateUsers(username, password);
			if (user != null) {
				System.out.println("welcome: " + user.getName());
				scanner.close();
				return;
			}else {
				attempts++;
				System.out.println("Invalid log in, please try again");
			}
		}
		System.out.println("Too mnay failed attepts, you are now locked out");
		scanner.close();
	}
}
