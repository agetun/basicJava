package homework.lesson4HW;

public class Robot {

    String name;
    public void sayHello() {

        System.out.println("Hello");
    }

    public Robot(String name) {
        this.name = name;
    }

    public void sayYourName(){
        System.out.println("My name is " + this.name);
    }
}
