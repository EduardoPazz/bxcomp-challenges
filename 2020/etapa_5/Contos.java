import java.util.Scanner;

public class Contos {

public static String Texto(String texto) {
    Scanner sc = new Scanner (System.in);
    texto = sc.next();
    texto = new StringBuilder(texto).reverse().toString();
    return texto;
}

public static void main (String[] args) {
       Scanner sc = new Scanner (System.in);
       int N = Integer.parseInt (sc.nextLine());

        for (int a = 0; a<N; a++) {

            int x = Integer.parseInt(sc.nextLine());

            String texto = sc.nextLine();

            char[][] japones = new char [x][x];

            String textoInvertido = Texto(texto);
            char [] textoInvertidoArray = textoInvertido.toCharArray();

            int c = 0;

            for (int i = x; i >= 0; i--) {
                for (int j = x; j >= 0; j--) {
                    japones[i][j] = textoInvertidoArray[c++];
                }                
            }

            for (int i = x; i >= 0; i--) {
                for (int j = x; j >= 0; j--) {
                    System.out.print(japones[j][i]);
                }
                System.out.println();
            }


/*             for (char c : texto.toCharArray()) {
                char[][] japones = new char [x][x];
                japones = c.toCharArray;
                System.out.println (japones);
            } */
        }
    }
}            