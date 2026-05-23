package misioncodigoperdido;

import java.util.Scanner;

public class Nexo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);

	        System.out.println("╔══════════════════════════════════╗");
	        System.out.println("║  Bienvenido al Reino de Java!    ║");
	        System.out.println("╚══════════════════════════════════╝");

	        System.out.print("Ingresa el nombre de tu heroe: ");
	        String nombre = scanner.nextLine();

	        System.out.print("Ingresa el nivel de tu heroe: ");
	        int nivel = scanner.nextInt();

	        System.out.print("Ingresa el poder inicial de tu heroe: ");
	        int poder = scanner.nextInt();

	        System.out.println("\nEl heroe " + nombre + " ha sido invocado!");
	        System.out.println("Nivel: " + nivel + " | Poder: " + poder);

	        Heroe heroe = new Heroe(nombre, nivel, poder);
	        heroe.menu();
	        // Actualizaciones del nexo
	    }
	}


