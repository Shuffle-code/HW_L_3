package HW_1.Fruit;

import java.util.ArrayList;

public class BoxFruit<T extends Fruit> {
    private ArrayList<T> boxFruit;

    public BoxFruit() {
        this.boxFruit = new ArrayList<>();
    }


    public void addFruit(T fruit) {
        boxFruit.add(fruit);
    }

    public void add(ArrayList<T> fruit) {
        boxFruit.addAll(fruit);
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : boxFruit) {
            weight = weight + fruit.getWeight();
        }
        return weight;
    }

    public float getWeightMethod(){
        float w = boxFruit.get(1).getWeight();
        w = w * boxFruit.size();
        return w;
    }


    public boolean compareMy(BoxFruit<? extends Fruit> fruitBox) {
        return (fruitBox.getWeight() == this.getWeight());
    }
    public boolean compare(BoxFruit<? extends Fruit> fruitBox) {
        return Math.abs(fruitBox.getWeight() - this.getWeight()) < 0.00001;
    }

    public void pourOver(BoxFruit<T> box){
        box.boxFruit.addAll(boxFruit);
        boxFruit.clear();
    }

    private void clone(BoxFruit<T> box) {
        box.boxFruit.addAll(boxFruit);
    }


}
