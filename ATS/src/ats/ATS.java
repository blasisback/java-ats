
package ats;

import java.util.Scanner;

public class ATS {

    public static void main(String[] args) {
    Scanner consola=new Scanner(System.in);
        int contador = 1;
        int numero;
        int suma=0;
    while (contador<=10){
        System.out.println("Ingrese el numero "+contador);
        numero=consola.nextInt();
        suma+=numero;
        contador++;
    }
        System.out.println("Suma="+suma);
    }
    }
    

