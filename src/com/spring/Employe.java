package com.spring;

public class Employe {
	/*
	 * int id; String name; public int getId() { return id; } public void setId(int
	 * id) { this.id = id; } public String getName() { return name; } public void
	 * setName(String name) { this.name = name; }
	 */

	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void displayInfo() {
		// System.out.println("employe id :"+id+"employe name :"+name);
		System.out.println("-----checking.................."+message);
	}
}