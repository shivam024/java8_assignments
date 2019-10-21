package hello;

import java.util.Scanner;

public class ComplexNumber {
	double real,img;
	
	
	public ComplexNumber(double real, double img) {
		super();
		this.real = real;
		this.img = img;
	}
	
	public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
		
		ComplexNumber temp = new ComplexNumber(0,0);
		temp.real = c1.real+c2.real;
		temp.img = c2.real+c2.img;
		ComplexNumber temp1 = new ComplexNumber(0,0);
		temp1.real = c1.real-c2.real;
		temp1.img = c2.real-c2.img;
		
		return temp;
		
	}
public static ComplexNumber sub(ComplexNumber c1, ComplexNumber c2) {
		
		ComplexNumber temp1 = new ComplexNumber(0,0);
		temp1.real = c1.real-c2.real;
		temp1.img = c2.real-c2.img;
		
		return temp1;
}
	public static void main(String args[]) {
		ComplexNumber c1 = new ComplexNumber(5.5, 4);
		ComplexNumber c2 = new ComplexNumber(1.2, 3.5);
	        ComplexNumber temp = sum(c1, c2);
	        ComplexNumber temp1 = sub(c1, c2);
	
	        Scanner c11 = new Scanner(System.in);
	        
	        System.out.println("Sum is: "+ temp.real+" + "+ temp.img +"i");
	        System.out.println("Sub is: "+ temp1.real+"  "+ temp1.img +"i");
	        
	    }
	





	
}
