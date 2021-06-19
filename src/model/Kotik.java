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
        count++;
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
            System.out.print("Котик голоден");
        }
    }

    public void hunts() {
        if (levelOfFullness > 0) {
            System.out.print("Котик охотится");
        } else {
            System.out.print("Котик голоден");
        }
    }

    public void play() {
        if (levelOfFullness > 0) {
            System.out.print("Котик играет с бантиком");
        } else {
            System.out.print("Котик голоден");
        }
    }

    public void chaseMouse() {
        if (levelOfFullness > 0) {
            System.out.print("Котик гоняет мышей");
        } else {
            System.out.print("Котик голоден");
        }
    }

    public void run() {
        if (levelOfFullness > 0) {
            System.out.print("Котик носится");
        } else {
            System.out.print("Котик голоден");
        }
    }

    public int eat(int satiety) {
        setLevelOfFullness(satiety + levelOfFullness);
        System.out.print("Котик поел \n");
        return satiety;
    }

    public int eat(int satiety, String food) {
        setLevelOfFullness(satiety + levelOfFullness);
        System.out.print("Котик съел: " + food + "\n");
        return satiety;
    }

    public void eat() {
        eat();
    }

    public void liveAnotherDay() {
        if (levelOfFullness <= 0) {
            eat(5);
            int x = 0;
            while (x < 24) {
                x++;
                int grade = (int) (Math.random() * 5 + 1);
                switch (grade) {
                    case 1:
                        sleep();
                        out.print("\n");
                        break;
                    case 2:
                        hunts();
                        out.print("\n");
                        break;
                    case 3:
                        play();
                        out.print("\n");
                        break;
                    case 4:
                        chaseMouse();
                        out.print("\n");
                        break;
                    case 5:
                        run();
                        out.print("\n");
                        break;
                }
            }
        }
    }

    public int getPrettiness() {
        return prettiness;
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

    public int getLevelOfFullness() {
        return levelOfFullness;
    }

    public int getCount() {
        return count;
    }

    public static void setLevelOfFullness(int levelOfFullness) {
        Kotik.levelOfFullness = levelOfFullness;
    }
}

