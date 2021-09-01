
package ats;

import java.util.Scanner;

public class ats22 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        int contador=0;
        float nota;
        int sus=0;
        while (contador<5){
        contador++;
            System.out.println("Digite la nota Nro"+contador);
        nota=consola.nextInt();
        if(nota<5){
            sus=1;
        }
        }
        if (sus==1){
            System.out.println("Hay por lo menos un alumno suspenso");
        }
        else{
            System.out.println("No hay ningun alumno suspenso");
        }
    }
}
