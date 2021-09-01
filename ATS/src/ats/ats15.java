
package ats;

import java.util.Scanner;

public class ats15 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        int contador=0,contador2=0,contador3=0;
        int edad,edadm;
        float altura,alturam;
        int sumaedad=0;
        float sumaaltura = 0;
        while (contador<5){
        contador++;
        System.out.println("Alumno Nro "+contador);
        System.out.println("Ingrese la Edad");
        edad=consola.nextInt();
        sumaedad+=edad;
        System.out.println("Ingrese la Estatura");
        altura=consola.nextFloat();
        sumaaltura+=altura;
        if (edad>18){
        contador2++;
        }
        if (altura>1.75){
        contador3++;
        }
        }
        sumaedad/=5;
        sumaaltura/=5;
        System.out.println("La media de las edades es= "+sumaedad);
        System.out.println("La media de las estaturas es= "+sumaaltura);
        System.out.println("La cantidad de alumnos mayores de 18 años= "+contador2);
        System.out.println("La cantidad de alumnos mayores a 1.75 es="+contador3);
    }
}
    
