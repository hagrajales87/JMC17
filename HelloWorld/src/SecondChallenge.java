public class SecondChallenge {

    public static void main(String[] args) {
        int seconds =3945;
        System.out.println(getDurationString(seconds));

        System.out.println(getDurationString(65,45));
    }

    public static String getDurationString(int seconds){

        if(seconds > 0){
            int s= (seconds % 60);
            int m=0;
            int h=0;
            if((seconds / 60) > 60) {
                h = seconds/3600;
                m = (seconds/60)%60;
            }
            else{
                m = seconds / 60;
            }
            return h+"h " + m+"m " + s + "s";
        }
        return "seconds must be grater than 0";

    }

    public static String getDurationString(int minutes, int seconds) {
        int m=minutes;
        int h=0;
        if(seconds >= 0 && seconds <=59){
            if(minutes > 0){
                if(minutes > 60){
                    h = minutes/60;
                    m = (minutes)%60;

                    return h+"h " + m+"m " + seconds + "s";
                }else{
                    return h+"h " + m+"m " + seconds + "s";
                }
            }else{
                return "minutes must be grater than 0";
            }

        }
        return "seconds must be grater than 0 and minus of 59";
    }

}
