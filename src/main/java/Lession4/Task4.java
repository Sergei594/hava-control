package Lession4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task4 {

    public static void main(String[] args) {
        String[] arr ={"1","2","3","4"};
        printQueue(arr);
    }

    public static void printStack(String[] arr) {
        Stack<String> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));
//        System.out.println(stack);
        while (stack.empty()){
            System.out.println(stack.pop());
        }

    }

    public static void printQueue(String[] arr) {
        Queue<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(arr));
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
