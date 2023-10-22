package com.oop.pando;

public class StudentsControl extends StudentMethods{

	private String[] wordCommand;
	private String command;
	
	public void setCommand(String command) {
		this.command = command;
		wordCommand = this.command.split(",");
		wordCommand[0].toUpperCase();
		try {
		commandProcess(wordCommand[0]);
		}catch(IndexOutOfBoundsException  e) {
			System.out.println("\nInvalid Format, Please Try Again\n");
		}catch(NumberFormatException  e) {
			System.out.println("\nInvalid Format, Please Try Again\n");
		}
		
	}
	void commandProcess(String method) {
		method = method.toUpperCase();
		 int age;
		 int id;
		switch(method) {
		case "ADD":
			 id = Integer.parseInt(wordCommand[1]);
			 age = Integer.parseInt(wordCommand[4]);
			 
			 this.addStudent(new Students(id,wordCommand[2], wordCommand[3],age));
			
			 break;
		case "UPDATE":
			id = Integer.parseInt(wordCommand[1]);
			 age = Integer.parseInt(wordCommand[4]);
			this.update(id, wordCommand[2], wordCommand[3], age);
			
			break;
		case "DELETE":
			id = Integer.parseInt(wordCommand[1]);
			this.delete(id);
		
			break;
		case "SEARCH":
			id = Integer.parseInt(wordCommand[1]);
			this.search(id);
			
			break;
		case "ALL":
			this.displayAll();
			break;
		case "ENROLL":
			id = Integer.parseInt(wordCommand[1]);
			
			this.enrollStudent(id, wordCommand[2]);
			break;
		case "GRADE":
			id = Integer.parseInt(wordCommand[1]);
			float grade = Float.parseFloat(wordCommand[3]);
			this.gradeStudent(id, wordCommand[2], grade);
			break;
		case "EXIT":

			MainMenu.mainMenu();
			
			default:
				System.out.println("Invalid Format, Please Try Again");
		}
		
	
		
	}
	
	

}
