package com.learning.core.day7;

class Node
{
	double value;
	Node next;
}

class LinkedListStack
{
	Node head;
	public LinkedListStack()
	{
		head = null;//for the first element the address is null
	}
	
	public boolean isEmpty()
	{
		return (head == null);
	}
	
	public void push(double data)
	{
		Node tempHead = head;
		head = new Node();
		head.value = data;
		head.next = tempHead;
	}
	
	public double pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		else
		{
			double popVal = head.value;
			head = head.next;
			return popVal;
		}
	}
	
    public void display() {
        Node current = head;
        System.out.print("The elements of the stack are: ");
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println("null");
    }

}
public class D07P02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListStack stack = new LinkedListStack();
        double[] input = {10.0, 20.0, 30.0, 40.0};
        
        // Pushing elements onto the stack
        for (double item : input) {
            stack.push(item);
        }
        
        // Displaying the stack
        stack.display();
        
        // Popping twice and displaying again
        stack.pop();
        stack.pop();
        System.out.print("After popping twice: ");
        stack.display();
	}

}
