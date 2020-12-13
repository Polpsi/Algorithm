package Lesson5;

import java.util.ArrayList;

public class Lesson5 {


    public static void main(String[] args) throws Exception {
        System.out.println(exponent(2,11));
        System.out.println(exponent(8,-2));

        Backpack backpack = new Backpack(20);
        Entity[] entities = {
                new Entity(2, 36),  //1 kg = 18
                new Entity(7, 21), // 3
                new Entity(4, 28), // 7
                new Entity(6, 42), // 7
                new Entity(8, 200), // 25
                new Entity(5, 80), // 14
        };
        CarryingCapacity carryingCapacity = new CarryingCapacity(entities, backpack);
        ArrayList<Entity> enti = carryingCapacity.getTopCapacity();
        int totalCost = 0;
        for (Entity e: enti) {
            System.out.println(e.toString());
            totalCost += e.getCost();
        }
        System.out.println("total cost: " + totalCost);

    }

    private static double exponent (double base, int degree) throws Exception {
        if ( base == 0 && degree == 0) {
            throw new Exception("До сих пор нет единого мнения - чему равен ноль в степени ноль. Единице или не имеет смысла.");
        }
        if (degree == 0) return 1;
        else if (degree < 0) return 1/base * exponent(base,++degree);
        else return base * exponent(base, --degree);
    }

}
