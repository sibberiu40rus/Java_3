package home_work_3;

public class Home_work_3 {


    public static void main(String[] args) {

        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxForApple = new Box<>();
        Box<Apple> boxForApple2 = new Box<>();
        Box<Orange> boxForOrange = new Box<>();
        Box<Orange> boxForOrange2 = new Box<>();

        boxForApple.addFruitToArrayList(new Apple(), 50);
        boxForApple2.addFruitToArrayList(new Apple(), 50);
        boxForOrange.addFruitToArrayList(new Orange(), 100);
        boxForOrange2.addFruitToArrayList(new Orange(), 100);

        boxForApple.toShiftInBox(boxForApple);


        System.out.println(boxForApple.getWeight());
        System.out.println(boxForApple2.getWeight());

        System.out.println(boxForOrange.getWeight());

        System.out.println("Результат сравнения коробок: " + boxForApple2.compare(boxForApple));

    }
}
