package org.cts.test;

public class B {
	public static void main(String[] args) {
		String [] a=new String[5];
		a[0]="Farith";
		a[1]="Syed";
		a[3]="KArhtik";
		a[4]="100";	
		
	System.out.println(a[1]);
	System.out.println(a[3]);
	System.out.println(a[2]);
	
	//To find the length of an array
	int l = a.length;
	System.out.println(l);
	

	
	//TO iterate the array
	//Normal For loop   //i<5-------index based one
	for(int i=0;i<a.length;i++) {
		
		System.out.println(a[i]);
	}

	//To ietarte the array using enhanced for or foreach loop----value based one
	for(String x:a) {
		
		System.out.println(x);
	}
	
	}
}