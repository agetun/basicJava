package homework.lesson10SkillDesk;

/*
Представим, что у нас есть устройство, в котором две колбы. Прибор работает корректно, если температура
первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов. Вы должны написать метод,
кототрый проверяет это устройство. Ваша программа должна иметь переменные Temperature1 и Temperature2.
В результате он выводит сообщение true или false.
 */
public class Task1_3 {

    public static void main(String[] args) {


        int temperature1 = 120;
        int temperature2 = 90;

        checkDevice(temperature1,temperature2);
        }

    public static void checkDevice (int t1, int t2){
        System.out.println(t1>100 && t2<100);
    }
}
