package home_work_3;

public class Apple extends Fruit {
    private float weight = 1.0f;

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public void setWeight(float weight) {
        this.weight = weight;
    }
}
