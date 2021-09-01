
package ats;

import java.util.Scanner;

public class ats12 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero=consola.nextInt();
        int contador=0;
        int producto=1;
        while (contador!=numero){
        contador++;
        producto*=contador;
        
        }
        System.out.println("El Facorial es="+producto);
    }
    
}
