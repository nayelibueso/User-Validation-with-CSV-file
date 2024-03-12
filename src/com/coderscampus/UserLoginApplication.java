package com.coderscampus;

import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {

//		String fileName = "data.txt"; 
		UserService userService = new UserService("data.txt"); // this is where we tell the project what file we are
																// reading from.
		Scanner scanner = new Scanner(System.in);
		int attempts = 0;

		while (attempts < 5) {
			System.out.println("Enter usename: ");
			String username = scanner.nextLine();
			System.out.println("Enter passowrd");
			String passowrd = scanner.nextLine();

			User user = userService.validateUser(username, passowrd);
			if (user != null) {
				System.out.println("Welcome: " + user.getName());
				scanner.close();
				return;
			} else {
				attempts++;
				System.out.println("Invalid log in, please try again.");
			}
		}
		System.out.println("Too many failed login attempts, you are now locked out.");
		scanner.close();
	}
}
