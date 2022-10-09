public class Main {
    public static void main(String[] args){
        int dividers = 0;

        System.out.println("Primes from 0-100");

        for (int i=2; 99>i; i++) {
            for (int j=1; i>=j; j++) {
                if (i % j == 0){
                    dividers++;
                }
            }

            if (dividers == 2){
                System.out.print(i + " ");
            }
            dividers = 0;
        }
    }
}