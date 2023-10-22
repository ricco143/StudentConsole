package com.oop.pando;
import java.util.ArrayList;

public class SubjectMethods {
	static ArrayList<String> subjectCodes = new ArrayList<>();
	ArrayList<String> subjectNames = new ArrayList<>();
	int index, len;
    void addSubject(Subject subject) {
    	subjectCodes.add(subject.subjectCode);
	    subjectNames.add(subject. subjectName);
	    System.out.println("\nSuccessfully Added");
	
}
void updateSub(String subjectCode, String newsubjectName) {
	
	index = subjectCodes.indexOf(subjectCode);
	subjectNames.set(index, newsubjectName);
	System.out.println("\nSuccessfully Updated");
	
}
void deleteSub(String subjectCode) {
	//index = subjectCodes.indexOf(subjectCode);
	subjectCodes.remove(subjectCode);
	subjectNames.remove(subjectCode);
	System.out.println("\nSuccessfully Removed");
}
void search(String wordCommand) {
	
	index = subjectCodes.indexOf(wordCommand);
	if(subjectCodes  ==  null) {
		System.out.println("Subject Code not Found, Please Try Again");
	}else {
	String format = "";
	System.out.println("_________________________________[RESULT]_____________________________________");
	System.out.println("------------------------------------------------------------------");
	System.out.printf("Subject Code%-16sSubject Name%-16s\n",format,format);
	System.out.println("------------------------------------------------------------------");
	System.out.printf("%-28s%-23s\n",subjectCodes.get(index),subjectNames.get(index));
	//System.out.println(studentId.get(index) + "\t" + studentNames.get(index) + "\t"
	//		+ studentAddress.get(index) + "\t" + studentAge.get(index));
	System.out.println("\n\n_____________________________[END OF RESULT]__________________________________\n\n");
	}
}
void displayAll() {
	len = subjectCodes.size();
	if(len == 0) {
		System.out.println("\nThere are no Subjects added yet");
	}else {
	String format = "";		
	System.out.println("\n\n______________________________[SUBJECT LIST]_______________________________");
	System.out.println("------------------------------------------------------------------");
	System.out.printf("Subject Code%-16sSubject Name%-16s\n",format,format);
	System.out.println("------------------------------------------------------------------");
						
	for(int i = 0; i < len;i++) {
		System.out.printf("%-28s%-20s\n",subjectCodes.get(i),subjectNames.get(i));
		
			}
	System.out.println("\n\n_____________________________[END OF RESULT]__________________________________");
	
		}
	}
}
