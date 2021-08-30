
package Ejerciciosparaestupidos;

import java.util.Scanner;

public class ez {
    public static void main(String[] args) {
        System.out.println(" si escribe a se mostrara 1 "
                + "\n si escribe b se mostrara 2"
                + "\n si escribe c se mostrara 3");
        Scanner consola=new Scanner(System.in);
        char variable=consola.next().charAt(0);
        if (variable=='a')
            System.out.println("1");
        else if(variable=='b')
            System.out.println("2");
        else {
            System.out.println("3");
        }
    }
    
}
