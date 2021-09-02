
package ats;

import java.util.Scanner;

public class arreglos_Ejercicio3 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        float []numeros=new float[5];
        float nropos=0,nroneg=0;
        float sumapos=0,sumaneg=0;
        float mediapos,medianeg;
        int contadorpos=0,contadorneg=0,contadorcero=0;
        for (int i=0;i<5;i++){
            System.out.println("Ingrese el Nro"+(i+1));
            numeros[i]=consola.nextFloat();
            if (numeros[i]<0){
            contadorneg++;
            sumaneg+=numeros[i];
            }
            else if (numeros[i]>0){
            contadorpos++;
            sumapos+=numeros[i];
            }
            else {
            contadorcero++;
            }
            
        }
        medianeg=sumaneg/contadorneg;
        mediapos=sumapos/contadorpos;
        if (contadorneg<=0){
            System.out.println("No hay ningun numero negativo");
        
        }
        else{
            System.out.println("La media de los numeros negativos es = "+medianeg);
        }
        if(contadorpos<=0){
            System.out.println("No hay ningun numero positivo");
        
        }
        else{
            System.out.println("La media de los numeros positivos es = "+mediapos);
        }
        if (contadorcero<=0){
            System.out.println("No hay ningun cero");
        }
        else{
            System.out.println("Ceros introducidos = "+contadorcero);
        
        }
        
        
            
        
    }
}
