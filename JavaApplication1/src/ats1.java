
import java.util.Scanner;


public class ats1 {
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
       System.out.println("Ingrese el costo de la compra");
        float costo=entrada.nextInt();
        if (costo>=300){
        float descuento=costo-costo*0.2f;
            System.out.println("su compra tiene un descuento del 20% y el total es"+descuento);
        }
        else if (costo>300) {
            System.out.println("El precio de su compra es de "+costo);
        }
    }
    
}
