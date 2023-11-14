public class MinutesToYearsDaysCalculator {


    public static void main (String[] args){
        printYearsAndDays(525600);
    }

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        long remaingSeconds =  (minutes % 60);

        long hours =  (minutes / 60);
        long remaingHours = hours % 60;

        long days = hours / 24;

        long remainingDays = days % 365;
        long years = days / 365;
        System.out.println("Invalid Value");

        System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");

    }

}
