package lesson3;

import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str;
        StringBuffer result = new StringBuffer();

        //task1
        str = scan.nextLine();
        MyStack<Character> stack = new MyStack<>(str.length());
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        System.out.println(result);

        //task2, class MyDeque
        str = scan.nextLine();
        result.setLength(0);
        MyDeque deque = new MyDeque<Character>(str.length()+1);

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                deque.pushFront(str.charAt(i));
            } else {
                deque.pushBack(str.charAt(i));
            }
        }

        //check as deque working
        System.out.println("peekFront: "+deque.peekFront()
                +", peekBack: "+deque.peekBack()
                +", size: "+deque.getSize());
        while (!deque.isEmpty()) {
            result.append(deque.popFront());
        }
        System.out.println(result);
    }
}