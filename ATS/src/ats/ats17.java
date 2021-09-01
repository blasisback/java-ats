
package ats;

import java.util.Scanner;

public class ats17 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        int ventaLitros;
        String codigo;
        int contador=0;
        float precioLitros,facturacion = 0;
        int contador2 = 0;
        float suma = 0;
        int arti1=0;
        while (contador<5){
            contador++;
            System.out.println("Ingrese el codigo del producto");
            codigo=consola.next();
            System.out.println("Ingrese la cantidad de litros vendidos");
            ventaLitros=consola.nextInt();
            System.out.println("Ingrese le precio por litro");
            precioLitros=consola.nextFloat();
            facturacion=(float)ventaLitros*precioLitros;
            if (facturacion>600){
            contador2++;
            }
            if (contador==1){
                arti1=ventaLitros;
            }
            suma+=facturacion;
        }
        System.out.println("Facturacion total = ´"+facturacion);
        System.out.println("Cantidad de litros vendidos del articulo 1 = "+arti1);
        System.out.println("Cantidad de facturas mayores a 600 "+contador2);
        
        
    }
    
}
