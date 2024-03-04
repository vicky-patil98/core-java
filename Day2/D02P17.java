package com.learning.core.day2;
import java.util.*;
public class D02P17 {

	public static void main(String[] args) 	{
		
		int i,count;
        System.out.print("Enter n value : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int j=2;j<=n;j++)
		{
			count=0;
			for(i=1;i<=j;i++)
			{
				if(j%i==0)
				{
				     count++;        
				}
			}
			if(count==2)
			    System.out.print(j+"  ");     
		}
	}

}
