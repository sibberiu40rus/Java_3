
package home_work_3;

import java.util.ArrayList;

public class Box<T extends Fruit> {


    private ArrayList<T> arr = new ArrayList<>();

    public Box(){}


    /**
     * Добавляем фрукты в ArrayList
     * @param obj
     * @param quantity
     */

    public void addFruitToArrayList (T obj, int quantity) {
        for (int i = 0; i < quantity; i++) {
            arr.add(obj);
        }

    }

    /**
     * Метод для сравнения веса двух коробок
     * @param box
     * @return
     */


    public boolean compare (Box box) {
        if (this.getWeight() == box.getWeight()) {
            return true;
        }else
            return false;
    }

    /**
     * Метод возвращающий вес
     * @return
     */



    public float getWeight() {
        float weightOfBox = 0.0f;
        for (T fruit : arr) {
            weightOfBox  += fruit.getWeight();
        }
        return weightOfBox;
    }

    /**
     * Перекладываем фрукты
     * @param box
     */

    public void toShiftInBox (Box<T> box) {
        box.arr.addAll(arr);
        arr.clear();
    }
}
