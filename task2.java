/*+
 * Даны следующие строки, сравнить их с помощью == и метода equals() класса Object
 * String s1 = 'hello'; 
 * String s2 = "hello";
 * String s3 = s1;
 * String s4 = "h" + "e" + "l" + "l" + "о"; 
 * String s5 = new String («hello»);
 * String s6 = new String(new char []{'h', 'e', ​​'l', 'l', 'o'});
 */

public class task2 {
    public static void main(String[] args) {
        // s1 и s2 и s4 константные строки, которые лежат в статической области памяти (область видимости вся программа, время жизни - вся программа)
        String s1 = "hello"; 
        String s2 = "hello"; // присваиваем ссылку на область в памяти данной константы хранится в stack
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o"; 
        // new string  создаем новый объект и кладем его к куче, в особую область памяти, кот.контролируется программистом, 
        //(время жизни вся программа, облатсь видимости, пока garbage collector не зачистит) 
        String s5 = new String("hello"); // создаем новый объект и кладем его в кучу
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'}); // тоже объект, но имеет другую ссылку
        // метод equals в классе object ("==") сравнивает ссылки на объекты в памяти
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1==s5);
        System.out.println(s1==s6);
        System.out.println(s2==s3);
        System.out.println(s2==s4);
        System.out.println(s2==s5);
        System.out.println(s2==s6);
        System.out.println(s3==s4);
        System.out.println(s3==s5);
        System.out.println(s3==s6);
        System.out.println(s4==s5);
        System.out.println(s4==s6);
        System.out.println(s5==s6);
        // метод equal в класс string сравнивает строки а не ссылки на объект в памяти, поэтому везде true
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equals(s6));
        System.out.println(s2.equals(s3));
        System.out.println(s2.equals(s4));
        System.out.println(s2.equals(s5));
        System.out.println(s2.equals(s6));
        System.out.println(s3.equals(s4));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equals(s6));
        System.out.println(s4.equals(s5));
        System.out.println(s4.equals(s6));
        System.out.println(s5.equals(s6));
        // все классы это типы данных, типы данных значений(int, char, float..)(хранятся на стыке вызовов ) 
        // и типы данных ссылочные, как строки, массивы и объекты классов(хранятся в куче)
    }
}
