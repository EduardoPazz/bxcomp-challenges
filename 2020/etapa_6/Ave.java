import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Ave {

    static int reg(String phrase) {

        int counter = 0;

        // No Pattern inserimos o padrão regex que faremos a pesquisa
        Pattern p = Pattern.compile("fo+i", Pattern.CASE_INSENSITIVE);

        // No Matcher inserimos o texto em que faremos a pesquisa
        Matcher m = p.matcher(phrase);

        while (m.find()) counter++;

        return counter;
    }

    public static void main(String[] carai) {
        try (Scanner scan = new Scanner(System.in)) {
            String phrase = scan.nextLine();

            while (!(phrase.equals("XIU!"))) {

                int times = reg(phrase);

                System.out.println(times);

                phrase = scan.nextLine();
            }
        }
    }

}