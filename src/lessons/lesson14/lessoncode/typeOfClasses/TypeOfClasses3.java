package lessons.lesson14.lessoncode.typeOfClasses;

public class TypeOfClasses3 {


    void outerMethod() {

        System.out.println("inside outerMethod");

        class Inner {
            void innerMethod() {
                System.out.println("inside innerMethod");
            }
        }

        Inner y = new Inner();
        y.innerMethod();
    }


    public static void main(String[] args) {
        TypeOfClasses3 x = new TypeOfClasses3();
        x.outerMethod();
    }
}
