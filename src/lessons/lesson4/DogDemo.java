package lessons.lesson4;

public class DogDemo {

    public static void main(String[] args) {

        Dog myDog = new Dog();

        myDog.name = "Lessy";
        myDog.breed = "Kolli";
        myDog.age = 3;

        myDog.voice("Gav! Gav! Gav!");

        myDog.age = myDog.age+1;

        System.out.println(myDog);

        Dog myDog2 = new Dog("Tuzik", 5);



    }
}
