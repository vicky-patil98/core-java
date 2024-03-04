package com.learning.core.day2;
import java.util.*;

public class D02P03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		//System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		//System.out.println("Enter mathematical operator to perform the task");
		String oper  = sc.next();
		
		switch(oper) {
		case "+": //System.out.println("addition");
		int sum = num1 + num2;
		System.out.println(sum);
		break;
		
		case "-": //System.out.println("Subtraction");
		int sub = num1 - num2;
		System.out.println(sub);
		break;
		
		case "/": //System.out.println("Division");
		if (num2 !=0) {
			int div = num1 / num2;
			System.out.println(div);
		}
		else {
			System.out.println("Please enter valid numbers for division");
		}
		break;
		
		case "*": //System.out.println("Multiplication");
		int mul = num1 * num2;
		System.out.println(mul);
		break;
		
		default : System.out.println("Please enter valid input");
		}

	}

}
