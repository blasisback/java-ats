
package ats;

import java.util.Scanner;

public class ats18 {
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
            System.out.println("Ingrese el tipo de producto"
                    + "\nProducto 1 $0,6  por Litro"
                    + "\nProducto 2 $3,0  por Litro"
                    + "\nProducto 3 $1,25 por Litro"
                    + "\nElija entre las opciones 1-2-3");
            precioLitros=consola.nextFloat();
            if (precioLitros==1){
                precioLitros= 0.6f;
            }
            else if (precioLitros==2){
                precioLitros= 3.0f;
            }
            else{
                precioLitros=1.25f;
            }
            System.out.println("Ingrese el codigo del producto");
            codigo=consola.next();
            System.out.println("Ingrese la cantidad de litros vendidos");
            ventaLitros=consola.nextInt();
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