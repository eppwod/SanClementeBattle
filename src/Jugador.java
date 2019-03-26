import java.util.Scanner;

public class Jugador {

	// Atributos
	Scanner entrada = new Scanner(System.in);
	
	String nombre = "";
	int vida = 100;
	String nombre_habilidad;
	int score = 0;

	
	// Métodos
	
	public int accion() {
		System.out.println("Selecciona una acción: ");
		System.out.println("1 - ATAQUE");
		System.out.println("2 - DEFENSA");
		int accion = entrada.nextInt();

		while ((accion != 1) && (accion != 2)) {
			System.out.println("1 - ATAQUE");
			System.out.println("2 - DEFENSA");
			accion = entrada.nextInt();
		}

		return accion;
	}

	public int ataque() {

		int dados = (int) (Math.random() * 100);
		System.out.println("Tirada de dados... " + '¡' + nombre + " ha obtenido un " + dados + '!');

		if (dados <= 49) { // 50%
			nombre_habilidad = "PROCRASINACIÓN";
		} else {
			nombre_habilidad = "STACK OVERFLOW";
		}
		return dados;
	} // Fin ataque()

	public int defensa() {
		int dados = (int) (Math.random() * 100);
		System.out.println("Tirada de dados... " + '¡' + nombre + " ha obtenido un " + dados + '!');
		nombre_habilidad = "un VIDEO-TUTORIAL";
		return dados;
	} // Fin defensa()

	public void estado() {
		if (vida > 0) {
		System.out.println("------------------------------------------------------------");
		System.out.println('[' + nombre.toUpperCase() + ']');
		System.out.println(
				"ENERGÍA: " + '[' + new String(new char[Math.round(vida / 10)]).replace("\0", "#") + "] " + vida);
		System.out.println("------------------------------------------------------------");
		}
		else {
			vida = 0;
			System.out.println("------------------------------------------------------------");
			System.out.println('[' + nombre.toUpperCase() + ']');
			System.out.println(
					"ENERGÍA: " + "[ ]" + vida);
			System.out.println("------------------------------------------------------------");
			}
	} // Fin estado()

} // Fin clase Jugador
