package lessons.lesson15.students;

public class OurStudentsGroup {
    public static void main(String[] args) {

        Person[] listOfPersons = new Person[5];

        listOfPersons[0] =  new Person(1,"Petr",  19);
        listOfPersons[1] =  new Person(2,"Anna", 18);
        listOfPersons[2] =  new Person(3,"Viktor", 21);
        listOfPersons[3] =  new Person(4,"Ruslan", 19);
        listOfPersons[4] =  new Person(5,"Pavel", 18);


        Students[] listOfStudents = new Students[4];

        listOfStudents[0] =  new Students(1, listOfPersons[0], "Group #1");
        listOfStudents[1] =  new Students(2, listOfPersons[1], "Group #1");
        listOfStudents[2] =  new Students(3, listOfPersons[3], "Group #1");
        listOfStudents[3] =  new Students(4, listOfPersons[4], "Group #1");


//        System.out.println(listOfPersons);
//        System.out.println(Arrays.toString(listOfPersons));
//        System.out.println("-----------");
//        System.out.println(listOfStudents);
//        System.out.println(Arrays.toString(listOfStudents));

        System.out.println("List of abbiturients:");

        for (int i = 0; i < listOfPersons.length; i++) {
            System.out.println("Name of abbiturient - " + listOfPersons[i].name + " Age - "+listOfPersons[i].age);

        }

        System.out.println("------------");
        System.out.println("List of students:");

        for (int i = 0; i < listOfStudents.length; i++) {

            System.out.println("Name of student - " + listOfStudents[i].student.name + " Group - "+ listOfStudents[i].group);

        }


        listOfPersons[4].name = "Sergej";

        System.out.println("------------");
        System.out.println("List of students:");

        for (int i = 0; i < listOfStudents.length; i++) {

            System.out.println("Name of student - " + listOfStudents[i].student.name + " Group - "+ listOfStudents[i].group);

        }

        //===========================================

        for (Students tempStudent : listOfStudents) {
            System.out.println(tempStudent.student.name);
        }

    }
}
