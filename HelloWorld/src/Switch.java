public class Switch {

    public static void main(String[] args){
        int value = 2;

        switch (value) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + value);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, 5");
        }

        String month = "ASDF";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");

        System.out.println(SwitchChallenge('B'));

        System.out.println(printDayOfWeek(7));
    }

    public static String getQuarter(String month){
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3th";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }

    public static String SwitchChallenge(char letter){
        return switch (letter) {
            case 'A' -> "Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            case 'D' -> "dog";
            case 'E' -> "Easy";
            default -> "not found";
        };
    }

    public static String printDayOfWeek(int day){
        return switch (day){
            case 0 -> {yield "Sunday";}
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";

        };
    }

    public static void printNumberInWord(int number){

        String NumberInWord = switch(number){
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "other";

        };

        System.out.println(NumberInWord);
    }

    public static int getDaysInMonth(int month, int year){
        if((year < 1 || year > 9999)){
            return -1;
        }else{

            return switch(month){
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> {
                    if(isLeapYear(year)){
                        yield 29;
                    }

                    yield 28;
                }
                case 4, 6, 9, 11 -> 30;
                default -> -1;
            };
        }

    }

    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){

            if(year == 1600 || year == 2000 || year == 2400){
                return true;
            }else if((year % 4) == 0 && !((year % 100) == 0)){
                return true;
            }else if(year == 1700 || year == 1800 || year == 1900 || year == 2100 || year == 2200 || year == 2300 || year == 2500 || year == 2600){
                return false;

            }else if((year % 100) == 0 && !((year % 400) == 0)){
                return true;
            }else{
                return false;
            }

        }else{
            return false;
        }
    }
}
