
package ats;

import java.util.Scanner;

public class matriz_Ejercicio1 {
    public static void main(String[] args) {
        Scanner consola= new Scanner(System.in);
        int matriz[][],nFilas,nCol;
        boolean simetrica=true;
        System.out.println("Ingrese el numero de Filas");
        nFilas=consola.nextInt();
        System.out.println("Ingrese el numero de columnas");
        nCol=consola.nextInt();
        matriz=new int[nFilas][nCol];
        System.out.println("Digite la Matriz");
        for(int i=0;i<nFilas;i++){      
            for(int j=0;j<nCol;j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                 matriz[i][j]=consola.nextInt();
            }                           
            System.out.println("");
        
        }
        if(nCol==nFilas){
            int i,j;
            i=0;
            while(i<nFilas && simetrica==true){
                j=0;
                while(j<nCol && simetrica==true){
                    if(matriz[i][j]!=matriz[j][i]){
                        simetrica=false;
                }
                    j++;
                }
                i++;
            }
        }
        if (simetrica==true){
            System.out.println("la Matriz es simetrica");
        }
        
        else{
            System.out.println("La Matriz no es simetrica");
        }
    }

}
