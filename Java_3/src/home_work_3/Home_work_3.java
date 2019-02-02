/**
 * @version 02.02.2019
 * @autor Martynyuk Alexey
 * Java_3 Lesson_1
 */
package home_work_3;

public class Home_work_3 {


    public static void main(String[] args) {

        Box<Apple> boxForApple = new Box<>();
        Box<Apple> boxForApple2 = new Box<>();
        Box<Orange> boxForOrange = new Box<>();
        Box<Orange> boxForOrange2 = new Box<>();

        boxForApple.addFruitToArrayList(new Apple(), 50);
        boxForApple2.addFruitToArrayList(new Apple(), 50);
        boxForOrange.addFruitToArrayList(new Orange(), 100);
        boxForOrange2.addFruitToArrayList(new Orange(), 100);

        boxForApple.toShiftInBox(boxForApple2);
        


        System.out.println(boxForApple.getWeight());
        System.out.println(boxForApple2.getWeight());

        System.out.println(boxForOrange.getWeight());
        System.out.println(boxForOrange2.getWeight());

        System.out.println("Результат сравнения коробок: " + boxForApple2.compare(boxForApple));
        System.out.println("Результат сравнения коробок: " + boxForOrange.compare(boxForOrange2));

    }
}
