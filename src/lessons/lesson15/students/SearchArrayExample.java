package lessons.lesson15.students;

public class SearchArrayExample {
    public static void main(String[] args) {

        // создаем массив целых чисел и задаем значение которое мы хотим найти в нашем массиве

        int[] workingArray = {1,2,3,4,5,6,7,8,9};
        int searchElement = 25;

        // вызываем метод поиска

        int indexAfterSearch = linearSearch(workingArray,searchElement);

        // выводим результпат поиска

        if (indexAfterSearch>-1){

            System.out.println("In our array element " + searchElement + " have index "+indexAfterSearch);
        } else {
            System.out.println("In the our array element "+searchElement + " doesn't find");
        }

        System.out.println("Our array last number is "+workingArray[workingArray.length-1]);
        System.out.println("Our array previous number is "+workingArray[workingArray.length-2]);


    }

    public static int linearSearch(int[] workingArray,int element){
        // в цикле проходим по всему массиву
        //сравниваем текущий элемент массива с элементом-поиска
        // если они равны -значит мы нашли элемент-поиска в нашем массиве и возвращаем индекс
        //если цикл завершен и мы ничего не нашли то возвращаем -1

        for (int index = 0; index < workingArray.length; index++) {
            if(workingArray[index] == element) {return index;}}

        return -1;
    }

}
