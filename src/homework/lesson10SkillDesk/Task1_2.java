package homework.lesson10SkillDesk;

public class Task1_2 {

    public static void main(String[] args) {

        boolean isEdekaOpen=true;
        boolean isReweOpen=false;

        canBuy(isEdekaOpen,isReweOpen);

    }

    public static void canBuy(boolean Edeka, boolean Rewe){
        if (Edeka == true || Rewe == true){
            System.out.println("True");
        }
        else if (Edeka == false || Rewe == false) {
            System.out.println("False");
        }


        }
    }

