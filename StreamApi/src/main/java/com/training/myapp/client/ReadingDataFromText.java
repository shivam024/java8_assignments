package com.training.myapp.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ReadingDataFromText {

	// Java Program to illustrate reading from text file 
	// as string in Java 
	
	  public static void main(String[] args) throws FileNotFoundException {
		  Set<Integer> numbers=new TreeSet<Integer>((p1,p2)->Integer.compare(p2,p1));
		  String filename="C:\\Users\\khbegum\\Documents\\workspace-sts-3.9.9.RELEASE\\StreamApi\\src\\main\\resources\\example.txt";
		    Scanner scanner=new Scanner(new File(filename));
		    while (scanner.hasNextInt()) {
		    	numbers.add(scanner.nextInt());
		    }
		    Iterator<Integer> iterator = numbers.iterator(); 
		    
            //System.out.println("\nValues using DescendingSet:"); 
  
            // printing the interated value 
            while (iterator.hasNext()) { 
                System.out.println(iterator.next()); 
            } 
	}

		  
	    
	    
	  
	}

