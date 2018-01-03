package com.twu.biblioteca;

public class Right_Triangle {
    public static void main(String[] args){
        int rows = 3;
        int x = 1;

        while(rows > 0) {
            for(int i = 0; i < x; i++) {
                System.out.print("*");
            }
            System.out.println("");
            x++; rows--;
        }
    }
}
