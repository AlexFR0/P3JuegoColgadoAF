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

	}

}
