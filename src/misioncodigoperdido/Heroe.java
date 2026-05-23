package misioncodigoperdido;
import java.util.Scanner;
 public class Heroe {

	  String nombre;
	    int nivel;
	    int poder;

  public Heroe(String nombre, int nivel, int poder) {
	        this.nombre = nombre;
	        this.nivel = nivel;
	        this.poder = poder;
	    }

	    public void entrenar() {
	        poder += 10;
	        System.out.println("Has completado tu entrenamiento!");
	        System.out.println("Tu poder aumento a: " + poder);
	    }

	    public void mostrarStats() {
	        System.out.println("═══════════════════════════════");
	        System.out.println("HEROE: " + nombre);
	        System.out.println("NIVEL: " + nivel);
	        System.out.println("PODER: " + poder);
	        System.out.println("═══════════════════════════════");
	    }

	    public void menu() {
	        Scanner scanner = new Scanner(System.in);
	        int opcion = 0;

	        while (opcion != 3) {
	            System.out.println("\n╔══════════════════════════════╗");
	            System.out.println("║     MENU DEL HEROE           ║");
	            System.out.println("╠══════════════════════════════╣");
	            System.out.println("║  1. Ver mis stats            ║");
	            System.out.println("║  2. Entrenar                 ║");
	            System.out.println("║  3. Salir                    ║");
	            System.out.println("╚══════════════════════════════╝");
	            System.out.print("Elige una opcion: ");

	            opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                    mostrarStats();
	                    break;
	                case 2:
	                    entrenar();
	                    break;
	                case 3:
	                    System.out.println("Hasta la proxima, " + nombre + "!");
	                    break;
	                default:
	                    System.out.println("Opcion invalida, intenta de nuevo.");
	            }
	        }
	        scanner.close();
	    }
}
