
package Ejerciciosparaestupidos;

import java.util.Scanner;
public class ez4 {
    public static void main(String[] args) {
        Scanner consola=new Scanner(System.in);
        int edad,sumaEdad=0,conteoMayor18=0,conteoMayor175=0;
        float altura,sumaAltura=0,mediaEdad,mediaAltura;
        
        for(int i=1;i<=5;i++){
            System.out.println("Alumno "+i+" Digite su edad");
            edad=consola.nextInt();
            System.out.println("Alumno "+i+" Digite su estatura");
            altura=consola.nextFloat();
            sumaEdad+=edad;
            sumaAltura+=altura;
            if (edad>18){
                conteoMayor18++;
            }
            if (altura>1.75){
                conteoMayor175++;
            }

            
            
            
            
            
            
            
        }
            mediaEdad=(float)sumaEdad/5;
            mediaAltura=(float)sumaAltura/5;
            System.out.println("La Edad promedio es="+mediaEdad);
            System.out.println("La Altura promedio es="+mediaAltura);
            System.out.println("La cantidad de alumnos mayores a 18 años es= "+conteoMayor18++);
            System.out.println("La cantidad de alumnos que miden mas de 1.75 es= "+conteoMayor175);        
    }
    
    
    
}
