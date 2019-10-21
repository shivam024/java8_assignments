package code.java;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("sakshi");
		list.add("shivam");
		list.add("Bhopal-Ujjain");
		
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
	}
	
	
	

}
