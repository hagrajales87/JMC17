public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Tim");
        System.out.println("Hello World");

        boolean isAlien = true;
        if(isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("Amd I am scared of aliens");
        }

        int topScore = 80;
        if(topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if((topScore > secondTopScore) && (topScore <100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        boolean isCar = false;
        if(isCar){
            System.out.println("This is not supposed to happened");
        }

        isCar= false;
        if(!isCar){
            System.out.println("This is suppose to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        System.out.println(isDomestic);

        String numberOfSlots = "Three";
        int insertSlots = numberOfSlots.equalsIgnoreCase("0") ? 0 : 3;

        System.out.println("The number of slots that I am going to insert is: " + insertSlots);

        /*
         * It can be a good idea to use parentheses, like this example below, to make the code
         * more readable, particularly in the ternary operator.
         */

        int ageOfClient = 20;
        String ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still a kid";
        System.out.println("Our client is " + ageText);

        /*
         * Operator Precedence and Operator Challange
         */

        // Step 1: create a double variable with a value 0f 20.00

        double var1 = 20.00;

        // Step 2: create a second variable of type double with a value 80.00

        double var2 = 80.00;

        // Step 3. add both numbers together, then multiply by 100.00

        double var3 = 100;

        double result = (var1 + var2) * var3;

        // Step 4: use the remainder operator, to figure out what the remainder from
        // the result of the operation in step three, and 40.00, will be.

        double var4 = 40.00;

        double remainder = result % var4;

        // Step 5: create a boolean variable that assigns the value true, if remainder in step
        // four is 0.00, of false if it's not zero

        // Option 1
        // boolean isRemainderZero = (remainder == 0.00);

        // Option 2
            boolean isRemainderZero = (remainder == 0.00) ? true : false;

        // Step6: output the boolean variable just to see what the result is.

        System.out.println(isRemainderZero);

        // Step7: write an if-then statement that displays a message, 'got some remainder',
        // if the boolean in step five is not true

        if(!isRemainderZero){
            System.out.println("got some remainder " + remainder);
        }

    }
}
