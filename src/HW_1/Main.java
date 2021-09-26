package HW_1;

import javax.xml.crypto.Data;
import java.sql.Array;
import java.sql.DatabaseMetaData;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// Метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);

public class Main {
    public static ArrayList<String> arrayList = new ArrayList<>();
    static String [] array = new String[7];

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            array [i] = DayOfWeek.of(i+1).toString();
        }
        System.out.println(getArrayList(array));
        List<String> values = Arrays.asList(array); //Метод "встроенный", который преобразует массив в ArrayList;
        System.out.println(values);



    }

    //Метод, который преобразует массив в ArrayList;
    public static ArrayList<String> getArrayList (String[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            arrayList.add(arrays[i]);
        }
        return arrayList;
    }
//    List<String> values = Arrays.asList(array);

}
