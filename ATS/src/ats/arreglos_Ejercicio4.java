
package ats;

import java.util.Scanner;

public class arreglos_Ejercicio4 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        int [] numeros=new int[10];
        int mayor=9;
        int menor=0;
        for (int i=0;i<10;i++){
            System.out.println("Digite un numero");
            numeros[i]=consola.nextInt();
        }
        System.out.println("-----------Mostrando Numeros----------");
        for(int i=0;i<5;i++){
            System.out.println(numeros[menor]);
            System.out.println(numeros[mayor]);
            mayor--;
            menor++;
        
        }
    }
}
