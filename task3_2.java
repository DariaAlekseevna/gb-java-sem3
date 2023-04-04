import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task3_2 {
    
    public static void main(String[] args) {
        
        System.out.println("\033[H\033[2J");
        Random random = new Random();
        FillArray(random);
    }
    public static void FillArray(Random random) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            array.add(random.nextInt(1, 11));
        }
        System.out.println(array);
        Collections.sort(array); // нужно для применения метода сорт
        System.out.println(array);
    }
}
