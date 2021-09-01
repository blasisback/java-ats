
package ats;

import java.util.Scanner;

public class ats1 {
    public static void main(String[] args) {
        Scanner laptmre=new Scanner(System.in);
        System.out.println("Introdusca un numero ");
        int numero=laptmre.nextInt();
        int producto=1;
        while (numero>=0){
            producto=numero*numero;
            System.out.println("el producto es="+producto);
            System.out.println("Introdusca un numero");
            numero=laptmre.nextInt();
        }
        
    }
}
