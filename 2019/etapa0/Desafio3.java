import java.util.Scanner;

class Phrase {
    String[] arrStr;

    Phrase(String str) {
        arrStr = str.split(" ", 0);
    }

    void print() {
        int lengthMinusOne = arrStr.length - 1;
        System.out.print(arrStr[lengthMinusOne].toUpperCase() + ",");
        for (int i = 0; i < lengthMinusOne; i++) {
            System.out.print(" " + arrStr[i].charAt(0) + ".");
        }
        System.out.println();
    }
}

class Desafio3 {
    public static void main(String[] args) {
        Phrase[] pp = null;
        int times = 0;

        try (Scanner scan = new Scanner(System.in)) {
            times = scan.nextInt(); scan.nextLine();

            pp = new Phrase[times];

            for (int i = 0; i < times; i++) {
                String str = scan.nextLine();
                pp[i] = new Phrase(str);
            }
        }

        for (Phrase p : pp) p.print();
    }
}