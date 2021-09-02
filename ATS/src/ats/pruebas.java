
package ats;

import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        int[]arreglo=new int[3];
        for (int i=0;i<4;i++){
            System.out.println("Digite un numero"+i);
            arreglo[i]=consola.nextInt();
        }
        for(int i=0;i<4;i++){
            System.out.println("Numero"+arreglo[i]);
        }
    }
}
