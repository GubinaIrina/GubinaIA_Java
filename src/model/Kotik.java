package model;

import static java.lang.String.*;
import static java.lang.System.out;

public class Kotik {
    private int prettiness;
    private int weight;
    private String name;
    private String meow;
    private static int levelOfFullness;

    private static int count;

    public Kotik() {
        count++;
    }

    public Kotik(int prettiness, int weight, String name, String meow, int levelOfFullness) {
        count++;
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        this.levelOfFullness = levelOfFullness;
    }

    public void setKotik(int prettiness, int weight, String name, String meow, int levelOfFullness) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        this.levelOfFullness = levelOfFullness;
    }

    public void sleep() {
        if (levelOfFullness > 0) {
            System.out.print("Котик спит");
        } else {
            System.out.print("Котик голоден ");
        }
    }

    public void hunts() {
        if (levelOfFullness > 0) {
            System.out.print("Котик охотится");
        } else {
            System.out.print("Котик голоден ");
        }
    }

    public void play() {
        if (levelOfFullness > 0) {
            System.out.print("Котик играет с бантиком");
        } else {
            System.out.print("Котик голоден ");
        }
    }

    public void chaseMouse() {
        if (levelOfFullness > 0) {
            System.out.print("Котик гоняет мышей");
        } else {
            System.out.print("Котик голоден ");
        }
    }

    public void run() {
        if (levelOfFullness > 0) {
            System.out.print("Котик носится");
        } else {
            System.out.print("Котик голоден ");
        }
    }

    public int eat(int satiety) {
        setLevelOfFullness(satiety + levelOfFullness);
        System.out.print("Котик поел");
        return satiety;
    }

    public int eat(int satiety, String food) {
        satiety = 4;
        food = "корм";
        setLevelOfFullness(satiety + levelOfFullness);
        System.out.print("Котик съел: " + food);
        return satiety;
    }

    public void eat() {
        eat(5, "корм");
    }

    public void liveAnotherDay() {
        int x = 0;
        while (x < 24) {
            x++;
            int grade = (int) (Math.random() * 5 + 1);
            switch (grade) {
                case 1:
                    sleep();
                    if (levelOfFullness <= 0) {
                        eat();
                    }
                    levelOfFullness--;
                    out.print("\n");
                    break;
                case 2:
                    hunts();
                    if (levelOfFullness <= 0) {
                        eat(3);
                    }
                    levelOfFullness--;
                    out.print("\n");
                    break;
                case 3:
                    play();
                    if (levelOfFullness <= 0) {
                        eat();
                    }
                    levelOfFullness--;
                    out.print("\n");
                    break;
                case 4:
                    chaseMouse();
                    if (levelOfFullness <= 0) {
                        eat();
                    }
                    levelOfFullness--;
                    out.print("\n");
                    break;
                case 5:
                    run();
                    if (levelOfFullness <= 0) {
                        eat();
                    }
                    levelOfFullness--;
                    out.print("\n");
                    break;
            }
        }
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getMeow() {
        return meow;
    }

    public int getCount() {
        return count;
    }

    public static void setLevelOfFullness(int levelOfFullness) {
        Kotik.levelOfFullness = levelOfFullness;
    }
}

