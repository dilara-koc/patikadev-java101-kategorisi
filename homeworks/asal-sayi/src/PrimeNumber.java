public class PrimeNumber {
    public static void main(String[] args) {

        //Finding the prime numbers between the range of 1 - 100
        for (int number = 2; number <= 100; number++){
            boolean isPrime = true;
            for (int i = 2; i < number ; i++){
                if (number % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(number +" ");
            }
        }
    }
}
