package simplejavaprogram;

import java.util.Scanner;

public class ForEach {
	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		int number;
		Scanner sc1 = new Scanner(System.in);
//		if((year %4==0)&&(year%100 == 0)&&(year%400 == 0))
//		{
//			System.out.println("LP");
//		}
//		else{
//			System.out.println("not LP");
//		}
		String output =(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0))?"LP":"not LP";
		String output1=(number%2==0)?"even number":"odd number"; 
		System.out.println(output);
		System.out.println(output1);
		
		
	}
		
}
