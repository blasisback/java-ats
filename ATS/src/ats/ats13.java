
package ats;

import java.util.Scanner;

public class ats13 {
    public static void main(String[] args) {
        Scanner consola= new Scanner(System.in);
        int numero,contador=0;
        float mediapos=0;
        float medianeg=0;
        int cero=0;
        int contadorp = 0,contadorn = 0;
        while (contador<10){
        contador++;
            System.out.println("Digite un numero");
            numero=consola.nextInt();
            if (numero>0){
            mediapos+=numero;
            contadorp++;
            }
            else if(numero<0){
            medianeg+=numero;
            contadorn++;
            }
            else{
            cero++;
            }
        }
        mediapos/=contadorp;
        medianeg/=contadorn;
        System.out.println("La media de los numeros positivos es "+mediapos);
        System.out.println("La media de los numeros negativos es "+medianeg);
        System.out.println("La cantidad de ceros es "+cero);
    }
}
