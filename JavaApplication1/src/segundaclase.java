
import java.util.Scanner;


public class segundaclase {

    public static void main(String args[]) {
        System.out.println("Proporcione el Nombre");
        Scanner consola = new Scanner(System.in);
        var nombre = String.valueOf(consola.nextLine());
        System.out.println("Proporcione el ID");
        var usuario= Integer.parseInt(consola.nextLine());
        System.out.println("Proporcione el Precio");
        var precio= Double.parseDouble(consola.nextLine());
        System.out.println("Proporcione el Envio Gratuito");
        boolean envio=Boolean.parseBoolean(consola.nextLine());
        System.out.println(nombre+ "#"+usuario);
        System.out.println("Precio: "+"$"+precio);
        System.out.println("Envio Gratuito: "+envio);
    }

}
