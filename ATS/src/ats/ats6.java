
package ats;

import java.util.Scanner;

public class ats6 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        System.out.println("Digite un numero");
        int numero=consola.nextInt();
        int suma=0;
        while (numero!=0){
        suma=suma+numero;
            System.out.println("Digite otro numero");
            numero=consola.nextInt();
        }
        System.out.println("suma = " + suma);
        
    }
}
