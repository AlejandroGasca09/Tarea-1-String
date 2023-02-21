import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Escribe tu nombre , profesion y pais de origen");
        String entrada = teclado.nextLine();
        String nombre = teclado.nextLine();
        String profesion = teclado.nextLine();
        String pais = teclado.nextLine();
        System.out.println("Nombre :"+nombre.toUpperCase());
        System.out.println("Profesión: "+ profesion.toUpperCase());
        System.out.println("País: "+ pais.toUpperCase());
    }
}
