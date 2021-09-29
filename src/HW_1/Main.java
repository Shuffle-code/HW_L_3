package HW_1;

import HW_1.Fruit.Apple;
import HW_1.Fruit.BoxFruit;
import HW_1.Fruit.Fruit;
import HW_1.Fruit.Orange;

import javax.print.attribute.standard.DateTimeAtCreation;
import javax.xml.crypto.Data;
import java.sql.Array;
import java.sql.DatabaseMetaData;
import java.sql.Time;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// Метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);

public class Main {
    public static ArrayList<String> arrayList = new ArrayList<>();
    static Object [] array = new Object[7];
    static String [] arrayString = new String[7];

    public static void main(String[] args) {



        ArrayList<Apple> list = new ArrayList();
        list.add(new Apple());
        list.add(new Apple());
        Apple apple = new Apple();
        System.out.println("Вес одного яблока");
        System.out.println(apple.getWeight());


        BoxFruit<Apple> appleBoxFruit = new BoxFruit<>();
        appleBoxFruit.addFruit(new Apple());
        appleBoxFruit.addFruit(new Apple());
        appleBoxFruit.addFruit(new Apple());

        BoxFruit<Orange> orangeBoxFruit = new BoxFruit<>();
        orangeBoxFruit.addFruit(new Orange());
        orangeBoxFruit.addFruit(new Orange());
//        orangeBoxFruit.addFruit(new Orange());

        System.out.println("Вес коробок");
        System.out.println(appleBoxFruit.getWeight());
        System.out.println(orangeBoxFruit.getWeight());
        System.out.println("Вес коробок, метод №2");
        System.out.println(orangeBoxFruit.getWeightMethod());
        System.out.println("Сравнение");
        System.out.println(appleBoxFruit.compareMy(orangeBoxFruit));
        System.out.println(appleBoxFruit.compare(orangeBoxFruit));
        appleBoxFruit.pourOver(orangeBoxFruit);
        System.out.println(orangeBoxFruit.clone(appleBoxFruit));

        for (int i = 0; i < array.length; i++) {
            array [i] = DayOfWeek.of(i+1).toString();
            arrayString[i] = DayOfWeek.of(i+1).toString();
        }
        Object[] intArray = new Object[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }
        System.out.println("Метод \"getArrayList\" который возвращает ArrayList, на вход принимает массив[Object]");
        System.out.println(getArrayList(array));
        System.out.println("-----------------------");
        System.out.println("Метод \"встроенный\" в Intelli J IDEA, который преобразует массив в ArrayList");
        List<String> values = Arrays.asList(arrayString); //Метод "встроенный" в Intelli J IDEA, который преобразует массив в ArrayList;
        System.out.println(values);
        System.out.println("-----------------------");
        System.out.println("Исходный массив");
        printArray(intArray);
        swapArrayValues(intArray, 1, 4);
        System.out.println("Метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа)");
        printArray(intArray);
        swapArrayValues(array, "WEDNESDAY", "FRIDAY");
        System.out.println("-----------------------");
        System.out.println("Метод, который меняет два элемента массива местами.(массив String)");
        printArray(array);
        System.out.println("-----------------------");

    }

    //Метод, который преобразует массив в ArrayList;
    public static ArrayList<String> getArrayList (Object[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            arrayList.add(arrays[i].toString());
        }
        return arrayList;
    }
    // Метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    public static Object[] swapArrayValues (Object[] arr, Object originalValue, Object value){
        int indexOriginValue = 0;
        int indexValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(originalValue)) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j].equals(value)){
                        List<?> newList = Arrays.asList(arr);
                        indexValue = newList.indexOf(value);
                        indexOriginValue = newList.indexOf(originalValue);
                    }
                }
            }
        }
        Object temp = arr[indexValue];
        arr[indexValue] = arr[indexOriginValue];
        arr[indexOriginValue] = temp;
        return arr;
    }
    static void printArray(Object[] values){
        for (int i = 0; i < values.length; i++){
            System.out.println("[" + i + "]" + values[i]);
        }
    }



//    a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)

//    b. Класс Box в который можно складывать фрукты, коробки условно сортируются
//    по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;

//    c. Для хранения фруктов внутри коробки можете использовать ArrayList;

//    d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес
//    одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);

//    e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку
//    с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном
//    случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);

//    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про
//    ортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов
//    не остается, а в другую перекидываются объекты, которые были в этой коробке;

//    g. Не забываем про метод добавления фрукта в коробку.


}
