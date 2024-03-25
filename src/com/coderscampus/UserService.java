package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Read file.
//needs a method named "loadUsersFromFile" that reads data from the specified file (data.txt) and stores it in an array of User objects.
//needs a method "validateUser" that iterates through the array of User objects and checks if the inputted username and password match any user in the array.This laso 
	//checks if the inputted username is a case-insensitive match and if the password is a case-sensitive match with any User object in the array.
//This class is meant to handle user-related functionalities like loading users from a file and validating user credentials.

	public class UserService {
		private User[] users;

		public UserService(String fileName) {
			users = new User[4];
			loadUsers(fileName);
		}

		public void loadUsers(String fileName) {
			BufferedReader fileReader = null;
			try {
				fileReader = new BufferedReader(new FileReader(fileName));
				String line;
				int index = 0;
				while ((line = fileReader.readLine()) != null) {
					String[] credentials = line.split(",");
					String username = credentials[0];
					String password = credentials[1];
					String name = credentials[2];
					users[index] = new User(username, password, name);
					index++;
				}
			} catch (FileNotFoundException e) {
				System.out.println("oops, there was an exception");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("oops there was an I/O Exception");
				e.printStackTrace();

			} finally {
				try {
					if (fileReader != null) {
						fileReader.close();
					}

				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}

		public User validateUsers(String username, String password) {
			for (User user : users) {
				if (user != null && user.getUsername().equalsIgnoreCase(username)
						&& user.getPassword().equalsIgnoreCase(password)) {
					return user;
				}
			}
			return null;
		}
	}


