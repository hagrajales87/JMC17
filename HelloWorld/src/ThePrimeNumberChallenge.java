public class ThePrimeNumberChallenge {

    public static void main(String[] args){

        int primeNumberCounter = 0;

        for(int number = 0 ; primeNumberCounter < 3 && number <= 1000 ; number ++){
            boolean isAPrimeNumber = isPrime(number);
            if(isAPrimeNumber) {
                System.out.println(number + " is " + (isPrime(number) ? " " : "NOT ") + "a prime number");
                primeNumberCounter ++;
            }
        }


    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            return  (wholeNumber == 2);
        }

        for(int divisor = 2; divisor < wholeNumber ; divisor ++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
