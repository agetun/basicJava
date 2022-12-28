package homework.lesson10SkillDesk;

public class Task1_1 {

    /*
    First level: - Создайте две переменные isWeekend и isRain. Создайте переменную canWalk,
    значение которой должно быть истинным, если это выходной день (isWeekend=true) и не идет дождь (isRain=false).
     */
    public static void main(String[] args) {


        boolean isWeekend = true;
        boolean isRain = false;

        boolean canWalk = isWeekend || isRain;

        System.out.println(canWalk);

    }
}