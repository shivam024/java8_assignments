package code.java;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marksObtained, passingMarks = 33;
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input Marks Obtained by You");
		 marksObtained = input.nextInt();
		   
		    if (marksObtained >= passingMarks) {
		      System.out.println("You passed the exam.");
		    }
		    else {
		      System.out.println("Unfortunately, you failed to pass the exam.");
		    }
		  }
		
		

	}


