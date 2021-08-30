
package ats;

import java.util.Scanner;

public class ats4 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        System.out.println("Ingrese el numero factorial");
        int factorial=consola.nextInt();
        int contador=0;
        int suma=1;
        while (contador<factorial){
        contador++;
        suma*=contador;
        
        
        }
        System.out.println("el factorial es= " + suma);
        
    }
}
