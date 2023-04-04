import java.util.ArrayList;
import java.util.Iterator;

public class task4 {
    
    public static void main(String[] args) {
        // чем массив отличается от коллекции?
        // длинна задана, так просто уже ее не изменить, таких методов ккак сорт ремуув и тд уже нет
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        // в коллекции много методов
        ArrayList<Integer> col = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            col.add(array[i]);
        }
        System.out.println(col);
        // в коллекции можно проходить циклом for, например для вывода элементов
        for (int i = 0; i < col.size(); i++) {
            System.out.print(col.get(i) + " ");
        }
        System.out.println();

        // итератор
        for (Iterator<Integer> iterator = col.iterator(); iterator.hasNext();) {
            System.out.print(iterator.next() + " ");
        }
    }
}
