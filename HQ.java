import java.util.Scanner;

public class HQ{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();
        int counter = 0;
        int len = word.length();
        for(int i = 0; i<len; i++){
            if(word.charAt(i) == 'H' || word.charAt(i) == 'Q' || word.charAt(i) == '9' || Character.toString(word.charAt(i)) == "+"){
                counter++;

            }
        }
        if(counter != 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }

}