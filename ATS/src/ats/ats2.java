
package ats;

public class ats2 {
    public static void main(String[] args) {
        int impar=0;
        int contador=0;
        long producto=1;
        while (contador<10){
            impar++;
            if (impar%2==1){
                contador++;
                producto*=impar;
            
            }
        
        
        }
        System.out.println("producto de los primeros 10 numeros impares"+producto);
    }
    
}
