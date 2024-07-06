package com.task5;

import java.util.Scanner;

//Write code in java

public class markandgrade {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter mark");
		int mark = reader.nextInt();
		
		
		 if(mark==100)
	        {
	            System.out.print("S");
	        }
	        else if(mark>=90 && mark<99)
	        {
	           System.out.print("A");
	        } 
	        else if(mark>=80 && mark<89)
	        {
	           System.out.print("B");
	        } 
		
	        else if(mark>=70 && mark<79)
	        {
	           System.out.print("C");
	        } 
	        else if(mark>=60 && mark<69)
	        {
	           System.out.print("D");
	        } 
	        else if(mark>=50 && mark<59)
	        {
	           System.out.print("E");
	        } 
		
	        else
	        {
		           System.out.print("Failed");
		        } 
	}
	
}

//output

//Enter mark

//72
//C

