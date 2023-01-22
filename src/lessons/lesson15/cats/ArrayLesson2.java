package lessons.lesson15.cats;

public class ArrayLesson2 {
    public static void main(String[] args) {

        Breed[] breedList = new Breed[3];

        breedList[0] = new Breed(1, "Pers");
        breedList[1] = new Breed(2, "Britanec");
        breedList[2] = new Breed(3, "Shinx");


        Cat[] cats = new Cat[5];

        cats[0] = new Cat(1,"Barsik" , breedList[0]);
        cats[1] = new Cat(2,"Murzik" , breedList[1]);
        cats[2] = new Cat(3,"Lastochka", breedList[0]);
        cats[3] = new Cat(4,"Dexter" , breedList[1]);
        cats[4] = new Cat(5,"Keks" , breedList[2]);

        for (Cat cat:cats) {
            System.out.println(cat);
        }





    }
}
