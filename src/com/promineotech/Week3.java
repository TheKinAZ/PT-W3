package com.promineotech;

import java.util.*;

public class Week3 {

	public static void main(String[] args) {

		boolean logIn = false;
		Scanner sc = new Scanner(System.in);
		while (!logIn) {
			System.out.print("Enter username: ");
			String username = sc.nextLine();
			System.out.print("Enter password: ");
			String password = sc.nextLine();
			if (username.equals("TheK") && password.equals("thek519")) {
				System.out.println("Welcome back " + username);
				logIn = true;
			} else {
				System.out.println("Inaccurate credentials!");
				
			} // end of else
		} // end of while
		sc.close();

	} // end of main

} // end of class
