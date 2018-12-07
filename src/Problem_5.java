//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?


public class Problem_5 {
    public static void main(String[] args){
        long num = 600851475143L;
        long largest = 0;
        for(long i = 3; i * i < num; i += 2) {
            if(num % i == 0 && isPrime(i)){
                if(i > largest) {
                    largest = i;
                }
            }
        }
        System.out.println(largest);
    }

    public static boolean isPrime(long n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0 && n != i) {
                return false;
            }
        }
        return true;
    }
}
