import java.time.Clock;
import java.util.Scanner;

public class Merge_strings {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        String word1 = sc.nextLine();

        String word2 = sc.next();

        int numCharW1 = word1.length();
        int numCharW2 = word2.length();

        if (numCharW1 == numCharW2){
           char [] word1Array = word1.toCharArray();
           char [] word2Array = word2.toCharArray();
            System.out.print(word1Array[0]);
            System.out.println();
           for( char i : word1Array){
               for(char j : word2Array){
                   System.out.print(word1Array[i]+ "" +word2Array[j]); //corrigir ArrayIndexOutOfBoundsException
               }
           }
        }
        else{
            System.out.print("outra logica da concatenação aqui");
        }
    }
}
