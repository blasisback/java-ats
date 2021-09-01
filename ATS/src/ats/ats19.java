
package ats;

import java.util.Scanner;

public class ats19 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        int contador=0,nota;
        int contador2=0,contador3=0,contador4=0;
        while (contador<6){
        contador++;
            System.out.println("Ingrese nota Nro"+contador);
            nota=consola.nextInt();
            if ((nota>4)&&(nota<=10)){
            contador2++;
            }
            else if(nota==4){
            contador3++;
            }
            else if((nota<=3)&&(nota>=0)){
            contador4++;
            }
            else {
                System.out.println("Digite un numero entre 1-10");
            }
        }
        System.out.println("Alumnos aprobados="+contador2);
        System.out.println("Alumnos condicionados"+contador3);
        System.out.println("Alumnos suspensos"+contador4);
    }
}
