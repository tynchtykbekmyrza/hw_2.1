public class Main {
    public static void main(String[] args) {
        agePersonAndOutsideTemperature(18, 4);
        agePersonAndOutsideTemperature(21, -17);
        agePersonAndOutsideTemperature(15, 15);
        agePersonAndOutsideTemperature(45, 22);
        agePersonAndOutsideTemperature(46, -12);

    }

    public static String agePersonAndOutsideTemperature(int agePerson, int OutsideTemperature) {

        if (agePerson >= 20 && agePerson <= 45 && (OutsideTemperature >= -20 && OutsideTemperature <= 30)) {
            System.out.println("Можно идти гулять");
        }
        else if (agePerson <= 20 && (OutsideTemperature >= 0 && OutsideTemperature <= 28) ) {            {
            System.out.println("Можно идти гулять");
        }
        } else if (agePerson >= 45) {
            if (OutsideTemperature >= -10 && OutsideTemperature <= 25) {
                System.out.println("Можно идти гулять");
            } else {
                System.out.println("Оставайтесь дома!");
            }
        }
        return "Возраст человека = " + agePerson + " Температура на улице = " + OutsideTemperature;
    }
}