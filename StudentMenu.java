package com.oop.pando;

import java.util.Scanner;
// ang class mag instance siya sa StudentControl 
public class StudentMenu extends StudentsControl{
	//variable command para ma store ang ge input sa user
	private String command;

	public void studentMenu() {
		Scanner input = new Scanner(System.in);
		do {
		System.out.println("\n\n____________________________[Student Menu]_________________________________");
		System.out.println("Add Student (Example)->[add,student ID,Name,Address,Age]"
				+ "\nUpdate Student (Example)->[update,student ID,Name,Address,Age]"
				+ "\nDelete Student (Example)->[delete,student ID]"
				+ "\nSearch Student (Example)->[search,student ID]"
				+ "\nGet All Student (Example)->[all]"
				+ "\nEnroll Student	(Example) -> [enroll,student ID,Subject Code]"
				+ "\nGrade A Student (Example) -> [grade,student ID,Enrolled Subject Code,Grade"
				+ "\nExit(Main Menu) (Example) -> [exit]");
		System.out.println("___________________________________________________________________________");
		System.out.println("Enter your Command: ");
		command = input.nextLine();
		this.setCommand(command);
		command = command.toUpperCase();
		}while(!command.equals("EXIT"));
		
		input.close();
	
	}
	
	
	
}