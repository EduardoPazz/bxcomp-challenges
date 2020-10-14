import java.util.Scanner;

/* Passos

    1. Pegar String
    2. Separar string (usar split)
    3. Converter de binário pra inteiro (função nativa)
    4. Converter de inteiro para letra (função que teremos que implementar)

*/

class Desafio2 {

    static char Alien2Pt(int num) {
        if (num < 0) num += 26;

        switch (num) {
            case 0: return 'a';
            case 1: return 'b';
            case 2: return 'c';
            case 3: return 'd';
            case 4: return 'e';
            case 5: return 'f';
            case 6: return 'g';
            case 7: return 'h';
            case 8: return 'i';
            case 9: return 'j';
            case 10: return 'k';
            case 11: return 'l';
            case 12: return 'm';
            case 13: return 'n';
            case 14: return 'o';
            case 15: return 'p';
            case 16: return 'q';
            case 17: return 'r';
            case 18: return 's';
            case 19: return 't';
            case 20: return 'u';
            case 21: return 'v';
            case 22: return 'w';
            case 23: return 'x';
            case 24: return 'y';
            case 25: return 'z';
            default: return ' ';
        }
    }


    public static void main(String args[]) {
        try (Scanner scan = new Scanner(System.in)) {

            String binariesStr = scan.nextLine();

            /* String bi = "10101";

            int biInt = Integer.parseInt(bi, 2);

            System.out.println(biInt); */

            while (!binariesStr.equals("-1 -1")) {


                String[] binariesStrArr = binariesStr.split(" ", 0);

                int[] intArr = new int[binariesStrArr.length];

                for (int i = 0; i < binariesStrArr.length; i++) {
                    intArr[i] = Integer.parseInt(binariesStrArr[i], 2);
                }

                char[] letters = new char[binariesStrArr.length];

                int ant = 0;
                for (int i = 0; i < intArr.length; i++) {
                    letters[i] = Alien2Pt(intArr[i] - ant); 
                    ant = intArr[i];
                }

                /* for (char word: letters) {
                    System.out.println(word);
                } */

                String finalWord = new String(letters);

                System.out.println(finalWord);

                /* for (String word: binariesStrArr) {
                    System.out.println(word);
                } */

                binariesStr = scan.nextLine(); 
            }
        }
    }
}