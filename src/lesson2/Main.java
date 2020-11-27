package lesson2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        MyArrayList<Integer> mal = new MyArrayList<>(20);
        for (int i = 0; i < 10; i++) {
            mal.add(random.nextInt(100));
        }
    }

}
