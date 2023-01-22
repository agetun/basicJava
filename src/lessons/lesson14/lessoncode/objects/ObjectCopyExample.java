package lessons.lesson14.lessoncode.objects;

public class ObjectCopyExample {
    public static void main(String[] args) {

    Dog[] ourKennel = new Dog[5];

        System.out.println(ourKennel);

       ourKennel[0] = new Dog("Tuzik");
       ourKennel[1] = new Dog("Bobik");

       ourKennel[2] = ourKennel [0];

       ourKennel[3] = new Dog("Tuzik");

       ourKennel[4] = new Dog("Arlekin");


        for (int i = 0; i < ourKennel.length; i++) {

            System.out.println(ourKennel[i]);
        }




    }
}
