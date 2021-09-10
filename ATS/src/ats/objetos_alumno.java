
package ats;

public class objetos_alumno {
    public static void main(String[] args) {
        alumno alumno1=new alumno("Blas", "Crisostomo", 73342471, 17, 2, 14, 15, 16);
        System.out.println("Apellido: "+alumno1.getApellido());
        System.out.println("Nombre  : "+alumno1.getNombre());
        System.out.println("DNI     : "+alumno1.getDni());
        System.out.println("Edad    : "+alumno1.getEdad());
        System.out.println("Grado   : "+alumno1.getGrado());
        System.out.println("Nota Nro1: "+alumno1.getNota1());
        System.out.println("Nota Nro2: "+alumno1.getNota2());
        System.out.println("Nota Nro3: "+alumno1.getNota3());
    }
}
