public class MethodOverloadingTwo {

    private static final double inchToCentimeters = 2.54d;
    private static final int footToInches = 12;

    public static void main(String[] args){

        int inches = 68;
        System.out.println(inches +" is equals to " +convertToCentimeters(inches) + " Centimeters");

        int height = 5;
        int remainingheight = 8;

        System.out.println("Height = " + height + " cms. and Remaining heigth = " + remainingheight +
                " inches." + "This is equals to " +
                convertToCentimeters(height,remainingheight)
                + " cms.");
    }

    public static double convertToCentimeters(int inches){

        return inches*inchToCentimeters;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInches){

        // return convert ToCentimeters

        int feetToInches = heightInFeet * footToInches;
        int totalInches = feetToInches + remainingHeightInches;
        double result = convertToCentimeters (totalInches);
        return result;
    }
}
