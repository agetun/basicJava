package lessons.lesson14.lessoncode.typeOfClasses;

public class TypeOfClasses {

    class Inner {
       public void show (){
           System.out.println("In a nested class method");
       }
    }
    public static void main(String[] args) {
        Inner inner = new TypeOfClasses().new Inner();
        inner.show();
    }
}
