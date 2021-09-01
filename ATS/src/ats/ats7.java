
package ats;

import java.util.Scanner;

public class ats7 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        System.out.println("Digite un numero");
        int numero=consola.nextInt();
        int media=0;
        int contador=0;
        while (numero>=0){
            media+=numero;
            System.out.println("Digite otro numero");
            numero=consola.nextInt();
            contador++;
        }
        media/=contador;
        if (contador==0){
            System.out.println("No se puede sacar la media de un solo numero");
            
        }
        System.out.println("La media de los numeros es="+media);
    }
}
