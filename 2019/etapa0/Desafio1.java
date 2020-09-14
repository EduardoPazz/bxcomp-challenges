import java.util.Scanner;

class Phrase {
    char[] charArray;
    int level = 0;

    Phrase(String str) {
        charArray = str.toCharArray();
        int length = charArray.length;
        for (int i = 6; i < length; i++) level++;
    }

    void print() {
        if (level == 0) System.out.println("O combustível não possui dano");
        else System.out.println("Dano de nível " + level);
    }
}

class Desafio1 {
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