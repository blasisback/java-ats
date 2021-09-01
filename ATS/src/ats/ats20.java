
package ats;

import java.util.Scanner;

public class ats20 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de sueldos");
        int numero=consola.nextInt();
        int contador=0;
        float sueldo;
        float mayor=0;
        while (contador<numero){
            contador++;
            System.out.println("Ingrese el sueldo Nro"+contador);
            sueldo=consola.nextInt();
            if(mayor<sueldo){
                mayor=sueldo;
            }
            
        
        }
        System.out.println("El sueldo mayor ="+mayor);
    }
    
}
