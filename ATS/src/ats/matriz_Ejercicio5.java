
package ats;

import java.util.Scanner;

public class matriz_Ejercicio5 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        int nFilas,nCol;
        System.out.println("Ingrese la cantidad de Filas");
        nFilas=consola.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        nCol=consola.nextInt();
        int sumaFilas = 0;
        int sumaColumnas;
        int matriz[][]=new int[nFilas][nCol];
        System.out.println("Digite la Matriz");
        for (int i=0;i<nFilas;i++){
            for(int j=0;j<nCol;j++){
                System.out.print("matriz["+i+"]["+j+"]");
                matriz[i][j]=consola.nextInt();
            }
        }
        System.out.println("La Matriz es:");
        for(int i=0;i>nFilas;i++){
            for(int j=0;j<nCol;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        for(int i=0;i<nFilas;i++){
            sumaFilas+=matriz[i][0];
        }
    }
}
