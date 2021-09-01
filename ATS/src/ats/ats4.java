
package ats;

import java.util.Scanner;

public class ats4 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        System.out.println("Digite un numero");
        int numero=consola.nextInt();
        int contador=0;
        while (numero>0){
        contador++;
            System.out.println("Digite otro numero");
        numero=consola.nextInt();
            
        
        
        }
        System.out.println("La cantidad de numero introducidos es "+contador);
        
    }
    
}
