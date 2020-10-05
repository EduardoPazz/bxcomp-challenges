import java.util.*;
import java.util.regex.*;

class Desafio2 {

    static void processPhrase(String phrase) {
        String newPhrase = phrase;
        Pattern pattern = Pattern.compile("[1-5]{0,1}[0-9]"); // A number between 0 and 50
        Matcher matcher = pattern.matcher(phrase);        

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();

            String ocurrency = phrase.substring(start, end);
            String formattedOcurrency = String.format("%02d", Integer.parseInt(ocurrency));

            newPhrase = newPhrase.replace(ocurrency, formattedOcurrency);
        }

        System.out.println("new phrase: " + newPhrase);
    }

    static void writingForm(String number) {
        number = new String();
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String phrase = input.nextLine();
            while (!phrase.equals("FIM")) {
                processPhrase(phrase);
                phrase = input.nextLine();
            }
        }
    }
}
