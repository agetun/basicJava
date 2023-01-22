package lessons.lesson14.lessoncode.objects;

public class CreateNewClassWithDifferentConstructor {

    String name;


    String town;

    int age;

    String education;

    public CreateNewClassWithDifferentConstructor(String name, String town, int age, String education) {
        this.name = name;
        this.town = town;
        this.age = age;
        this.education = education;
    }

    public CreateNewClassWithDifferentConstructor(String name, String town) {
        this.name = name;
        this.town = town;
    }

    public CreateNewClassWithDifferentConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public CreateNewClassWithDifferentConstructor(int age,  String town) {
        this.town = town;
        this.age = age;
    }

    public CreateNewClassWithDifferentConstructor(String name, String town, int age) {
        this.name = name;
        this.town = town;
        this.age = age;
    }

    public CreateNewClassWithDifferentConstructor(String name, int age, String education) {
        this.name = name;
        this.age = age;
        this.education = education;
    }

    public CreateNewClassWithDifferentConstructor( int age, String town,String education) {
        this.town = town;
        this.age = age;
        this.education = education;
    }

}
