
package operaciones;


public class Aritmetica {
    //atributos de la clase
    int a;
    int b;
    //metodo
    public void sumar(){
        int resultado=a+b;
        System.out.println("resultado = " + resultado);
        
    }
    public int sumarConRetorno(){
        int resultado=a+b;
        return resultado;
    }
    public int sumarConArgumentos(int arg1, int arg2){
        a=arg1;
        b=arg2;
        return a+b;S
    }
}
