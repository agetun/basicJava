package lessons.lesson16;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        /*

        {10,29,33,47,52,643,723,818,999}  - исходный массив

        элемент для поиска - 47

        1-ая итерация:
        находим средний элемент - > index - 4 , element - 52
        сравнивает наш элемент для поиска с этим "средним элементом"
        так как наш элемент поиска меньше чем значение "среднего элемента",  то :

        2-я итерация происходит с "левой частью нашего массива"
        то есть мы будем искать наш элемент среди {10,29,33,47,52}

         находим средний элемент - > index - 2 , element - 33
        сравнивает наш элемент для поиска с этим "средним элементом"
        так как наш элемент поиска больше чем значение "среднего элемента",  то :

         3-я итерация происходит с "правой частью массива {10,29,33,47,52}"
        то есть мы будем искать наш элемент среди {33,47,52}

         находим средний элемент - > index - 3 , element - 47
        сравнивает наш элемент для поиска с этим "средним элементом"
        элемент совпал  - поиск завершен  - индекс нашего элемента в массиве - 3



        {1,3,5,7,9,12,15,19,21,26,29,35,39,43,48,50,100}  17 элементов

        ищем 19

        17 /2 =8.5

        int (8.5) = 8

        1- {1,3,5,7,9,12,15,19,21,26,29,35,39,43,48,50,100} cередина - индекс 8 элемент 21

        сравниваем наш элемент поиска 19 со значением элемента массива индекс 8 (значение 21)

        2  -я итерация поиска будет производится среди левой части элементов массива
        {1,3,5,7,9,12,15,19,21} cередина - индекс 4 элемент 9
         сравниваем наш элемент поиска 19 со значением элемента массива индекс 4 (значение 9)

         3-я итерация поиска будет производится среди правой части элементов массива
         {9,12,15,19,21} cередина - индекс 6 элемент 15
         сравниваем наш элемент поиска 19 со значением элемента массива индекс 6 (значение 15)

          4-я итерация поиска будет производится среди правой части элементов массива
         {15,19,21} cередина - индекс 7 элемент 19
         сравниваем наш элемент поиска 19 со значением элемента массива индекс 7 (значение 19)

         элементы равны - возвращаем  индекс  7 -где находится нашэлемент поиска в массиве


        1 000 000
        500 000
        250 000
        125 000
        62  500
        31 250
        15 625
        7 812
        3 906
        1953
        976
        488
        244
        122
        61
        30
        15
        7
        3
        1


         */


       int[] array = {10,29,33,47,52,643,723,818,999};
        System.out.println(Arrays.binarySearch(array,47));
    }

}