import java.util.Scanner;

class Mensageiro {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            while (scan.hasNext()) {
                String phrase = scan.nextLine();
                int left = phrase.indexOf("[");
                int right = phrase.indexOf("]");

                String remetente = null;
                if (left >= 0 && right >= 2) remetente = phrase.substring(left+1, right);
                
                if (
                    remetente == null ||
                    remetente.equalsIgnoreCase("oxufala") ||
                    left == -1 ||
                    right == -1
                ) System.out.println("...");
                else System.out.println(phrase);
            }
        }
    }
}