// Tengo que modificar esto con SET y GET

public class Profe {

	// Atributos

	String nombre = "character_name";
	int vida = 100;
	float dificultad = 1.00f;
	String nombre_ataque = "";
	String nombre_ataque1 = "";
	String nombre_ataque2 = "";
	String nombre_ataque3 = "";
	String frase1 = "";
	String frase2 = "";
	String frase3 = "";
	String frase4 = "";

	// Métodos

	public int get_vida() { // Preguntar a Fran cómo hacer bien esta movida
		if (this.vida < 0) {
			this.vida = 0;
		}

		return this.vida;
	}

	public int ataque() {

		int dados = (int) ((Math.random() * 100) * dificultad);
		// System.out.println("Tirada de dados... " + '¡' + nombre + " ha obtenido un "
		// + dados + '!');

		if (dados >= 0 && dados < 45) { // 45%
			nombre_ataque = nombre_ataque1;
		} else if (dados >= 45 && dados < 75) { // 30%
			nombre_ataque = nombre_ataque2;
		} else { // 25%
			nombre_ataque = nombre_ataque3;
		}

		return dados;
	} // Fin método definir_ataque()

	public void estado() {
		if (vida > 0) {
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------");
			System.out.println("                              [" + nombre.toUpperCase() + ']');
			System.out.println("                              ENERGÍA: " + '['
					+ new String(new char[Math.round(vida / 10)]).replace("\0", "#") + "] " + vida);

		} else {
			vida = 0;
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------");
			System.out.println("                              [" + nombre.toUpperCase() + ']');
			System.out.println("                              ENERGÍA: " + "[ ] " + vida);
		}
	} // Fin método estado()

} // Fin clase Personaje
