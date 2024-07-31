public class primeno {

    public static void main(String[] args) {
        int count = 0; // Counter for prime numbers
        int num = 2; // Starting number to check for primes
        
        while (count < 19) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
