package ats;

public class ats11 {
    public static void main(String[] args) {
        int contador=0;
        long producto=1;
        while (contador<20){
        contador++;
            if (contador%2==1){
            producto*=contador;
            }
        
        }
        System.out.println("el producto de los 10 primeros numeros impares es = " + producto);
    }
}
