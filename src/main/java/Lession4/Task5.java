package Lession4;

import java.util.Optional;

public class Task5 {


    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        stack.pop();

        System.out.println(stack);
    }
}
