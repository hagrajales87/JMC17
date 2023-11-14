public class MethodOverloading {

    public static void main(String[] args){

        System.out.println("New score is " + calculateScore("Tim", 500));

        System.out.println("New score is " + calculateScore(200));

        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 100;
    }

    public static int calculateScore(int score){
        return score * 100;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }

}
