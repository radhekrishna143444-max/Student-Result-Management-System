package com.krishna;
import java.util.*;

public class StudentProgressCard {
	String name;
	int rollno;
	int[] marks = new int[5];
	double average;
	char grade;
	
	
	//Methods for calculating average
	public void Calculateaverage() {
		int total = 0;
		for(int mark : marks) {
			total =+ mark;
		}
		average = total/5.0;
	}
	
	
	//Methods for displayReportCard
	public void AssignGrades() {
		if(average >= 90) {
			grade = 'A';
		} else if(average >= 80) {
			grade = 'B';
		} else if(average >= 70) {
			grade = 'C';
		} else if(average >= 60) {
			grade = 'D';
		} else if(average >= 50) {
			grade = 'E';	
		} else {
			grade = 'F';		
		}
		
	}
		// Methods for display Report Card
		public void DisplayReport() {
			System.out.println("----------STUDENT REPORT CARD----------");
			System.out.println("Name: " + name);
			System.out.println("Roll Number: " + rollno);
			System.out.println("Marks:");
			for (int i=0; i<marks.length; i++) {
				System.out.println("Subject:" + (i+1) + " " + marks[i]);
			}
			System.out.println("average: " + average);
			System.out.println("grade: " + grade);
		
	}
		
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		StudentProgressCard SP = new StudentProgressCard();
    		
    		System.out.print("Enter Student Name: ");
    		SP.name = sc.nextLine();
    		
    		System.out.print("Enter Student Roll Number: ");
    		SP.rollno = sc.nextInt();
    		
    		int[] marks = new int[5];
    		System.out.println("Enter Student marks for 5 subjects: ");
    		for(int i=0; i<5; i++) {
    			System.out.println("Subject:" + (i+1) + " " );
    			SP.marks[i] = sc.nextInt();
    		}
    		
    		
    		SP.Calculateaverage();
    		SP.AssignGrades();
    		SP.DisplayReport();
    		
    	//	System.out.print("Average of the student: " + );
    		
    		
    		
    		
    	}
    		
    		
    	}
    		
    	















