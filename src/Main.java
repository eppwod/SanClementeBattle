import java.util.Scanner;

public class Main {

	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		// Ojeto de la clase Jugador
		Jugador jugador = new Jugador();
		System.out.println("Nombre de tu personaje: ");
		jugador.nombre = entrada.nextLine().toUpperCase();
		
		System.out.println("¡Hola "+jugador.nombre+"! Te espera un desafío importante... ¡Buena suerte en la batalla del San Clemente!");

		int id_profe = 1; // Inicializo la variable que identifica al profe en 1
		
		// Creo los objetos de la clase Profe
		Profe profe1 = new Profe(); // Boss Miguel
		profe1.nombre = "Miguel";
		profe1.id_profe = 1;
		profe1.nombre_ataque1 = "PDF";
		profe1.nombre_ataque2 = "PRÁCTICA DE TALLER";
		profe1.nombre_ataque3 = "QUINCE TAREAS EN MESTRE";
		profe1.frase1 = "MIGUEL: ¡Hola, soy Miguel y esto es SISTEMAS INFORMÁTICOS en directo desde el San Clemente!";
		profe1.frase2 = "MIGUEL: Ya me diréis cuándo queréis la fecha de entrega jejeje...";
		profe1.frase3 = "MIGUEL: Enhorabuena "+jugador.nombre+", ahora sabes usar un puto PC.";
		
		Profe profe2 = new Profe(); // Boss Meritxell
		profe2.nombre = "Meritxell";
		profe2.id_profe = 2;
		profe2.nombre_ataque1 = "LA BUROCRASIA";
		profe2.nombre_ataque2 = "ATAQUE CUENTACUENTOS";
		profe2.nombre_ataque3 = "NÓMINA";
		profe2.frase1 = "MERITXELL: FOL es tu asignatura favorita pero todavía no lo sabes jijiji...";
		profe2.frase2 = "MERITXELL: Prepárate porque el mundo laboral es todavía más duro que esto.";
		profe2.frase3 = "MERITXELL: Has aprobado FOL, joven. Ahora puedes ejercer la abogacía.";
		
		Profe profe3 = new Profe(); // Boss Isaac
		profe3.nombre = "Isaac";
		profe3.id_profe = 3;
		profe3.nombre_ataque1 = "W3C";
		profe3.nombre_ataque2 = "FRIKADA";
		profe3.nombre_ataque3 = "BORDER-RADIUS";
		
		Profe profe4 = new Profe(); // Boss Enrique
		profe4.nombre = "Enrique";
		profe4.id_profe = 4;
		profe4.nombre_ataque1 = "COACHING";
		profe4.nombre_ataque2 = "PULL REQUEST";
		profe4.nombre_ataque3 = "GIT MERGE";
		
		Profe profe5 = new Profe(); // Boss Fran
		profe5.nombre = "Fran";
		profe5.id_profe = 5;
		profe5.nombre_ataque1 = "TEORÍA";
		profe5.nombre_ataque2 = "PC VIEJO";
		profe5.nombre_ataque3 = "EXAMEN";
		
		Profe profe6 = new Profe(); // Boss Álex
		profe6.nombre = "Álex";
		profe6.id_profe = 5;
		profe6.nombre_ataque1 = "ESQUEMA";
		profe6.nombre_ataque2 = "RISA MALVADA";
		profe6.nombre_ataque3 = "LEFT OUTER JOIN";
		
		// Bucle principal del juego
		while ((id_profe <= 6) && (jugador.vida > 0)) { // El jugador tiene vida y quedan bosses por vencer
			
			if ((id_profe == 1) && (jugador.vida > 0)) { // El jugador tiene vida y le toca enfrentarse al profe 1

				int turno = 0; // El turno 0 será el del jugador y el 1 el del profe
				
				System.out.println("¡Un "+profe1.nombre+" salvaje apareció!");
				System.out.println(profe1.frase1);
				
				while ((profe1.vida > 0) && (jugador.vida > 0)) { // Empieza el combate con el profe 1
					
					if (turno == 0) { // Turno del jugador

						profe1.estado();
						jugador.estado();

						System.out.println("¡Es el turno de " + jugador.nombre + '!');
						int accion = jugador.accion();
						if (accion == 1) { // El jugador ataca
							int daño = jugador.ataque();
							System.out.println('¡' + jugador.nombre + " usa " + jugador.nombre_habilidad + '!');
							profe1.vida = profe1.vida-daño;
							if ((daño >= 0) && (daño < 49)) { // Mensaje fin de turno
								System.out.println("No es muy efectivo...");
								System.out.println("Haces " + daño + "puntos de daño...");
							} else {
								System.out.println("¡Es muy efectivo!");
								System.out.println("Haces " + daño + "puntos de daño...");
							}
						}
						else { // El jugador se defiende
							int sanacion = jugador.defensa();
							jugador.vida = jugador.vida+sanacion;
							
							System.out.println('¡' + jugador.nombre + ", has usado " + jugador.nombre_habilidad + '!');
							System.out.println("¡Te has curado "+sanacion+" puntos!");
							
						}

						turno = 1;
					}

					if (turno == 1) { // Turno del profe
						
						System.out.println("¡Es el turno de " + profe1.nombre + '!');
						
						int daño = profe1.ataque();

						System.out.println(profe1.nombre + " usó " + profe1.nombre_ataque + "...");

						if (profe1.nombre_ataque == profe1.nombre_ataque1) {
							jugador.vida = jugador.vida-daño;
							System.out.println("No es muy efectivo...");
							System.out.println("Recibes " + daño + " puntos de daño.");
						} else if (profe1.nombre_ataque == profe1.nombre_ataque2) {
							jugador.vida = jugador.vida+daño;
							profe1.vida = profe1.vida+daño;
							System.out.println('¡' + profe1.nombre + " ha captado tu atención!");
							System.out.println("¡Te has curado "+daño+" puntos!");
							System.out.println('¡'+profe1.nombre+" se ha curado "+daño+"puntos!");
							
						} else if (profe1.nombre_ataque == profe1.nombre_ataque3) {
							jugador.vida = jugador.vida-daño;
							System.out.println("¡Es muy efectivo!");
							System.out.println("Recibes " + daño + " puntos de daño.");
							System.out.println(profe1.frase2);
						}
					turno = 0;	
					} // Fin turno profe
				} // Fin combate con profe1
				
				System.out.println("¡Has derrotado a "+profe1.nombre+"!");
				System.out.println(profe1.frase3);
				
				id_profe++;
				
			} // Fin pre-combate. Ahora el id_ profe es 2
			
			
			else if ((id_profe == 2) && (jugador.vida > 0)) { // El jugador tiene vida y le toca enfrentarse al profe 2
				
				int turno = 0; // El turno 0 será el del jugador y el 1 el del profe
				
				System.out.println(profe2.nombre+" salvaje apareció!");
				System.out.println(profe2.frase1);
				
				while ((profe2.vida > 0) && (jugador.vida > 0)) { // Empieza el combate con el profe 2
					
					if (turno == 0) { // Turno del jugador

						profe2.estado();
						jugador.estado();

						System.out.println("¡Es el turno de " + jugador.nombre + '!');
						int accion = jugador.accion();
						if (accion == 1) { // El jugador ataca
							int daño = jugador.ataque();
							System.out.println('¡' + jugador.nombre + " usa " + jugador.nombre_habilidad + '!');
							profe2.vida = profe2.vida-daño;
							if ((daño >= 0) && (daño < 49)) { // Mensaje fin de turno
								System.out.println("No es muy efectivo...");
								System.out.println("Haces " + daño + "puntos de daño...");
							} else {
								System.out.println("¡Es muy efectivo!");
								System.out.println("Haces " + daño + "puntos de daño...");
							}
						}
						else { // El jugador se defiende
							int sanacion = jugador.defensa();
							jugador.vida = jugador.vida+sanacion;
							
							System.out.println('¡' + jugador.nombre + ", has usado " + jugador.nombre_habilidad + '!');
							System.out.println("¡Te has curado "+sanacion+" puntos!");
							
						}

						turno = 1;
					}

					if (turno == 1) { // Turno del profe
						
						System.out.println("¡Es el turno de " + profe2.nombre + '!');
						
						int daño = profe2.ataque();

						System.out.println(profe2.nombre + " usó " + profe2.nombre_ataque + "...");

						if (profe2.nombre_ataque == profe2.nombre_ataque1) {
							jugador.vida = jugador.vida-daño;
							System.out.println("No es muy efectivo...");
							System.out.println("Recibes " + daño + " puntos de daño.");
						} else if (profe2.nombre_ataque == profe2.nombre_ataque2) {
							jugador.vida = jugador.vida+daño;
							profe2.vida = profe2.vida+daño;
							System.out.println('¡' + profe2.nombre + " ha captado tu atención!");
							System.out.println("¡Te has curado "+daño+" puntos!");
							System.out.println('¡'+profe2.nombre+" se ha curado "+daño+"puntos!");
							
						} else if (profe2.nombre_ataque == profe2.nombre_ataque3) {
							jugador.vida = jugador.vida-daño;
							System.out.println("¡Es muy efectivo!");
							System.out.println("Recibes " + daño + " puntos de daño.");
							System.out.println(profe2.frase2);
						}
					turno = 0;	
					} // Fin turno profe
				} // Fin combate con profe1
				
				System.out.println("¡Has derrotado a "+profe2.nombre+"!");
				System.out.println(profe2.frase3);
				
				id_profe++;
				
			} // Fin pre-combate. Ahora el id_ profe es 3
				
				
				
			
			
			else if ((id_profe == 3) && (jugador.vida > 0)) { // El jugador tiene vida y le toca enfrentarse al profe 3
				
			} 
			else if ((id_profe == 4) && (jugador.vida > 0)) { // El jugador tiene vida y le toca enfrentarse al profe 4
				
			} 
			else if ((id_profe == 5) && (jugador.vida > 0)) { // El jugador tiene vida y le toca enfrentarse al profe 5
				
			} 
			else if ((id_profe == 6) && (jugador.vida > 0)) { // El jugador tiene vida y le toca enfrentarse al profe 6
				
			} 
			else { // O bien el jugador no tiene vida o bien se ha pasado el juego
				if (jugador.vida > 0) {
					// GANAS
				} else {
					// PIERDES
				}

			}
		}

} // Fin método main
} // Fin clase principal