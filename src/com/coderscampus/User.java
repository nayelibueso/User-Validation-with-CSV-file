package com.coderscampus;

//POJO Class -> This class will hold the information that will be read from the file.
public class User {
	private String username;
	private String password;
	private String name; 
	
	public User (String username, String passowrd, String name) {
		this.username = username;
		this.password = password;
		this.name = name; 
	}
// Getter and setters for above instance variables. 

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
