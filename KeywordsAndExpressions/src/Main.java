public class Main {


    public static void main (String[] args){


        boolean gameOver = true;
        int score = 7000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score <= 5000){
            System.out.println("Your score is less than or equal to 5000");
        } else if( score > 5000 && score < 7000){
            System.out.println("Your score is greater than 5000 and less than 7000");
        }else{
            System.out.println("Your score is equals or greater than 7000");
        }
    }
}