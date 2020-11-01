import java.util.Scanner;

class Oxala {

    static boolean testeDosDigitos(int p) {
        String strInt = String.valueOf(p);

        char[] charInt = strInt.toCharArray();

        int soma = 0;

        for (int i = 0; i < charInt.length; i++) {
            soma += Character.getNumericValue(charInt[i]);
        }

        return (soma % 3 == 0);
    }


    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int times = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < times; i++) {
                boolean ehValido = true;

                int c = Integer.parseInt(scan.nextLine());
                int b = Integer.parseInt(scan.nextLine());
                int t = Integer.parseInt(scan.nextLine());
                int p = Integer.parseInt(scan.nextLine());
                
            
                

                if (c != (t/3)) ehValido = false;
                
                if (!(p - b >= 10)) ehValido = false;
                
                if (!testeDosDigitos(p)) ehValido = false;
                
                if (
                    t <= c ||
                    t <= b ||
                    t <= p
                ) ehValido = false;
                

                if (ehValido) System.out.println("Ta  com  a  balanca  na mao em Oxala.");
                else System.out.println("Ta querendo fazer um monstro ??");
            }
        }
    }
}