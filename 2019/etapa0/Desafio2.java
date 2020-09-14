import java.util.Scanner;

class Phrase {
    char[] charArray;
    char[] newCharArray;
    String message;

    Phrase(String str) {
        charArray = str.toCharArray();
        palindromer(charArray);
    }

    void palindromer(char[] charArray) {
        int lengthMinusOne = charArray.length - 1;
        newCharArray = new char[lengthMinusOne + 1];
        int absoluteIndex;

        for (int i = 0; i <= lengthMinusOne; i++) {
            absoluteIndex = Math.abs(i-lengthMinusOne);
            newCharArray[i] = charArray[absoluteIndex];
        }

        message = new String(newCharArray);
    }

    void print() {
        System.out.println(message);
    }
}

class Desafio2 {
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