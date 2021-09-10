
package ats;

public class matriz_Ejercicio4 {
    public static void main(String[] args) {
        int matriz[][]=new int[7][7];
        for (int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if (i==j)
                    matriz[i][j]=1;
            }
        }
        System.out.println("Matriz");
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");
        }
    }
}
