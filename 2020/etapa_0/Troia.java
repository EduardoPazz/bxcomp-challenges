import java.util.*;

class Troia {
    public static void main(String[] args) {
        String endMessage;
        String tropString;
        char tropChar;
        char[] tropCharArray;
        int tropCount = 0;
        int limit;
        char[] limitChar = null;
        boolean aquiles = false;
        boolean troiaHorse = false;

        try (Scanner scan = new Scanner(System.in)) {

            mainWhile: while (true) {

                tropString = scan.nextLine();
                tropCharArray = tropString.toCharArray();                


                theFor: for (int i = 0; ; i++) {

                    switch (tropCharArray[i]) {
                        case 'G': tropCount++; break;

                        case 'A': tropCount += 10; aquiles = true; break;

                        case 'C': troiaHorse = true; break theFor; 

                        default: 

                            // System.out.println("\"" + limitChar[j-i] + "\"");
                            if ((tropCharArray[i] != ' ')) {
                                limitChar = new char[tropCharArray.length - i];
                                for (int j = i; j < tropCharArray.length; j++) {
                                    
                                    limitChar[j - i] = tropCharArray[j];
                                }

                                break theFor;
                            }
    // GGGGGGGGGGGGGGGGG 10
                    }
                }   

            String limitString = new String(limitChar);
            limit = Integer.parseInt(limitString);

            if (tropCount >= limit) {
                if (aquiles) endMessage = "Eu que nao fico no caminho dele!";
                else endMessage = "Recuar!";
            } else if (troiaHorse) endMessage = "Ah que mal deve ser receber um presente de grego?";
            else endMessage = "Atacar!";

            System.out.println(endMessage);            

            aquiles = false;                         
        }        
        }

                    
    }
}