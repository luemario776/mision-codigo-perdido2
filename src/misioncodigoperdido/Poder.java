package misioncodigoperdido;
import java.util.Scanner;
public class Poder {

	  String nombre;
	    int danio;

	    public static void iniciar() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("╔══════════════════════════════════════╗");
	        System.out.println("║   Forja tu Arma en el Reino de Java! ║");
	        System.out.println("╚══════════════════════════════════════╝");

	        System.out.print("Ingresa el nombre de tu poder: ");
	        String nombre = scanner.nextLine();

	        System.out.print("Ingresa el daño de tu poder: ");
	        int danio = scanner.nextInt();

	        System.out.println("\nEl poder " + nombre + " ha sido forjado!");
	        System.out.println("Daño: " + danio);

	        Poder poder = new Poder(nombre, danio);
	        poder.menu();
	    }

	    public Poder(String nombre, int danio) {
	        this.nombre = nombre;
	        this.danio = danio;
	    }

	    public String activar() {
	        return "El cielo se quiebra al liberar " + nombre + " causando " + danio + " de daño!";
	    }

	    public void mostrarStats() {
	        System.out.println("═══════════════════════════════");
	        System.out.println("PODER: " + nombre);
	        System.out.println("DAÑO:  " + danio);
	        System.out.println("═══════════════════════════════");
	    }

	    public void menu() {
	        Scanner scanner = new Scanner(System.in);
	        int opcion = 0;

	        while (opcion != 3) {
	            System.out.println("\n╔══════════════════════════════╗");
	            System.out.println("║     MENU DEL PODER           ║");
	            System.out.println("╠══════════════════════════════╣");
	            System.out.println("║  1. Ver stats del poder      ║");
	            System.out.println("║  2. Activar poder            ║");
	            System.out.println("║  3. Salir                    ║");
	            System.out.println("╚══════════════════════════════╝");
	            System.out.print("Elige una opcion: ");

	            opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                    mostrarStats();
	                    break;
	                case 2:
	                    System.out.println(activar());
	                    break;
	                case 3:
	                    System.out.println("El poder " + nombre + " regresa a las sombras...");
	                    break;
	                default:
	                    System.out.println("Opcion invalida, intenta de nuevo.");
	            }
	        }
	        scanner.close();
	    }
}
