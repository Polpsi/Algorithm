package Lesson6;

import java.util.Random;

public class Lesson6 {

    public static void main(String[] args) {

        int numTrees = 2000000;
        int maxVal = 1000;
        int maxHeight = 6;
        int balancedTree = 0;

        Random random = new Random();

        for (int i = 0; i < numTrees; i++) {
            MyTreeMap<Integer, Integer> tree = new MyTreeMap<Integer, Integer>();
            int value;
            do {
                value = random.nextInt(maxVal * 2)+1 - maxVal;
                tree.put(value,value);
            } while (tree.height() < maxHeight);

            if (tree.isBalance()) {
                balancedTree++;
            }
        }

        System.out.println("всего деревьев: " + numTrees + ". Сбалансированных: " + balancedTree);
        System.out.println("Процент сбалансированных: " + (balancedTree*100d)/numTrees);
    }



}
