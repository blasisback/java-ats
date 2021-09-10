
package ats;

import java.util.Scanner;

public class arreglos_Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int arreglo[] = new int[10];//arreglo de 10 ents
        int ultimo, posiciones, j=1;
        
        System.out.println("Llenemos el arreglo");
        for (int i=0; i<10; i++){
            
            System.out.print((i+1)+" Ingrese numero");
            arreglo[i]= entrada.nextInt();
            
        }
        System.out.println("Ingrese cuantas posiciones desea correr");
        posiciones= entrada.nextInt();
        
        do  {  
            ultimo=arreglo[9];
        
        for(int i=8; i>=0;i--){
            arreglo[i+1]=arreglo[i];
        }
        j++;
        arreglo [0]= ultimo;
            
        }
        while (j<=posiciones);
             
        
        
       
        
        System.out.println("el nuevo arreglo es: ");
        for(int i:arreglo){
            System.out.println(i+" ");
        }
            
    }
}
