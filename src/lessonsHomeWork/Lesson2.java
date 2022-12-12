package lessonsHomeWork;

public class Lesson2 {

    public static void main(String[] args) {

        System.out.println("Hello world!");


        byte b=120;
        short s =30000;
        int i=1000000000;
        long l=10000000000l;
        float f=12.225f;
        double d=25.75879;
        char c='f';
        boolean bool=true;


        System.out.println("");
        System.out.println("Инициализация всех примитивных типов переменных и вывод их значений в консоль");
        System.out.println("");
        System.out.println("byte     " + b);
        System.out.println("short    " + s);
        System.out.println("int      " + i);
        System.out.println("long     " + l);
        System.out.println("float    " + f);
        System.out.println("double   " + d);
        System.out.println("char     " + c);
        System.out.println("boolean  " + bool);


        int x = 789;

        System.out.println("");
        System.out.println("Вывод на экран трёхзначного числа полностью и всех его цифр по отдельности");
        System.out.println("");
        String sym = String.valueOf(x);
        System.out.println(sym);
        System.out.println("Seven " + sym.charAt(0));
        System.out.println("Eight " + sym.charAt(1));
        System.out.println("Nine  " + sym.charAt(2));




    }
}