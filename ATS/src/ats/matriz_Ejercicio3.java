
package ats;

import java.util.Scanner;

public class matriz_Ejercicio3 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        int matriz[][]=new int[3][3];
        System.out.println("Digite la Matriz");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j]=consola.nextInt();
            }
        }
        System.out.println("Matriz original");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        int aux;
        for(int i=0;i<3;i++){
            for(int j=0;j<i;j++){
            aux=matriz[i][j];
            matriz[i][j]=matriz[j][i];
            matriz[j][i]=aux;
            }
        }
        System.out.println("La Matriz transpuesta es : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
            }   
            System.out.println("");
        }
    }
}