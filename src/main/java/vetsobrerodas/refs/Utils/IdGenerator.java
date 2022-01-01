package vetsobrerodas.refs.Utils;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;


public class IdGenerator{

    private static final char[] lettersAndNumbers = {
            'A','B','C','D','E','F','G','H','I','J','K','L',
            'M','N','O','P','Q','R','S','T','U','V','X','Y',
            'Z','0','1','2','3','4','5','6','7','8','9'
    };


    private static final Set<String> usedSequences = new HashSet<String>(){{
        add("");
    }};


    public static String generate(){
        Random rnd = new Random();

        String idAsString = "";
        while(usedSequences.contains(idAsString)){
            for(int i=0; i<7; i++) {
                idAsString += lettersAndNumbers[rnd.nextInt(lettersAndNumbers.length)];
            }
        }
        usedSequences.add(idAsString);
        return idAsString;
    }

    private boolean contains(String id){
        return usedSequences.contains(id);
    }
}

