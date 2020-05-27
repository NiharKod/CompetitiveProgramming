//package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Football {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String players = sc.nextLine();
        int len = players.length();
        char [] arrPlayers = new char[len + 100];
        for(int i = 0; i < len; i++){
            arrPlayers[i] = players.charAt(i);
        }
       String result = "NO";
        int counter = 0;
        for(int i = 0; i < len; i ++){
            for( int n = i; n < len; n++){
                if(arrPlayers[i] == arrPlayers[n + 1]){
                    //System.out.println(counter);
                        counter++;

                        if(counter >= 6){
                            result = "YES";
                            break;

                        }
                }else{
                    break;
                }
            }
            if(counter >= 6){
                break;
            }
           // System.out.println(counter);
            counter = 0;
        }

        System.out.println(result);
    }

}
