import java.util.ArrayList;

public class task3_3 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> mylist = new ArrayList<>(); // то что в <> - дженерик типы
        for (int i = 0; i < 10; i++) {
            mylist.add((int)(Math.random()*10));
        }
        System.out.println(mylist);
        mylist.sort(null); // sort без collections, тогда нужно указывать null (компаратор - нужен для того чтобы понять каким образом сравнивать)
        System.out.println(mylist);
    }
}
