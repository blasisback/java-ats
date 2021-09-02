
package ats;

import java.util.Scanner;

public class arreglos_Ejercicio5 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        int []numeros=new int[10];
        int []numeros2=new int[10];
        int []numeros3=new int[20];
        System.out.println("Digite los primeros 10 numeros");
        for (int i=0;i<10;i++){
            System.out.println((i+1)+"Digite un numero");
            numeros[i]=consola.nextInt();
        }
        System.out.println("Digite los siguientes 10 numeros");
        for (int i=0;i<10;i++){
            System.out.println((i+1)+"Digite un numero");
            numeros2[i]=consola.nextInt();
        }
        int j=0;
        for (int i=0;i<10;i++){
        numeros3[j]=numeros[i];
        j++;
        numeros3[j]=numeros2[i];
        j++;
        }
        for(int i = 0;i<20;i++){
            System.out.println("los numeros juntos son="+numeros3[i]);
            
        }
        
    }
}
