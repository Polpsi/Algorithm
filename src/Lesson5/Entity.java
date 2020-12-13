package Lesson5;

public class Entity {
    private int weight;
    private int cost;

    public Entity(int weight, int cost) {
        this.weight = weight;
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "E{" +
                "w=" + weight +
                ", c=" + cost +
                '}';
    }
}