
package ats;

import java.util.Scanner;

public class ats3 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero=consola.nextInt();
        while (numero!=0){
        if(numero%2==0){
            System.out.println("el numero es par");
        }
        else{
            System.out.println("el numero es impar");
        }
            System.out.println("Ingrese otro numero");
            numero=consola.nextInt();
        
        }
    }
}
