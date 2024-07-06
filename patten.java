package com.task5;

public class patten {

	public static void main(String[] args) {
		
		//Write code in java
		
		int num=1;

	    for(int i = 1; i <= 4; i++) {

	      for(int j = 1; j <= i; j++) {
	        System.out.print(num + " ");
	        num++;
	      }

	      System.out.println();
	    }
	}
}
//output
//1 
//2 3 
//4 5 6 
//7 8 9 10 