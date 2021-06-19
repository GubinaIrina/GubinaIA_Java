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
            levelOfFullness--;
            System.out.println("Котик спит");
        } else {
            System.out.println("Котик голоден ");
        }
    }

    public void hunts() {
        if (levelOfFullness > 0) {
            levelOfFullness--;
            System.out.println("Котик охотится");
        } else {
            System.out.println("Котик голоден ");
        }
    }

    public void play() {
        if (levelOfFullness > 0) {
            levelOfFullness--;
            System.out.println("Котик играет с бантиком");
        } else {
            System.out.println("Котик голоден ");
        }
    }

    public void chaseMouse() {
        if (levelOfFullness > 0) {
            levelOfFullness--;
            System.out.println("Котик гоняет мышей");
        } else {
            System.out.println("Котик голоден ");
        }
    }

    public void washes() {
        if (levelOfFullness > 0) {
            levelOfFullness--;
            System.out.println("Котик умывается");
        } else {
            System.out.println("Котик голоден ");
        }
    }

    public void eat(int satiety) {
        setLevelOfFullness(satiety + levelOfFullness);
        System.out.println("Котик ест");
    }

    public void eat(int satiety, String food) {
        setLevelOfFullness(satiety + levelOfFullness);
        System.out.println("Котик ест " + food);
    }

    public void eat() {
        eat(5, "корм");
    }

    public void liveAnotherDay() {
        int x = 0;
        while (x < 24) {
            out.println(x + 1);
            x++;
            int grade = (int) (Math.random() * 5 + 1);
            switch (grade) {
                case 1:
                    if (levelOfFullness <= 0) {
                        eat();
                    }
                    sleep();
                    break;
                case 2:
                    if (levelOfFullness <= 0) {
                        eat();
                    }
                    hunts();
                    break;
                case 3:
                    if (levelOfFullness <= 0) {
                        eat();
                    }
                    play();
                    break;
                case 4:
                    if (levelOfFullness <= 0) {
                        eat();
                    }
                    chaseMouse();
                    break;
                case 5:
                    if (levelOfFullness <= 0) {
                        eat();
                    }
                    washes();
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

