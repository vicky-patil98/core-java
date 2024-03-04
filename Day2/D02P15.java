package com.learning.core.day2;
import java.util.*;
public class D02P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		
		int[] val = new int[num1];
		
		//store the values
		for (int i=0; i<val.length;i++) {
			val[i] = sc.nextInt();
		}
		int pos_cnt = 0;
		int neg_cnt = 0;
		int zero_cnt = 0;
		//write the program logic
		for (int i=0;i<val.length;i++) {
			if(val[i]>0) {
				pos_cnt++;
			}
			else if(val[i]<0) {
				neg_cnt++;
			}
			else {
				zero_cnt++;
			}
		}
		System.out.println("No of positive numbers: "+pos_cnt);
		System.out.println("No of Negative numbers: "+neg_cnt);
		System.out.println("No of Zero numbers: "+zero_cnt);
		
	}

}
