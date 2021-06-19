package model;

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
            System.out.println("Котик спит");
        } else {
            System.out.println("Котик голоден ");
        }
        levelOfFullness--;
    }

    public void hunts() {
        if (levelOfFullness > 0) {
            System.out.println("Котик охотится");
        } else {
            System.out.println("Котик голоден ");
        }
        levelOfFullness--;
    }

    public void play() {
        if (levelOfFullness > 0) {
            System.out.println("Котик играет с бантиком");
        } else {
            System.out.println("Котик голоден ");
        }
        levelOfFullness--;
    }

    public void chaseMouse() {
        if (levelOfFullness > 0) {
            System.out.println("Котик гоняет мышей");
        } else {
            System.out.println("Котик голоден ");
        }
        levelOfFullness--;
    }

    public void run() {
        if (levelOfFullness > 0) {
            System.out.println("Котик носится");
        } else {
            System.out.println("Котик голоден ");
        }
        levelOfFullness--;
    }

    public int eat(int satiety) {
        setLevelOfFullness(satiety + levelOfFullness);
        System.out.println("Котик поел");
        return satiety;
    }

    public int eat(int satiety, String food) {
        satiety = 4;
        food = "корм";
        setLevelOfFullness(satiety + levelOfFullness);
        System.out.println("Котик съел: " + food);
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
                    break;
                case 2:
                    hunts();
                    if (levelOfFullness <= 0) {
                        eat(3);
                    }
                    break;
                case 3:
                    play();
                    if (levelOfFullness <= 0) {
                        eat();
                    }
                    break;
                case 4:
                    chaseMouse();
                    if (levelOfFullness <= 0) {
                        eat();
                    }
                    break;
                case 5:
                    run();
                    if (levelOfFullness <= 0) {
                        eat();
                    }
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

