
package ats;

import java.util.Scanner;

public class ats2 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        System.out.println("Digite un numero");
        int numero=consola.nextInt();
        while(numero!=0){
        if (numero>0){
            System.out.println("El numero es positivo");
        }
        else{
            System.out.println("el numero es Negativo");
        }
            System.out.println("Digite otro numero");
            numero=consola.nextInt();
        }
        
    }
    
}
