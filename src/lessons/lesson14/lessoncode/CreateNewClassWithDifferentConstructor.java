package lessons.lesson14.lessoncode;

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
}
