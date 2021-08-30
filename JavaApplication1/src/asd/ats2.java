
package asd;

import java.util.Scanner;

public class ats2 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        long numero=1;
        for(int i=1;i<=20;i+=2){
            numero*=i;        
        }
        System.out.println("numero = " + numero);
    }
}