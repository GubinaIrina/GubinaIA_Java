import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik1 = new Kotik(8, 13, "Рыжий", "мяу", 0);
        System.out.print("Вес котика: " + kotik1.getWeight() + " кг" + "\n");
        System.out.print("Имя котика: " + kotik1.getName() + "\n");
        kotik1.liveAnotherDay();

        Kotik kotik2 = new Kotik();
        kotik2.setKotik(9, 15, "Компот", "миу", 3);

        if (kotik1.getMeow() == kotik2.getMeow()) {
            System.out.print("Котики мяукают одинаково \n");
        } else {
            System.out.print("Котики мяукают по разному \n");
        }

        System.out.print("Создано котиков: " + kotik1.getCount());
    }
}
