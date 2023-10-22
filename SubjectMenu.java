package com.oop.pando;

import java.util.Scanner;

public class SubjectMenu extends SubjectControl{
	private String command;

	public void subjectMenu() {
		Scanner input = new Scanner(System.in);
		do {
		
		System.out.println("\n\n___________________________[SUBJECT MENU]_______________________________");
		System.out.println("Add Subject (Example)->[add,IT123,Subject Name]"
				+ "\nUpdate Subject (Example)->[update,Subject Code,Subject Name]"
				+ "\nDelete Subject (Example)->[delete,Subject Code]"
				+ "\nSearch Subject (Example)->[search,Subject Code]"
				+ "\nGet All Subject (Example)->[all]"
				+ "\nExit (Format) -> [exit]");
		System.out.println("_________________________________________________________________________");
		System.out.println("Enter your Command: ");
		command = input.nextLine();
		this.setCommand(command);
		command = command.toUpperCase();
		}while(!command.equals("EXIT"));
		
		input.close();
	
	}
	
}	
