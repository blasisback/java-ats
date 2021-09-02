
package ats;

import java.util.Scanner;

public class arreglos_Ejercicio9 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        int[]numeros=new int[10];
        int numero = 0;
        System.out.println("Ingresar datos al arreglo");
        for(int i=0;i<10;i++){
            System.out.print((i+1)+". Digite un numero ");
            numeros[i]=consola.nextInt();
        }
        numero=numeros[9];
        for (int i=8;i>=0;i--){
            numeros[i+1]=numeros[i];
        }
        numeros[0]=numero;
        System.out.println("Nuevo Arreglo");
        for (int i=0;i<10;i++){
            System.out.println("Numero: "+numeros[i]);
        }
        }
    }

