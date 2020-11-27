package lesson2;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {

    private static Random random = new Random();
    private static int numElements = 50;
    private static int bound = 1000;

    public static void main(String[] args) {

        MyArrayList<Integer> mal = new MyArrayList<>(10);
        fillArray(mal,numElements);
        System.out.println(mal);
        Instant start = Instant.now();
        mal.selectionSort(Comparator.reverseOrder());
        Instant finish = Instant.now();
        System.out.println("SelectionSort, ms;" + Duration.between(start,finish).toMillis());
        System.out.println(mal);

        mal = new MyArrayList<>();
        fillArray(mal,numElements);
        System.out.println(mal);
        start = Instant.now();
        mal.insertionSort(Comparator.reverseOrder());
        finish = Instant.now();
        System.out.println("InsertionSort, ms;" + Duration.between(start,finish).toMillis());
        System.out.println(mal);

        mal = new MyArrayList<>();
        fillArray(mal,numElements);
        System.out.println(mal);
        start = Instant.now();
        mal.bubbleSort(Comparator.reverseOrder());
        finish = Instant.now();
        System.out.println("BubbleSort, ms;" + Duration.between(start,finish).toMillis());
        System.out.println(mal);

    }



    private static void fillArray (MyArrayList myArrayList, int numElements) {
        for (int i = 0; i < numElements; i++) {
            myArrayList.add(random.nextInt(bound));
        }
    }
}
