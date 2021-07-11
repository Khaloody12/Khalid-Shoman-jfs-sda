package com;

import java.io.IOException;
import java.util.Scanner;

public class Calc {
public static void main(String[] args) throws IOException {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 1st Value : ");
	int a =sc.nextInt();
	System.out.println("enter 2nd Value : ");
	int b =sc.nextInt();
	
	
	System.out.println("Select What method : 1-addtion 2-substracting 3-multiply 4-divide ");
	int write = sc.nextInt();
	switch (write) {
	
	case 1:
		System.out.println(a+b);
		
		break;

	case 2:
		
		System.out.println(a-b);
		break;
		
		
	case 3:
		System.out.println(a*b);
		break;
		
		
	case 4:
		if(a==0 || b==0) {
			System.out.println("dont enter 0 in the values >>> Try again");
			break;
		}
		System.out.println(a/b);
		break;
	 default :
		System.out.println("Enter valid number from 1 to 4");
	}
	
	
	
	
	
	
	
}


	
	
}
