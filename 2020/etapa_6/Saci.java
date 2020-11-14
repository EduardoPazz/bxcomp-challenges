import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Saci {

    static void reg() {
        // No Pattern inserimos o padrão regex que faremos a pesquisa
        Pattern p = Pattern.compile("\\w+@^[usp\\.br]");

        // No Matcher inserimos o texto em que faremos a pesquisa
        Matcher m = p.matcher("jooeduardo@gmail.com \n eduardopaz@usp.br");

        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }        
    }

    public static void main(String[] carai) {
        try (Scanner scan = new Scanner(System.in)) {
            int loop = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < loop; i++) {
                String nums = scan.nextLine();

                int indexOfSpace = nums.indexOf(' ');

                long a = Long.parseLong( nums.substring(0, indexOfSpace));
                long b = Long.parseLong( nums.substring(indexOfSpace+1, nums.length()));

                System.out.println(a+b);
            }
            System.out.println();
        }
    }

}