import java.util.*;

class Narciso {
    static int fatorial (int f1, int f2) {
        int times = f1-f2;

        int result = 1;

        for (int i = 0; i < times; i++, f1--) {
            result *= f1;
        }

        return result;
    }

    public static void main(String[] args) {
        int times = 0; 
        char[] factor1;
        char operation;
        char[] factor2;
        boolean jumpTo2 = false;

        try (Scanner scan = new Scanner(System.in)) {

            times = scan.nextInt(); scan.nextLine();

            for (int i = 0; i < times; i++) {

                String str = scan.nextLine();

                char[] arrChar = str.toCharArray();

                int middle;

                for (middle = 0; middle < arrChar.length; middle++) {

                    if (
                        (int) arrChar[middle] == 110 ||
                        (int) arrChar[middle] == 97 ||
                        (int) arrChar[middle] == 114 ||
                        (int) arrChar[middle] == 99 ||
                        (int) arrChar[middle] == 105 ||
                        (int) arrChar[middle] == 115 ||
                        (int) arrChar[middle] == 111
                    ) break;
                }

                factor1 = new char[middle];

                for (int j = 0; j < middle; j++) {
                    factor1[j] = arrChar[j];
                }

                factor2 = new char[arrChar.length - middle - 1];

                for (int j = middle + 1; j < arrChar.length; j++) {
                    factor2[j - middle - 1] = arrChar[j];
                }    

                operation = arrChar[middle];

                String fac1 = new String(factor1);
                String fac2 = new String(factor2);

                int f1 = Integer.parseInt(fac1);
                int f2 = Integer.parseInt(fac2);


                switch (operation) {
                    case 'n': System.out.println(f1 + f2);
                    break;
                    case 'a': System.out.println(f1 - f2);
                    break;
                    case 'r': System.out.println(f1 * f2);
                    break;
                    case 'c': System.out.println(f1 / f2);
                    break;
                    case 'i': System.out.println(fatorial(f1, f2));
                    break;
                    case 's': System.out.println(f1 % f2);
                    break;
                    case 'o': System.out.println((int) Math.pow(f1, f2));
                    break;
                }
            }
        }
    }
}