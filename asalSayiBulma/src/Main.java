public class Main {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int  n= 2; n<i; n++) {
                if (i % n == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}