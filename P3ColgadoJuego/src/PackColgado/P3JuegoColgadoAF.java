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
		        
		        scanner.nextLine();

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
		                System.out.println("Es el turno de " + jugadores[turno]);
		                System.out.println("Palabra secreta: " + new String(palabraAdivinada));
		                System.out.println("Intentos restantes: " + intentosRestantes);
		            
		        
		        
		        //PARTE4
		        
		        // Pedir la letra al jugador
                System.out.print("Ingrese una letra: ");
                char letra = scanner.next().charAt(0);
                scanner.nextLine();  // Limpiar el buffer

                // Comprobar si la letra está en la palabra secreta
                int aciertos = 0;
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraSecreta.charAt(i) == letra && palabraAdivinada[i] == '_') {
                        palabraAdivinada[i] = letra;
                        aciertos++;
                    }
                }

                // Si la letra no fue correcta, restar un intento
                if (aciertos == 0) {
                    intentosRestantes--;
                    System.out.println("Letra incorrecta.");
                } else {
                    System.out.println("¡Correcto!");
                }
		        
		        //PARTE5
                
                boolean palabraAdivinadaCompletamente = true;
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraAdivinada[i] == '_') {
                        palabraAdivinadaCompletamente = false;
                        break;
                    }
                }
                
                if (palabraAdivinadaCompletamente) {
                    rondasGanadas++;
                    System.out.println("¡Has adivinado la palabra! La palabra es: " + palabraSecreta);
                    intentosRestantes = 0; 
                    break;

                }
	
                if (intentosRestantes == 0) {
                    System.out.println("Se acabaron los intentos. La palabra era: " + palabraSecreta);
                    break;
                }
                }
                if (intentosRestantes == 0) {
                    break;

                }
			}
            
		       
			//PARTE6

			System.out.println("El jugador que ha ganado más rondas es: " + jugadores[0]);
	        scanner.close();



}
}


