package ats;

import java.util.Scanner;

public class ats10 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        int contador=0;
        int suma=0;
        while (contador<10){
            System.out.println("Ingrese un numero");
            int numero=consola.nextInt();
            suma=suma+numero;
            contador++;
        
        }
        System.out.println("la suma de los numeros es "+suma);
    }
}
