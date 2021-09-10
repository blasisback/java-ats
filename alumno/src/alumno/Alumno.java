
package alumno;

public class Alumno {
    private String nombre;
    private String apellido;
    private int dni;
    private int edad;
    private int grado;
    private float nota1;
    private float nota2;
    private float nota3;

    public Alumno(String nombre, String apellido, int dni, int edad, int grado, float nota1, float nota2, float nota3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.grado = grado;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public float getNota3() {
        return nota3;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public int getGrado() {
        return grado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad + ", grado=" + grado + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + '}';
    }
    public void agregarDatos(Alumno alumno){
        
    }
    public void mostrarDatos(){
        System.out.println("Nombre : "+this.nombre);
        System.out.println("Apellido: "+this.apellido);
        System.out.println("DNI :"+this.dni);
        System.out.println("Edad :"+this.edad);
        System.out.println("Grado :"+this.grado);
        int promedio=(int) ((this.nota1+this.nota2+this.nota3)/3.00f);
        System.out.println("Promedio :"+promedio);
    }
    
}