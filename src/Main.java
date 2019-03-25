import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Profe jugador = new Profe(); // Personaje del jugador

		System.out.println("Nombre de tu personaje: ");
		jugador.nombre = entrada.nextLine();
		jugador.nombre_ataque1 = "CONCENTRACIÓN";
		jugador.nombre_ataque2 = "PROCRASTINACIÓN";
		jugador.nombre_ataque3 = "VER TUTORIAL";


		Profe miguel = new Profe(); // Boss Miguel
		miguel.nombre = "Miguel"; 
		miguel.id_profe = 1;
		miguel.nombre_ataque1 = "PDF";
		miguel.nombre_ataque2 = "PRÁCTICA DE TALLER";
		miguel.nombre_ataque3 = "TAREA EN MESTRE";

		Profe meritxell = new Profe(); // Boss Meritxell
		meritxell.nombre = "Meritxell"; 
		meritxell.id_profe = 2;
		meritxell.nombre_ataque1 = "LA BUROCRASIA";
		meritxell.nombre_ataque2 = "HISTORIETA";
		meritxell.nombre_ataque3 = "NÓMINA";
		
		Profe isaac = new Profe(); // Boss Isaac
		isaac.nombre = "Isaac"; 
		isaac.id_profe = 3;
		isaac.nombre_ataque1 = "W3C";
		isaac.nombre_ataque2 = "FRIKADA";
		isaac.nombre_ataque3 = "BORDE REDONDEADO";
		
		Profe enrique = new Profe(); // Boss Enrique
		enrique.nombre = "Enrique"; 
		enrique.id_profe = 4;
		enrique.nombre_ataque1 = "COACHING";
		enrique.nombre_ataque2 = "PULL REQUEST";
		enrique.nombre_ataque3 = "GIT MERGE";
		
		Profe fran = new Profe(); // Boss Fran
		fran.nombre = "Fran"; 
		fran.id_profe = 5;
		fran.nombre_ataque1 = "TEORÍA";
		fran.nombre_ataque2 = "COMPUTADOR VIEJO";
		fran.nombre_ataque3 = "EXAMEN";
		
		Profe alex = new Profe(); // Boss Álex
		alex.nombre = "Álex"; 
		alex.id_profe = 5;
		alex.nombre_ataque1 = "TEORÍA";
		alex.nombre_ataque2 = "CHISTE MALO";
		alex.nombre_ataque3 = "LEFT OUTER JOIN";
		
		int id_enemigo = 1;
		
		while (id_enemigo <= 5) { //Bucle principal del juego
			int turno = 0;
			if (jugador.vida_profe > 0) {
				if (id_enemigo == 1) {
					if (turno == 0) {
						jugador.estado();
						miguel.estado();
						System.out.println('¡'+jugador.nombre+", es tu turno!");
						jugador.definir_ataque();
						if (jugador.tipo_ataque == 1) {
							System.out.println('¡'+jugador.nombre+" usó "+ jugador.nombre_ataque1);
							miguel.vida_profe =- jugador.potencia_ataque;
						if (jugador.tipo_ataque == 1) {
							System.out.println('¡'+jugador.nombre+" usó "+ jugador.nombre_ataque2);
							miguel.vida_profe =- jugador.potencia_ataque;
						if (jugador.tipo_ataque == 1) {
							System.out.println('¡'+jugador.nombre+" usó "+ jugador.nombre_ataque3);
							miguel.vida_profe =- jugador.potencia_ataque;
						}
						
					}
				} // Fin ataque tipo 1
			} // Fin turno jugador
			
			else {
				System.out.println("Mala suerte "+jugador.nombre+", las criaturas del San Clemente han podido contigo. Inténtalo en otra ocasión...");
			}
			
			id_enemigo++;
			} // Fin ID enemigo == 1

			}

		} // Fin bucle principal del juego

} // Fin método main
} // Fin clase principal