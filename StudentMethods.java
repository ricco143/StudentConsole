package com.oop.pando;
import java.util.ArrayList;

public class StudentMethods{
	private int index,len,duplicateCheck;
	// ArrayLists para ma store ang Student Information
	ArrayList<String> studentNames = new ArrayList<>();
	ArrayList<String> studentAddress = new ArrayList<>();
	ArrayList<Integer> studentAge = new ArrayList<>();
	ArrayList<Integer> studentId = new ArrayList<>();
	ArrayList<String> status = new ArrayList<>();
	ArrayList<ArrayList<String>> studentSubjects = new ArrayList<>();
	ArrayList<ArrayList<Float>> studentGrades = new ArrayList<>();
	
	
	//methods nga modawat og object nga student
	void addStudent(Students student) {
		duplicateCheck = studentId.indexOf(student.getID());
		if(duplicateCheck == -1) {
		studentId.add(student.getID());
		studentNames.add(student.getName());
		studentAddress.add(student.getAddress());
		studentAge.add(student.getAge());
		status.add(student.getEnrolled());
		studentSubjects.add(new ArrayList<String>());
		studentGrades.add(new ArrayList<Float>());
		System.out.println("\nStudent Added Successfully..");
		}
		else {
			System.out.println("Student Already Exist");
		}
		
	}
	void update(int id, String newName, String newAddress, int newAge) {
		duplicateCheck = studentId.indexOf(id);
		if(duplicateCheck != -1) {
		index = studentId.indexOf(id);
		studentNames.set(index, newName);
		studentAddress.set(index, newAddress);
		studentAge.set(index, newAge);
		System.out.println("\nStudent Updated Successfully...");
		}else {
			System.out.println("Student does not exist");
		}
		
	}
	void delete(int id) {
		duplicateCheck = studentId.indexOf(id);
		if(duplicateCheck != -1) {
			
		index = studentId.indexOf(id);
		studentId.remove(index);
		studentNames.remove(index);
		studentAddress.remove(index);
		studentAge.remove(index);
		System.out.println("\nStudent Deleted Successfully...");
	}else {
		System.out.println("Student does not exist");
	}
	}
	void search(int id) {
	    int index = studentId.indexOf(id);
	    if (index < 0) {
	        System.out.println("Student ID not Found, Please Try Again");
	    } else {
	        String format = "";
	        System.out.println("_________________________________[RESULT]_____________________________________");
	        System.out.println("----------------------------------------------------------------------------");
	        System.out.printf("ID%-10sName%-16sAddress%-10sAge%-7sStatus%s\n", format, format, format, format, format);
	        System.out.println("----------------------------------------------------------------------------");
	        System.out.printf("%-12d%-20s%-17s%-10d%s\n", studentId.get(index), studentNames.get(index), studentAddress.get(index), studentAge.get(index), status.get(index));
	        if (!status.get(index).equals("Not Enrolled")) {
	            System.out.println("----------------------------------------------------------------------------");
	            System.out.printf("Subject Enrolled%-15sFinal Grade", format, format);
	            System.out.println("\n----------------------------------------------------------------------------");
	            for (int i = 0; i < studentSubjects.get(index).size(); i++) {
	                System.out.printf("%-31s%f", studentSubjects.get(index).get(i), studentGrades.get(index).get(i));
	                System.out.println();
	            }
	            System.out.println("----------------------------------------------------------------------------");

	            // computon tanan grade then eh display pila iyang over all general average grade
	            double sumGrades = 0.0;
	            for (Float grade : studentGrades.get(index)) {
	                sumGrades += grade;
	            }
	            double averageGrade = sumGrades / studentGrades.get(index).size();

	            System.out.printf("Average Final Grade: %.2f\n", averageGrade);
	        }
	        System.out.println("\n_____________________________[END OF RESULT]__________________________________\n\n");
	    }
	}

	void displayAll() {
		len = studentId.size();
		if(len == 0) {
			System.out.println("\nThere are no Students added yet");
		}else {
		String format = "";		
		System.out.println("\n\n______________________________[STUDENT LIST]_______________________________");
		System.out.println("----------------------------------------------------------------------------");
		System.out.printf("ID%-10sName%-16sAddress%-10sAge%-7sStatus%s\n",format,format,format,format,format);
		System.out.println("----------------------------------------------------------------------------");
							
		for(int i = 0; i < len;i++) {
			System.out.printf("%-12d%-20s%-17s%-10d%s\n",studentId.get(i),studentNames.get(i),studentAddress.get(i), studentAge.get(i),status.get(i));
			
			//System.out.println(studentId.get(i) + "\t" + studentNames.get(i) + "\t"
			//		+ studentAddress.get(i) + "\t" + studentAge.get(i));
		
					}
		System.out.println("\n\n____________________________[END OF LIST]_______________________________");
		
				}
			}
		public void enrollStudent(int id, String subject) {
			float tempGrade = 0;
			int index = studentId.indexOf(id);
			int subjectCheck = SubjectMethods.subjectCodes.indexOf(subject);
			if(index != -1 && subjectCheck != -1) {
				status.set(index, "Enrolled");
				studentSubjects.get(index).add(subject);
				studentGrades.get(index).add(tempGrade);
				System.out.println("\nStudent Enrolled Successfully");
			}else {
				System.out.println(SubjectMethods.subjectCodes + " " + subject);
				System.out.println(subjectCheck + " " + index);
				System.out.println("Enroll Failed, Student ID or Subject does not Exist!");
			}
			
	}
		public void gradeStudent(int id, String subjectCode, float grade) {
			int index = studentId.indexOf(id);
			int subjectIndex = studentSubjects.get(index).indexOf(subjectCode);
			if(index != -1 && !status.get(index).equals("Not Enrolled") && subjectIndex != -1){
				studentGrades.get(index).set(subjectIndex, grade);
				System.out.println("\nStudent Graded Successfully");
			}else {
				System.out.println("Student ID or Subject Does Not exist or Student is Not erolled Yet!");
			}
		}
	
	
}
