package homework;


import java.time.Year;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, String color) {
        this(year); // викликаючи конструктор із конструктора.
        this.color = color;
    }

    public Car(int year, String color, double speed) {
        this(year, color);
        this.speed = speed;
    }

    public Car(int year, double speed, int weight, String color) {
        this(year, color, speed);
        this.weight = weight;

    }
}

