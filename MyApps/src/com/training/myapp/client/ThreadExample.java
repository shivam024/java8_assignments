package com.training.myapp.client;

import java.util.ArrayList;

import java.util.List;
import java.util.function.Consumer;

public class ThreadExample extends Thread {
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(23);
		numbers.add(46);
		numbers.add(90);
		numbers.add(2);
		Thread t=new Thread(new Runnable()
				{
			
			@Override
			public void run() {
				Consumer<Integer> display=(i)->System.out.println(i);
				numbers.forEach(display);
				// TODO Auto-generated method stub
				
			}});
		t.start();
		
		
	}

}
