
import java.util.Scanner;

public class Alumno {
    public static void main (String args []){
    //llantas=400;
    //carroseria=4000;
    //motor=2000;
    //descueto1=llantas y motor20;
    //descuento2= carroseria y motor30;
        int llantas=400;
        System.out.println("llantas = " + llantas);
        int carroseria=4000;
        System.out.println("carroseria = " + carroseria);
        int motor=2000;
        float descuento1=(float) ((llantas+motor)*0.8);
        float descuento2=(float) ((carroseria+motor)*0.7);
        System.out.println("motor = " + motor);
        System.out.println("Descuento N°1  llantas + motor 20%");
        System.out.println("Descuento N°2 Carroseria  Motor 30%");
        System.out.println("Elija el tipo de Descuento:     1-2  ");
        Scanner consola = new Scanner(System.in);
        int op= Integer.parseInt(consola.nextLine());
        if (op==1){
            System.out.println("El Descuento Total es de:"+descuento1);}
        if (op==2){
            System.out.println("El Descuento Total es de:"+descuento2);}
        
    
    
    
    }
    
}
