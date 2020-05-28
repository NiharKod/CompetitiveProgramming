import java.util.Scanner;

public class consoleInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int len = word.length();
        int uCase = 0;
        int lCase = 0;
        for(int i = 0; i < len; i++){
           char character = word.charAt(i);
           if(Character.isUpperCase(character)){
               uCase++;
           }else{
               lCase++;
           }
        }
        if(uCase > lCase){
            System.out.println(word.toUpperCase());
        }else{
            System.out.println(word.toLowerCase());
        }
        sc.close();
        

        
    }
}