package com.training.myapp;
public class ComplexNumber {
private int real,img;

public ComplexNumber(int real, int img) {
	super();
	this.real = real;
	this.img = img;
}
public static int[] complexNumberAdd(ComplexNumber c1,ComplexNumber c2) {
	ComplexNumber temp=new ComplexNumber(0,0);
	temp.real=c1.real+c2.real;
	temp.img=c1.img+c2.img;
	System.out.print(temp);
	int[] a=new int[2];
	a[0]=temp.real;
	a[1]=temp.img;
	for(int i=0;i<a.length;i++)
	System.out.println(a[i]);
	return a;
	
	
}

}
