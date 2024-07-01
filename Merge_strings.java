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
            System.out.print("logica da concatenação aqui");
        }
        else{
            System.out.print("outra logica da concatenação aqui");
        }
    }
}
