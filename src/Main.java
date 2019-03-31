
import java.util.Scanner;

public class Main {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		// Ojeto de la clase Jugador
		Jugador jugador = new Jugador();
		System.out.println("Escribe tu nombre para comenzar: ");
		jugador.nombre = entrada.nextLine().toUpperCase();

		// Texto de bienvenida
		System.out.println("¡Hola " + jugador.nombre
				+ "! Te espera un desafío importante... ¡Buena suerte en la batalla del San Clemente!");
		System.out.println("");
		System.out.println("");
		
		// Objetos de la clase Profe
		Profe profe0 = new Profe(); // Boss Miguel
		profe0.nombre = "MIGUEL";
		profe0.dificultad = 1.0f;
		profe0.nombre_ataque1 = "GOLPE DE PDF";
		profe0.nombre_ataque2 = "PRÁCTICA DE TALLER";
		profe0.nombre_ataque3 = "SUBIR QUINCE TAREAS EN MESTRE";
		profe0.frase1 = "MIGUEL: ¡Hola, soy el profe de SISTEMAS INFORMÁTICOS!"; // Saludo
		profe0.frase2 = "MIGUEL: Ya me diréis cuándo queréis la fecha de entrega jejeje..."; // Frase que dice al lanzar un ataque muy efectivo
		profe0.frase3 = "MIGUEL: Enhorabuena " + jugador.nombre + ", ahora sabes usar un puto PC."; // Jugador gana
		profe0.frase4 = "MIGUEL: Te he ganado... haz captura de pantalla a esto y lo subes al Mestre."; // Jugador pierde

		Profe profe1 = new Profe(); // Boss Meritxell
		profe1.nombre = "MERITXELL";
		profe1.dificultad = 1.1f;
		profe1.nombre_ataque1 = "LA BUROCRASIA";
		profe1.nombre_ataque2 = "UNA HISTORIA SOBRE LA VIDA Y SUS MOVIDAS";
		profe1.nombre_ataque3 = "NÓMINA";
		profe1.frase1 = "MERITXELL: FOL es tu asignatura favorita pero todavía no lo sabes jijiji...";
		profe1.frase2 = "MERITXELL: Prepárate porque el mundo laboral es todavía más duro que esto.";
		profe1.frase3 = "MERITXELL: Has aprobado FOL, joven. Ahora puedes ejercer la abogacía.";
		profe1.frase4 = "MERITXELL: Según la Ley Orgánica de Educación 2/2006 del 3 de mayo, te suspendo y pierdes el juego por tolai :)";

		Profe profe2 = new Profe(); // Boss Isaac
		profe2.nombre = "ISAAC";
		profe2.dificultad = 1.2f;
		profe2.nombre_ataque1 = "UVEDOBLE TRES ESCULS";
		profe2.nombre_ataque2 = "CURIOSIDADES DE INTERNET";
		profe2.nombre_ataque3 = "BORDER-RADIUS";
		profe2.frase1 = "ISAAC: ¡Qué tal chavales! ";
		profe2.frase2 = "ISAAC: ¿Sabes qué tiene también los bordes redondeados? Un 0 jejejeje...";
		profe2.frase3 = "ISAAC: ";
		profe2.frase4 = "";

		Profe profe3 = new Profe(); // Boss Enrique
		profe3.nombre = "ENRIQUE";
		profe3.dificultad = 1.3f;
		profe3.nombre_ataque1 = "ATAQUE JIT";
		profe3.nombre_ataque2 = "PULL REQUEST";
		profe3.nombre_ataque3 = "PASAR LISTA";
		profe3.frase1 = "ENRIQUE: ¡Hola! Esto es Contornos de Desenvolvemento... ¡veamos qué tienes!";
		profe3.frase2 = "ENRIQUE: Estudiante, dentro de un rato mira Abalar... ¡Tienes un regalo de tu amigo Agrasar!";
		profe3.frase3 = "ENRIQUE: Apasionante...";
		profe3.frase4 = "ENRIQUE: No te preocupes, "+jugador.nombre+". Perder es solo otra forma de ganar... Pero has perdido jajaja";

		Profe profe4 = new Profe(); // Boss Fran
		profe4.nombre = "ÁLEX";
		profe4.dificultad = 1.4f;
		profe4.nombre_ataque1 = "PUÑETAZO TEÓRICO";
		profe4.nombre_ataque2 = "RISA MALVADA";
		profe4.nombre_ataque3 = "LEFT OUTER JOIN";
		profe4.frase1 = "ÁLEX: No te preocupes, Bases de Datos es una asignatura facililla...";
		profe4.frase2 = "ÁLEX: SELECT guantazo from MI_MANO where (mano_destino = tu cara);";
		profe4.frase3 = "ÁLEX: ¡Bien hecho "+jugador.nombre+"! Te he enseñado bien. Sólo te falta una asignatura.. ¿Has estudiado?";
		profe4.frase4 = "ÁLEX: Se siente, haber estudiao...";

		Profe profe5 = new Profe(); // Boss Álex
		profe5.nombre = "FRAN";
		profe5.dificultad = 1.5f;
		profe5.nombre_ataque1 = "TEORÏA";
		profe5.nombre_ataque2 = "CHISTACO";
		profe5.nombre_ataque3 = "HOSTIA TUPLA";
		profe5.frase1 = "FRAN: if ("+jugador.nombre+".vida < mucho) {estás jodido;}";
		profe5.frase2 = "FRAN: Eres débil, estudiante. ¡En cuanto acabe contigo me voy corriendo a matar dragones a puñetazos!";
		profe5.frase3 = "FRAN: Has ganado esta batalla. Quizá algún día serás dígno del título de \"Programador\"... ¡pero nos veremos antes de eso MUAJAJAJAJA!";
		profe5.frase4 = "FRAN: Casi lo consigues pero te has flipado colega. Ala, a tu casa :)";

		Profe arrayProfes[] = new Profe[6];

		arrayProfes[0] = profe0;
		arrayProfes[1] = profe1;
		arrayProfes[2] = profe2;
		arrayProfes[3] = profe3;
		arrayProfes[4] = profe4;
		arrayProfes[5] = profe5;

		// Bucle principal del juego
		for (int x = 0; x < arrayProfes.length; x++) {
			System.out.println("");
			System.out.println("");
			System.out.println(arrayProfes[x].nombre + " salvaje apareció!");
			System.out.println(arrayProfes[x].frase1);

			int turno = 0;
			
			arrayProfes[x].estado();
			jugador.estado();
			
			while ((jugador.vida > 0) && (arrayProfes[x].vida > 0)) {

				if (turno == 0) {

					System.out.println("¡Es el turno de " + jugador.nombre + '!');
					int accion = jugador.accion();
					if (accion == 1) { // El jugador ataca
						int daño = jugador.ataque();
						System.out.println('¡' + jugador.nombre + " ha usado " + jugador.nombre_habilidad + '!');
						arrayProfes[x].vida = arrayProfes[x].vida - daño;
						if ((daño >= 0) && (daño <= 59)) { // Mensaje fin de turno
							System.out.println("No es muy efectivo...");
							System.out.println("Haces " + daño + " puntos de daño...");
						} else {
							System.out.println("¡Es muy efectivo!");
							System.out.println("Haces " + daño + " puntos de daño...");
						}
					} // if accion == 1
					else { // El jugador se defiende
						int sanacion = jugador.defensa();
						jugador.vida = jugador.vida + sanacion;

						System.out.println('¡' + jugador.nombre + ", has usado " + jugador.nombre_habilidad + '!');
						System.out.println("¡Ganas " + sanacion + " puntos de energía!");
					} // accion == 2

					turno = 1;
					
				} // if (turno == 0)
				else { // Turno == 1
					System.out.println("");
					System.out.println("");
					System.out.println("¡Es el turno de " + arrayProfes[x].nombre + '!');

					int daño = arrayProfes[x].ataque();

					System.out.println(arrayProfes[x].nombre + " usó " + arrayProfes[x].nombre_ataque + "...");

					if (arrayProfes[x].nombre_ataque == arrayProfes[x].nombre_ataque1) {
						jugador.vida = jugador.vida - daño;
						System.out.println("No es muy efectivo...");
						System.out.println("Recibes " + daño + " puntos de daño.");
					} else if (arrayProfes[x].nombre_ataque == arrayProfes[x].nombre_ataque2) {
						jugador.vida = jugador.vida + daño;
						arrayProfes[x].vida = arrayProfes[x].vida + daño;
						System.out.println("¡El gran poder de " + arrayProfes[x].nombre + " ha captado la atención de la clase!");
						System.out.println('¡'+arrayProfes[x].nombre+" ha subido tu energía " + daño + " puntos!");
						System.out.println('¡' + arrayProfes[x].nombre + " también recibe " + daño + " puntos de energía!");

					} else if (arrayProfes[x].nombre_ataque == arrayProfes[x].nombre_ataque3) {
						jugador.vida = jugador.vida - daño;
						System.out.println("¡Es muy efectivo!");
						System.out.println("Recibes " + daño + " puntos de daño.");
						System.out.println(arrayProfes[x].frase2);
					}

					turno = 0;

					if (jugador.vida <= 0) {
						break;
					}
					System.out.println("");
					System.out.println("");
					
					arrayProfes[x].estado();
					jugador.estado();
					
				} // turno == 1
			} // while ((jugador.vida > 0)&&(arrayProfes[i].vida > 0))
			if (jugador.vida > 0) {
				// Jugador gana
				System.out.println("¡Has derrotado a " + arrayProfes[x].nombre + '!');
				System.out.println(arrayProfes[x].frase3);
				System.out.println("");
				System.out.println("");
			} else {
				// Jugador pierde
				System.out.println(arrayProfes[x].nombre + " te ha derrotado...");
				System.out.println(arrayProfes[x].frase4);
				System.out.println("Mala suerte, " + jugador.nombre + ". Casi lo consigues...");
				System.exit(0);
			}
		} // for (int i=0;i<=arrayProfes.length;i++)

		System.out.println("¡Enhorabuena estudiante! Has ganado la Batalla del San Clemente...");
		System.out.println("La Guerra continuará el próximo curso. Disfruta las vacaciones... ");
	} // Método main
} // Clase principal