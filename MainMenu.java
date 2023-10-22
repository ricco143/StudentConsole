package com.oop.pando;

import java.util.*;
public class MainMenu{
	//instantiate StudentMenu in static kay naka static ang method nga choice process
	static SubjectMenu subMenu = new SubjectMenu();
	static StudentMenu sMenu = new StudentMenu();
	
	//declare as static nga access modifiers para macall ang method 
	//bisag wala nag buhat og instance sa class
	public static void mainMenu(){
		//declare ang variable para sa choice sa user
		int choice;
		//exception Handling try and catch (kung naay error nga sa na input sa user)

		try {
			//declare ang scanner
		Scanner input = new Scanner(System.in);
		System.out.println("____________________________[MAIN MENU]__________________________________");
		System.out.println("[1]Student \n[2]Subject \n[3]Exit");
		System.out.println("_________________________________________________________________________");
		//Mag enter and user kung unsa ilang choice
		System.out.print("Enter Your Choice: ");
		choice = input.nextInt();
		//twagon ang choiceProccess nga method
		choiceProcess(choice);
		input.close();
		//catch ang error nga Inputmismatch(example dili integer ang gi input sa user tas dili sya dawaton sa choice nga variable kay integer ra ang iyang dawaton
		}catch(InputMismatchException e) {
			System.out.println("Invalid Input, Please Try Again!");
			MainMenu.mainMenu();
		}
		
	}
	//method pra matawag unsay gi enter sa user
	static void choiceProcess(int choice) {
		switch(choice) {
		case 1: 
			sMenu.studentMenu();
			
			break;
		case 2:
			subMenu.subjectMenu();
			
			break;
		case 3:
			System.out.println("Exiting the program...");
            System.exit(0);
            break;
		
		default:
			System.out.println("Invalid Choice, Try Again");
			MainMenu.mainMenu();;
				
		}
	}
}