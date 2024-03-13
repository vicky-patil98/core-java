package com.learning.core.day8;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class D08P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queueList = new LinkedList<>();

        System.out.println("Enter elements to enqueue (separated by spaces, enter -1 to stop): ");
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equals("-1")) {
                break;
            }
            queueList.add(input);
        }

        //System.out.println("Queue Elements: " + queueList);

        // Check if the queue is empty
        boolean isEmpty = queueList.isEmpty();
        if (isEmpty) {
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }

        scanner.close();
    }
}
