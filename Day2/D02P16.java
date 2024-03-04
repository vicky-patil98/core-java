package com.learning.core.day2;
import java.util.*;

public class D02P16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		
        if (num1 <= 1) {
    		System.out.println(num1);
        } 
        else {
            int fibPrev = 0;
            int fibCurr = 1;
            int fibNext = 0;
            System.out.print(fibPrev+" "+fibCurr+" ");
            for (int i = 2; i < num1; i++) {
                fibNext = fibPrev + fibCurr;
                System.out.print(fibNext+" ");
                fibPrev = fibCurr;
                fibCurr = fibNext;
            }
        }
	}

}
