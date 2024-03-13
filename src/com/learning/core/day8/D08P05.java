package com.learning.core.day8;


import java.util.Scanner;

class Queue2
{
    int front = -1;
    int rear = -1;
    int arr[];
    int n;

    public Queue2(int n)
    {
        this.n = n;
        arr = new int[n];
    }

    public boolean isFull()
    {
        return rear == n-1;
    }

    public boolean isEmpty()
    {
        return front == -1 && rear == -1;
    }

    public void enqueue(int data)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
        }
        else if(isEmpty())
        {
            rear = front = 0;
            arr[rear] = data;
        }
        else{
            rear++;
            arr[rear] = data;
        }
    }

    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        else if(front == rear)
        {
            int top = arr[front];
            front = rear = -1;
            return top;
        }
        else{
            int top = arr[front];
            front++;
            return top;
        }
    }
    public void display() {
        for (int i = this.front; i <= this.rear; i++) {
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }
}

public class D08P05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Queue");
        int n = sc.nextInt();

        Queue2 q1 = new Queue2(n);

        System.out.println("Enter the queue elements");
        while(!q1.isFull())
        {
            q1.enqueue(sc.nextInt());
        }

        Queue2[] arrQ = new Queue2[2];
        Queue2 evenQueue = new Queue2(n);
        Queue2 oddQueue = new Queue2(n);

        arrQ[0] = evenQueue;
        arrQ[1] = oddQueue;

        while(!q1.isEmpty())
        {
            int data = q1.dequeue();
            if (data % 2 == 0) {
                evenQueue.enqueue(data);
            } else {
                oddQueue.enqueue(data);
            }
        }
        System.out.print("Odd Queue: ");
        oddQueue.display();

        System.out.print("Even Queue: ");
        evenQueue.display();


    }
}

