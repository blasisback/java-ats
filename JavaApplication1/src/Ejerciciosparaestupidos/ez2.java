
package Ejerciciosparaestupidos;

import java.util.Scanner;

public class ez2 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        int contador=0;
        System.out.println("Digite Hombre o Mujer");
        String a=consola.nextLine();
        switch(a){
            case "Hombre":
                while(contador<100){
                contador++;
                    System.out.println(contador);
                }
                break;
            case "Mujer":
                while(contador<50){
                contador++;
                    System.out.println(contador);
                }
            default:
                System.out.println("Digite bien los Datos");
        }
    }
}
