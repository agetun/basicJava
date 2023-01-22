package lessons.lesson14.lessoncode.typeOfClasses;

public class TypeOfClasses2 {


    public static void main(String[] args) {

        Inner.show();
    }

    static class Inner {
        public static void show(){
            System.out.println("In a nested class method");
        }
    }
}
