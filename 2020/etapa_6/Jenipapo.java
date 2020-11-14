import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


class Jenipapo {

    static void reg() {
        // No Pattern inserimos o padrão regex que faremos a pesquisa
        Pattern p = Pattern.compile("\\w+@^[usp\\.br]");

        // No Matcher inserimos o texto em que faremos a pesquisa
        Matcher m = p.matcher("jooeduardo@gmail.com \n eduardopaz@usp.br");

        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }        
    }

    static boolean prime(int num) {
        boolean prime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false; 
                break;
            }
        }    
        return prime;    
    }

    public static void main(String[] carai) {
        int num = 11;
        int a = 0;
        int b = 0;

        mainfor: for (int i = 0; i < 999; i++) {
            for (int j = 0; j < 999; j++) {
                if (num == 5*j + 3*i) {
                    a = j;
                    b = i;
                    break mainfor;
                }
            }   
        }

        System.out.println(a);
        System.out.println(b);
    }

}