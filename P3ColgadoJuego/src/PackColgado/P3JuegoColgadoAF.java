package PackColgado;

import java.util.Scanner;

public class P3JuegoColgadoAF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//PARTE1
				Scanner scanner = new Scanner(System.in);

		        // Solicitar el número de jugadores (mínimo 2)
		        System.out.print("¿Cuántos jugadores van a jugar? (Mínimo 2): ");
		        int numJugadores = scanner.nextInt();
		        while (numJugadores < 2) {
		            System.out.print("Debe haber al menos 2 jugadores. Ingrese nuevamente: ");
		            numJugadores = scanner.nextInt();
		        }
				
		        String[] jugadores = new String[numJugadores];
		        for (int i = 0; i < numJugadores; i++) {
		            System.out.print("Ingrese el nombre del jugador " + (i + 1) + ": ");
		            jugadores[i] = scanner.nextLine();
		        }

		        
			//PARTE2
		        
		        // Pedir la palabra secreta al admin
		        System.out.print("--Jugador " + jugadores[0] + ", ingresa la palabra secreta: ");
		        String palabraSecreta = scanner.nextLine();

		        
		        char[] palabraAdivinada = new char[palabraSecreta.length()];
		        for (int i = 0; i < palabraSecreta.length(); i++) {
		            palabraAdivinada[i] = '_';  
		        }
     
		        
		    	//PARTE3    
		        
		        int intentosRestantes = 6;
		        int rondasGanadas = 0;

		        // Ciclo principal del juego
		        while (intentosRestantes > 0) {
		            // Determinar quién le toca jugar (se alternan los jugadores)
		            for (int turno = 0; turno < numJugadores; turno++) {
		                System.out.println("\nEs el turno de " + jugadores[turno]);
		                System.out.println("Palabra secreta: " + new String(palabraAdivinada));
		                System.out.println("Intentos restantes: " + intentosRestantes);
		            }
		        }
		        
		        
		        
		        
		        
		        
		        
	}
}
