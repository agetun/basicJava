package lessons.lesson15.students;

public class Students {

    int id;
    Person student;

    String group;

    public Students(int id, Person student, String group) {
        this.id = id;
        this.student = student;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", student=" + student +
                ", group='" + group + '\'' +
                '}';
    }
}
