import java.util.Random;

public class Main {
    public static  int generateRandomAgePerson() {
        Random random1 = new Random();
        int agePerson = random1.nextInt(0, 80);
        return agePerson;
    }
    public static void main(String[] args) {

        System.out.println(agePersonAndOutsideTemperature(18, 4));
        System.out.println(agePersonAndOutsideTemperature(generateRandomAgePerson(), -5));
        System.out.println(agePersonAndOutsideTemperature(34, 13));
        System.out.println(agePersonAndOutsideTemperature(25, 10));
        System.out.println(agePersonAndOutsideTemperature(generateRandomAgePerson(), -30));

    }

    public static String agePersonAndOutsideTemperature(int agePerson, int OutsideTemperature) {
        generateRandomAgePerson();

        if (agePerson >= 20 && agePerson <= 45 && (OutsideTemperature >= -20 && OutsideTemperature <= 30)) {
            return "Можно идти гулять";
        }
        else if (agePerson <= 20 && (OutsideTemperature >= 0 && OutsideTemperature <= 28) ) {            {
            return "Можно идти гулять";

        }
        } else if (agePerson > 45 && OutsideTemperature >= -10 && OutsideTemperature <= 25) {
                return "Оставайтесь дома";
            } else {
                return "Оставайтесь дома!";


            }
        }
    }
