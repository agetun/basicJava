package homework.lesson17SkillDesk;

import java.util.Arrays;

/*
First level: 1. Дан массив размера  N-1  ,
который должен содержать только целые числа
в диапазоне от  1 до N . Каждое число представлено в
одном экземпляре, кроме одного числа.
Найдите недостающий элемент.

Пример 1:
Вход:
N = 5
А[] = {1,2,3,5}
Ответ: 4

Пример 2:
Вход:
N = 10
А[] = {6,1,2,8,3,4,7,10,5}
Ответ: 9
 */
public class Task1 {

    // коментарии пишу скорее для себя, чтобы понимать последовательность
    public static int getNumber(int[] arr) {

        int n = arr.length; // длина массива n-1

        int m = n + 1; // полная длина массива n + 1

        int total = m * (m + 1) / 2; // сумма целых чисел в массиве n+1

        int sum = Arrays.stream(arr).sum(); // сумма чисел в массиве n-1

        return total - sum;
    }

    public static void main(String[] args) {

        int[] arr1 = {5, 4, 1, 3}; // массив n-1 (n=5)

        System.out.println("Get number is array [5]- " + getNumber(arr1));


        int[] arr2 = {2, 4, 1, 3, 6, 7, 5, 9, 10}; // массив n-1 (n=10)

        System.out.println("Get number is array [10] - " + getNumber(arr2));
    }

}
