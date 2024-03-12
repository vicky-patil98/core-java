package com.learning.core.day7;

class Stack{
	int n;
	String arr[];
	int top;
	
	public Stack(int n) {
		this.n = n;
		this.arr = new String[n];
		this.top = -1;
	}
	
	public boolean isFull()
	{
		return (n-1 == top);
	}
	
	public void push(String data)
	{
		if (isFull())
		{
			System.out.println("Stack is Full");
		}
		else {
			top++;
			arr[top] = data;
		}
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	public String pop()
	{
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return null;
		}
		else
		{
			String val = arr[top];
			top--;
			return val;
		}
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else {
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
		}
	}
}
public class D07P01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack stack = new Stack(5);
        System.out.println("After Pushing 4 Elements:");
        stack.push("Hello");
        stack.push("world");
        stack.push("java");
        stack.push("Programming");
        stack.display();

        System.out.println("After a Pop:");
        stack.pop();
        stack.display();
	}

}
