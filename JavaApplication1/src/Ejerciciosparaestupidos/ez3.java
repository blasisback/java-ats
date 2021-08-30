package Ejerciciosparaestupidos;
import java.util.Scanner;
public class ez3 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        int codigo,litros,litrosArticulo1 = 0,conteoMas600=0;
        float precioLitro,importeFactura,facturacionTotal=0;
        
        for(int i =1;i<=5;i++){
            System.out.println("Articulo Nro"+i+"\nDigite el codigo del producto ");
            codigo=consola.nextInt();
            System.out.println("Articulo Nro"+i+"\nDigite los litros del producto ");
            litros=consola.nextInt();
            System.out.println("Articulo Nro"+i+"\nDigite el precio del producto ");
            precioLitro=consola.nextFloat();
            importeFactura=(litros*precioLitro);
            facturacionTotal+=importeFactura;
            if(codigo==1){
                litrosArticulo1+=litros;
            }
            if(importeFactura>600){
                conteoMas600++;
            }
            
            
        
        }
        System.out.println("Resumen total de ventas");
        System.out.println("Facturacion Total "+facturacionTotal);
        System.out.println("Cantidad de litros vendidos del articulo "+litrosArticulo1);
        System.out.println("Cantidad de facturas +600 son= "+conteoMas600);
    }
}
