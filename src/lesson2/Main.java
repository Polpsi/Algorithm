package lesson2;

import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.Random;

public class Main {

    private static Random random = new Random();
    private static int numElements = 1000000;
    private static int bound = 100000;

    public static void main(String[] args) {

        MyArrayList<Integer> mal = new MyArrayList<>(10);
        fillArray(mal,numElements);
        Instant start = Instant.now();
        mal.selectionSort(Comparator.reverseOrder());
        Instant finish = Instant.now();
        System.out.println("SelectionSort, ms;" + Duration.between(start,finish).toMillis());

        mal = new MyArrayList<>();
        fillArray(mal,numElements);
        start = Instant.now();
        mal.insertionSort(Comparator.reverseOrder());
        finish = Instant.now();
        System.out.println("InsertionSort, ms;" + Duration.between(start,finish).toMillis());

        mal = new MyArrayList<>();
        fillArray(mal,numElements);
        start = Instant.now();
        mal.bubbleSort(Comparator.reverseOrder());
        finish = Instant.now();
        System.out.println("BubbleSort, ms;" + Duration.between(start,finish).toMillis());

    }



    private static void fillArray (MyArrayList myArrayList, int numElements) {
        for (int i = 0; i < numElements; i++) {
            myArrayList.add(random.nextInt(bound));
        }
    }
}
