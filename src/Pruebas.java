
import java.util.Scanner;

public class Pruebas {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		// Ojeto de la clase Jugador
		Jugador jugador = new Jugador();
		System.out.println("Nombre de tu personaje: ");
		jugador.nombre = entrada.nextLine().toUpperCase();

		System.out.println("¡Hola " + jugador.nombre
				+ "! Te espera un desafío importante... ¡Buena suerte en la batalla del San Clemente!");

		int id_profe = 1; // Inicializo la variable que identifica al profe en 1

		// Creo los objetos de la clase Profe
		Profe profe1 = new Profe(); // Boss Miguel
		profe1.nombre = "MIGUEL";
		profe1.dificultad = 1.0f;
		profe1.nombre_ataque1 = "PDF";
		profe1.nombre_ataque2 = "PRÁCTICA DE TALLER";
		profe1.nombre_ataque3 = "QUINCE TAREAS EN MESTRE";
		profe1.frase1 = "MIGUEL: ¡Hola, soy Miguel esto es SISTEMAS INFORMÁTICOS en directo desde el San Clemente!";
		profe1.frase2 = "MIGUEL: Ya me diréis cuándo queréis la fecha de entrega jejeje...";
		profe1.frase3 = "MIGUEL: Enhorabuena " + jugador.nombre + ", ahora sabes usar un puto PC.";
		profe1.frase4 = "";

		Profe profe2 = new Profe(); // Boss Meritxell
		profe2.nombre = "MERITXELL";
		profe2.dificultad = 1.1f;
		profe2.nombre_ataque1 = "LA BUROCRASIA";
		profe2.nombre_ataque2 = " UNA HISTORIA SOBRE LA VIDA Y SUS MOVIDAS";
		profe2.nombre_ataque3 = "NÓMINA";
		profe2.frase1 = "MERITXELL: FOL es tu asignatura favorita pero todavía no lo sabes jijiji...";
		profe2.frase2 = "MERITXELL: Prepárate porque el mundo laboral es todavía más duro que esto.";
		profe2.frase3 = "MERITXELL: Has aprobado FOL, joven. Ahora puedes ejercer la abogacía.";
		profe2.frase4 = "";

		Profe profe3 = new Profe(); // Boss Isaac
		profe3.nombre = "ISAAC";
		profe3.dificultad = 1.2f;
		profe3.nombre_ataque1 = "W3C";
		profe3.nombre_ataque2 = "FRIKADA";
		profe3.nombre_ataque3 = "BORDER-RADIUS";
		profe3.frase1 = "ISAAC: ";
		profe3.frase2 = "ISAAC: ";
		profe3.frase3 = "ISAAC: ";
		profe3.frase4 = "";

		Profe profe4 = new Profe(); // Boss Enrique
		profe4.nombre = "ENRIQUE";
		profe4.dificultad = 1.3f;
		profe4.nombre_ataque1 = "COACHING";
		profe4.nombre_ataque2 = "PULL REQUEST";
		profe4.nombre_ataque3 = "GIT MERGE";
		profe4.frase1 = "ENRIQUE: ";
		profe4.frase2 = "ENRIQUE: ";
		profe4.frase3 = "ENRIQUE: ";
		profe4.frase4 = "";

		Profe profe5 = new Profe(); // Boss Fran
		profe5.nombre = "FRAN";
		profe5.dificultad = 1.4f;
		profe5.nombre_ataque1 = "TEORÍA";
		profe5.nombre_ataque2 = "PC VIEJO";
		profe5.nombre_ataque3 = "EXAMEN";
		profe5.frase1 = "FRAN: ";
		profe5.frase2 = "FRAN: ";
		profe5.frase3 = "FRAN: ";
		profe5.frase4 = "";

		Profe profe6 = new Profe(); // Boss Álex
		profe6.nombre = "ÁLEX";
		profe6.dificultad = 1.5f;
		profe6.nombre_ataque1 = "ESQUEMA";
		profe6.nombre_ataque2 = "RISA MALVADA";
		profe6.nombre_ataque3 = "LEFT OUTER JOIN";
		profe6.frase1 = "ÁLEX: ";
		profe6.frase2 = "ÁLEX: ";
		profe6.frase3 = "ÁLEX: ";
		profe6.frase4 = "";

		Profe arrayProfes[] = new Profe[6];

		arrayProfes[0] = profe1;
		arrayProfes[1] = profe2;
		arrayProfes[2] = profe3;
		arrayProfes[3] = profe4;
		arrayProfes[4] = profe5;
		arrayProfes[5] = profe6;

		// Bucle principal del juego
		for (int i=0;i<arrayProfes.length;i++){

			System.out.println("¡Un " + arrayProfes[i].nombre + " salvaje apareció!");
			System.out.println(arrayProfes[i].frase1);

			int turno = 0;

			while ((jugador.vida > 0)&&(arrayProfes[i].vida > 0)) {

				if (turno == 0) {
					arrayProfes[i].estado();
					jugador.estado();

					System.out.println("¡Es el turno de " + jugador.nombre + '!');
					int accion = jugador.accion();
					if (accion == 1) { // El jugador ataca
						int daño = jugador.ataque();
						System.out.println('¡' + jugador.nombre + " ha usado " + jugador.nombre_habilidad + '!');
						arrayProfes[i].vida = arrayProfes[i].vida - daño;
						if ((daño >= 0) && (daño < 49)) { // Mensaje fin de turno
							System.out.println("No es muy efectivo...");
							System.out.println("Haces " + daño + "puntos de daño...");
						} 
						else {
							System.out.println("¡Es muy efectivo!");
							System.out.println("Haces " + daño + "puntos de daño...");
						}
					} // if accion == 1
					else { // El jugador se defiende
						int sanacion = jugador.defensa();
						jugador.vida = jugador.vida + sanacion;

						System.out.println('¡' + jugador.nombre + ", has usado " + jugador.nombre_habilidad + '!');
						System.out.println("¡Te has curado " + sanacion + " puntos!");
					} // accion == 2

					turno = 1;

				} // if (turno == 0)
				else { // Turno == 1
					System.out.println("¡Es el turno de " + arrayProfes[i].nombre + '!');

					int daño = arrayProfes[i].ataque();

					System.out.println(arrayProfes[i].nombre + " usó " + arrayProfes[i].nombre_ataque + "...");

					if (arrayProfes[i].nombre_ataque == arrayProfes[i].nombre_ataque1) {
						jugador.vida = jugador.vida - daño;
						System.out.println("No es muy efectivo...");
						System.out.println("Recibes " + daño + " puntos de daño.");
					} 
					else if (arrayProfes[i].nombre_ataque == arrayProfes[i].nombre_ataque2) {
						jugador.vida = jugador.vida + daño;
						arrayProfes[i].vida = arrayProfes[i].vida + daño;
						System.out.println('¡' + arrayProfes[i].nombre + " ha captado tu atención!");
						System.out.println("¡Te has curado " + daño + " puntos!");
						System.out.println('¡' + arrayProfes[i].nombre + " se ha curado " + daño + "puntos!");

					} else if (arrayProfes[i].nombre_ataque == arrayProfes[i].nombre_ataque3) {
						jugador.vida = jugador.vida - daño;
						System.out.println("¡Es muy efectivo!");
						System.out.println("Recibes " + daño + " puntos de daño.");
						System.out.println(arrayProfes[i].frase2);
					}

					turno = 0;

					if (jugador.vida <= 0) {break;}
				} // turno == 1
			} // ((jugador.vida > 0)&&(arrayProfes[i].vida > 0))
			if (jugador.vida > 0) {
				// Jugador gana
				System.out.println("¡Has derrotado a "+arrayProfes[i].nombre+'!');
				System.out.println(arrayProfes[i].frase3);
			}
			else {
				// Jugador pierde
				System.out.println(arrayProfes[i]+" te ha derrotado...");
				System.out.println("Mala suerte, " + jugador.nombre + ". Casi lo consigues...");
				System.exit(0);
			}
		} //for (int i=0;i<=arrayProfes.length;i++)

		System.out.println("¡Enhorabuena estudiante! Has ganado la Batalla del San Clemente...");
		System.out.println("La Guerra continuará el próximo curso. Disfruta las vacaciones... ");
	} // Método main
} // Clase principal