package lessons.lesson14.lessoncode;

public class LessonTask1 {
    public static void main(String[] args) {

        /*
        Создайте массив из всех нечётных чисел от 1 до 99,
    выведите его на экран в строку в обратном порядке

    // определить размер массива
    // создание массива
    // наполнение массива
            // вычисление четное или нечетное число
    // вывод на экран

         */

    LessonTask1Util lessonTask1Util = new LessonTask1Util();

    int fromNumber = lessonTask1Util.inputData("from");
    int toNumber = lessonTask1Util.inputData("to");

    int arraySize = lessonTask1Util.detectArraySize(fromNumber,toNumber);

    //int[] workingArray = new int [arraySize]

    int [] workingArray = lessonTask1Util.createArray(arraySize);

    lessonTask1Util.fillArray(workingArray,fromNumber,toNumber);

    lessonTask1Util.printArray(workingArray);


    }
}
