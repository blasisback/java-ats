
package ats;

import java.util.Scanner;

public class ats8 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        System.out.println("Introdusca un numero");
        int numero = consola.nextInt();
        for (int i=0;i<=numero;i++){
            System.out.println(i);
        }
    }
}
