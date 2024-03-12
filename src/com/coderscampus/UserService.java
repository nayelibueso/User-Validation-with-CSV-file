package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserService {

	private User[] users;

	public UserService(String fileName) {
		users = new User[4]; // Initializing the users array with a size of 4
		loadUsersFromFile(fileName);
	}

	public void loadUsersFromFile(String fileName) {
		BufferedReader fileReader = null;

		try {
			fileReader = new BufferedReader(new FileReader(fileName));
			String line;
			int index = 0;
			while ((line = fileReader.readLine()) != null) {
				String[] parts = line.split(",");
				String username = parts[0];
				String password = parts[1];
				String name = parts[2];
				users[index] = new User(username, password, name);
				index++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("oops, there was an exeption");
			e.printStackTrace();

		} catch (IOException e) {
			System.out.println("oops, there was an I/O Exception");
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

	public User validateUser(String username, String password) {
		for (User user : users) {
			if (user != null && user.getUsername().equalsIgnoreCase(username)
					&& user.getPassword().equalsIgnoreCase(password)) {
				return user;
			}
		}
		return null;
	}
}
//	public User createUser (String username, String passowrd, String name) { //Line #10
																  //in User Class.
//		User user = new User();
//		user.setUsername(username);
//		user.setPassword(name);
//		user.setName(name);
//		return user;
//	}

