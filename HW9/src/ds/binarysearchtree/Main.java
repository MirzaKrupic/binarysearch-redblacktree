package ds.binarysearchtree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import student.Student;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BinarySearchTree<Integer, Student> bst = new BinarySearchTree<Integer, Student>();
		int counter=0;
		File fileDir = new File("C:\\\\Users\\\\krupi\\\\Desktop\\\\hw\\\\Global_University_Students.csv");
		BufferedReader objReader = new BufferedReader(
		            new InputStreamReader(
		                       new FileInputStream(fileDir), "UTF8"));
		String strCurrentLine;
		while ((strCurrentLine = objReader.readLine()) != null) {
			String[] words = strCurrentLine.split(";");
		    bst.put(Integer.parseInt(words[0]), new Student(Integer.parseInt(words[0]), Integer.parseInt(words[6]), words[1], words[2], words[3], words[4], words[5]));
		}
		
		System.out.print("Enter the ID of the student you want to retrieve: ");
		Scanner scanner = new Scanner(System.in);
		Integer param = Integer.parseInt(scanner.nextLine());
		Student result = bst.get(param);
		
		if(result != null) {
			System.out.println("Student ID: " + result.getStudentId() +
							   "\nName and surname: " + result.getFullName() +
							   "\nDate of birth: " + result.getDob() +
							   "\nUniversity: " + result.getUniversityName() +
							   "\nDepartment code: " + result.getDepartmentCode() +
							   "\nDepartment: " + result.getDepartmentName() +
							   "\nYear of enrolment: " + result.getYearOfEnrolment());
			System.out.println("\nThe student was retrieved from the BST in " + bst.steps + " steps.");
		}else {
			System.out.println("The student with the given ID does not exist.\nThe search was completed in " + bst.steps +" steps.");
		}
		
	}

}
