import java.util.Scanner;

/* O Objeto Phrase armazenará o input e terá métodos para as manipular conforme
o enunciado pede. */
class Phrase { 
    // Atributos necessários

    Phrase(String str) {
        // Algumas manipulações primaŕias necessárias
    }

    // Possivelmente métodos para manipulações secundárias

    void print() {
        // Uma função dedicada para printar as informações
    }
}

class DesafioN {
    public static void main(String[] args) {
        Phrase[] phraseArray = null; 
        int times = 0; 

        /* Esse bloco se chama "Try with Resources" , caso vocês não conheçam.
        Ele basicamente faz com que o Scanner "scan" funcione apenas dentro
        do escopo do bloco. */
        try (Scanner scan = new Scanner(System.in)) {

            /* Esse segundo scan.next evita aquele 
            comportamento inesperado do Scanner */
            times = scan.nextInt(); scan.nextLine();

            phraseArray = new Phrase[times];

            for (int i = 0; i < times; i++) {
                String str = scan.nextLine();
                phraseArray[i] = new Phrase(str);
            }
        }

        for (Phrase p : phraseArray) p.print();
    }
}