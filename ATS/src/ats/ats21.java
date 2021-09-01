
package ats;

import java.util.Scanner;

public class ats21 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        int contador=0,numero;
        int neg=0;
        while (contador<10){
            contador++;
            System.out.println("Digite un numero");
            numero=consola.nextInt();
            if (numero<0){
                neg=1;
            }
        
        }
        if (neg==1){
            System.out.println("Hay por lo menos un numero negativo");
        }
        else{
            System.out.println("No hay ningun numero negativo");
        }
    }
}
