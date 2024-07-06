package com.task5;

import java.util.Scanner;

public class hoteltariff {

	//Write code in java
	
	public static void main(String[] args) {	
    	String season;
		double a=0;
	    System.out.println("Enter the month from 1-12");
	    Scanner s = new Scanner(System.in);
	    int month = s.nextInt();
	    System.out.println("Enter room rent per day");
	    Scanner r = new Scanner(System.in);
	    float rent = s.nextInt();
	    System.out.println("Enter number of days");
	    Scanner d = new Scanner(System.in);
	    int day = s.nextInt();
	    float mul;
	    mul=rent*day;
	    a=((rent+(rent*0.2))*day);
	      switch (month)
	        {
	            case 1:
	            case 2:
	            case 3:
	            season = "Autumn";
	            break;
	            case 4:
	            case 5:
	            case 6:
	            season = "Spring";
	            break;
	            case 7:
	            case 8:
	            case 9:
	            case 10:
	            season = "Summer";
	            break;
	            case 11:
	            case 12:	           
	            season = "Winter";
	            break;
	            default:
	            season = "invalid";
	       }
	        System.out.println("The entered month is in the " + season + ".");
	        System.out.println("The rent of days are " + mul);
	   }
	}

//output

//Enter the month from 1-12
//4
//Enter room rent per day
//1200
//Enter number of days
//3
//The entered month is in the Spring.
//The rent of days are 3600.0