
package ats;

import java.util.Scanner;

public class ats16 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        System.out.print("Ingrese un numero entre 0-10 ");
        int numero=consola.nextInt();
        int contador=0;
        int producto=1;
        while (contador<=12){
            producto=numero*contador;
            System.out.println(producto);
            contador++;
            
        }
    }
}
