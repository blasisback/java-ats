
package ats;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        int matriz[][],nFilas,nCol;
        System.out.println("Ingrese el numero de filas");
        nFilas=consola.nextInt();
        System.out.println("Ingrese el numero de columnas");
        nCol=consola.nextInt();
        matriz=new int[nFilas][nCol];
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<nCol;j++){
                System.out.print("Matriz["+i+"]["+j+"]");
                matriz[i][j]=consola.nextInt();
                
            }
        }
        System.out.println("La Matriz es : ");
        for(int i=0;i<nFilas;i++){
            for(int j=0;j<nCol;j++){
                System.out.print(matriz[i][j]);
            
            }
            System.out.println("");
        }
    }
}
