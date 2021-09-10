
package ats;

import java.util.Scanner;

public class arreglos_Metodo_Burbuja {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        int arreglo[],nElementos,aux;
        System.out.println("Digite La Cantidad de elementos del arreglo ");
        nElementos=consola.nextInt();
        arreglo=new int[nElementos];
        for(int i=0;i<nElementos;i++){
            System.out.println((i+1)+" Digite un numero");
            arreglo[i]=consola.nextInt();
        }
        //Metodo burbuja
        for(int i=0;i<(nElementos-1);i++){
            for(int j=0;j<(nElementos-1);j++){
                if(arreglo[j]>arreglo[j+1]){
                aux=arreglo[j];
                arreglo[j]=arreglo[j+1];
                arreglo[j+1]=aux;
                }
            }
        }
        //mostrando el arreglo de forma creciente y decreciente
        System.out.println("\nArreglos ordenado en forma creciente: ");
        for(int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+"-");
            
            
            
        }
        System.out.println("\nArreglos ordenado de forma decreciente");
        for (int i=(nElementos-1);i>=0;i--){
            
            System.out.print(arreglo[i]+"-");
        }
    }
}
