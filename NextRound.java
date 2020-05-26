package com.company;
import java.io.IOException;
import java.util.Scanner;



public class NextRound {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int np = sc.nextInt();
        int k = sc.nextInt();
        int arrPlacement[] = new int[np];
        int advancement = 0;
        for (int i = 0; i < np; i++) {
            arrPlacement[i] = sc.nextInt();
            }

        int cont = arrPlacement[k -1];


        for(int i = 0; i < np; i++){
            if (arrPlacement[i] >= cont && arrPlacement[i] > 0) {
                advancement++;
        }
            System.out.println(advancement);
        }


    }
}


