import java.util.Scanner;

class Desafio5 {
    static long mdc(long m, long n) {
        if (n==0) return m;
        return mdc(n, m % n);
    }

    public static void main(String[] carai) {
        try (Scanner scan = new Scanner(System.in)) {

            int times = scan.nextInt(); scan.nextLine();

            for (int i = 0; i < times; i++) {
                // Read the two numbers
                String numbers = scan.nextLine();

                // Separate them
                int middle = numbers.indexOf(" ");
                long m = Long.parseLong(numbers.substring(0, middle));
                long n = Long.parseLong(numbers.substring(middle+1, numbers.length()));

                // Calculate MCD (Maximum Common Divisor)
                long mcd = mdc(m, n);

                // Test final result
                String message = null;
                if (m == 0 || n == 0 || mcd == 1) message = new String("Nao sera possivel produzir a pocao.");
                else message = new String("A pocao podera ser feita e seu maior fator comum eh " + mcd + ".");

                // Give final result
                System.out.println(message);
            }
        }

    }
}