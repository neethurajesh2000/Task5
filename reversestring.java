package com.task5;

public class reversestring {

	//Write code in java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "welcome guvi";  
        String reversed = "";  
        
        for (int i = input.length() - 1; i >= 0; i--) {  
            reversed += input.charAt(i);  
        }   
        
        System.out.println("Original String: " + input);  
        System.out.println("Reversed String: " + reversed);  
	}

}
//output
//Original String: welcome guvi
//Reversed String: ivug emoclew