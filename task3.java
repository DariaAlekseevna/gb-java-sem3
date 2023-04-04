import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
 * заполнить список десятью случайными числами
 * отсортировать список методом sort() и вывести его на экран
 */
public class task3 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list1 = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list1.add(i, random.nextInt(100));
        }
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        // for (Integer integer : list1) {
        //     System.out.print(" "+integer);
        // }
        
    }
}
