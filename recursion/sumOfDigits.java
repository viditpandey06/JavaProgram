package recursion;

public class sumOfDigits {
    public static void main(String[] args) {

        System.out.println(sum(1234));
    }

    public static long sum(long n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + (sum(n / 10));
        }
    }
}
