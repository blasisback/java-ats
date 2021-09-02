
package ats;

import java.util.Scanner;

public class arreglos_Ejercicio7 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        int numeros[]=new int [10];
        boolean creciente=false;
        boolean decreciente=false;
        for (int i=0;i<10;i++){
            System.out.print((i+1)+". Digite un numero ");
            numeros[i]=consola.nextInt();
        }
        for (int i=0;i<9;i++){
            if (numeros[i] > numeros[i+1]){
            decreciente=true;
            }
            if(numeros[i] < numeros[i+1]){
            creciente=true;
            }
        }
        if(creciente==true && decreciente==false){
            System.out.println("Los numeros estan de forma creciente");
        }
        else if(creciente==false && decreciente==true){
            System.out.println("Los numeros estan de forma decreciente");
        }
        else if((creciente==true)&&(decreciente==true)){
            System.out.println("Los numeros estan desordenados");
        }
        else if((creciente==false)&&(decreciente==false)){
            System.out.println("Todos los numeros son iguales");
        }
    }
}
