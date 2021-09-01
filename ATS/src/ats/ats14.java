
package ats;

import java.util.Scanner;

public class ats14 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        int sueldo,contador=0,suma = 0;
        int contador2=0;
        while (contador<10){
        contador++;
            System.out.println("Digite el sueldo");
            sueldo=consola.nextInt();
            suma+=sueldo;
            if (sueldo>1000){
            contador2++;
            }
        
        }
        System.out.println("La suma de los sueldos es "+suma);
        System.out.println("La cantidad de sueldos mayores a 1000 son "+contador2);
        
        
        
    }
}
