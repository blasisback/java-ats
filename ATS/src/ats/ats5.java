
package ats;

import java.util.Scanner;

public class ats5 {
    public static void main(String[] args) {
        int aleatorio=(int)(Math.random()*100);
        Scanner consola=new Scanner(System.in);
        System.out.println("Digite el numero aleatorio");
        int numero=consola.nextInt();
        int contador=1;
        while(numero!=aleatorio){
        if(numero>aleatorio){
            System.out.println("el numero aleatorio es menor");
        }
        else{
            System.out.println("el numero aleatorio es mayor");
        }
            System.out.println("Digite otro numero");
        numero=consola.nextInt();
        contador++;
        }
        System.out.println("Lo logro en " +contador+" intentos");
        
    }
    
}
