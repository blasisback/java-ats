
package ats;

import java.util.Scanner;

public class matrices_ejercicio_2 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        int numeros[][];
        int suma = 0;
        //int nFilas,nCol;
        // System.out.println("Ingrese la cantidad de Filas");
        //nFilas=consola.nextInt();
        //System.out.println("Ingrese la cantidad de Columnas");
        //nCol=consola.nextInt();        
        numeros=new int[3][3];
        System.out.println("Digite la Matriz");
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Ingrese Datos a la matriz["+i+"]["+j+"] ");
                numeros[i][j]=consola.nextInt();
                suma+=numeros[i][j];
            }
            System.out.println("");
        }
        System.out.println("La suma de la Matriz es : "+suma);
    }
}
