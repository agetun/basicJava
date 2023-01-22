package lessons.lesson14.lessoncode;

public class LessonTask2 {
    public static void main(String[] args) {
        /*
        Создайте массив из 15 случайных целых чисел из отрезка [0;9].
   Подсчитайте сколько в массиве чётных элементов и
   выведете это количество на экран на отдельной строке.

        1) создание массива
        2) заполнение случайными числами из заданного диапазона
        3) Подсчет четных элементов
        4) Вывод на экран

         */

        LessonTask2Util lessonTask2Util = new LessonTask2Util();

        int fromNumber = lessonTask2Util.inputData("from");
        int toNumber = lessonTask2Util.inputData("to");

        int sizeArray = lessonTask2Util.inputData("size");

        int[] workingArray = lessonTask2Util.createArray(sizeArray);

        lessonTask2Util.fillArray(workingArray,fromNumber,toNumber);

        int counter = lessonTask2Util.counterElements(workingArray);

        lessonTask2Util.printArray(workingArray, "Count of even elements  in our array is "+counter);


    }
}
