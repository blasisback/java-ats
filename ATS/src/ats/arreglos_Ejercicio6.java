
package ats;

import java.util.Scanner;

public class arreglos_Ejercicio6 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        int[]numeros=new int[12];
        int[]numeros2=new int[12];
        int[]numerostotal=new int [24];
        System.out.println("Ingrese 12 numeros de la primera tabla");
        for(int i=0;i<12;i++){
            System.out.println((i+1)+" Ingrese un numero");
            numeros[i]=consola.nextInt();
        
        }
        System.out.println("Ingrese 12 numeros de la segunda tabla");
        for(int i=0;i<12;i++){
            System.out.println((i+1)+" Ingrese un numero");
            numeros2[i]=consola.nextInt();
        }
        /*mesclar ambas tablas de 3 en 3, 3 de la primera tabla y 3 de la segunda tabla
        
        */
        int j=0;
        int k=0;
        int i=0;
        for(int p=0;p<4;p++){
            numerostotal[j]=numeros[i];
            i++;
            j++;
            numerostotal[j]=numeros[i];
            i++;
            j++;
            numerostotal[j]=numeros[i];
            i++;
            j++;
            numerostotal[j]=numeros2[k];
            j++;
            k++;
            numerostotal[j]=numeros2[k];
            j++;
            k++;
            numerostotal[j]=numeros2[k];
            j++;
            k++;            
        
        }
        for (int a=0;a<24;a++){
            System.out.println("Los numeros de las 2 tablas son"+numerostotal[a]);
        }
        
        }
    
    
    }

