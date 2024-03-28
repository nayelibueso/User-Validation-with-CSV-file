package com.coderscampus;

import java.util.Scanner;

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
