package lessons.lesson15.cats;

public class Breed {

    int id;
    String breedName;

    public Breed(int id, String breedName) {
        this.id = id;
        this.breedName = breedName;
    }

    @Override
    public String toString() {
        return "Breed{" +
                "id=" + id +
                ", breedName='" + breedName + '\'' +
                '}';
    }
}
