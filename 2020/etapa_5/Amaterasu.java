import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/* 
    Branco = sem nuvens
    Vermelho = ensolarado
    Verde = muitas nuvens
    Preto = tempestade
    Amarelo = sol encoberto
    Azul = chuva
    Cinza = Neblina
    Laranja = sol fraco
    Roxo = garoa
 */


class Amaterasu {

    static boolean reg(String patt, String text) {
        // No Pattern inserimos o padrão regex que faremos a pesquisa
        Pattern p = Pattern.compile(patt, Pattern.CASE_INSENSITIVE);

        // No Matcher inserimos o texto em que faremos a pesquisa
        Matcher m = p.matcher(text);

        return m.find();
    }

    static String appendText(String finalText, String color) {
        if (finalText.isEmpty()) return color;
        return finalText + " - " + color;
    }

    public static void main(String[] carai) {
        try (Scanner scan = new Scanner(System.in)) {
            int loop = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < loop; i++) {

                String text = scan.nextLine();
                
                boolean vermelho = false;
                boolean azul = false;
                boolean roxo = false;
                boolean cinza = false;
                boolean branco = false;
                boolean laranja = false;
                boolean verde = false;
                boolean preto = false;
                boolean amarelo = false;

                vermelho = reg("ensolarado", text);
                azul = reg("chuva", text);
                roxo = reg("garoa", text);
                cinza = reg("neblina", text);
                branco = reg("sem nuvens", text);
                laranja = reg("sol fraco", text);
                verde = reg("muitas nuvens", text);
                preto = reg("tempestade", text);
                amarelo = reg("sol encoberto", text);


                String finalText = "";


                if (branco) finalText = appendText(finalText, "branco");
                if (vermelho) finalText = appendText(finalText, "vermelho");
                if (verde) finalText = appendText(finalText, "verde");
                if (preto) finalText = appendText(finalText, "preto");
                if (amarelo) finalText = appendText(finalText, "amarelo");
                if (azul) finalText = appendText(finalText, "azul");
                if (cinza) finalText = appendText(finalText, "cinza");        
                if (laranja) finalText = appendText(finalText, "laranja");
                if (roxo) finalText = appendText(finalText, "roxo");
                
                System.out.println(finalText);

            }
        }
    }

}