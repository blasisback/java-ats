
package ats;

import java.util.Scanner;

public class arreglos_Ejercicio1 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        float [] edades=new float[5];
        for (int i=0;i<5;i++){
            System.out.println("Digite un numero");
            edades[i]=consola.nextFloat();
        }
        System.out.println("Imprimir los elementos del arreglo");
        for(float a:edades){
            System.out.println(a);
        }
    }
}   
