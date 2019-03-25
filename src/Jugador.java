
public class Jugador { // MODIFICAR CLASE A PARTIR DE AQUÍ
		//Atributos

		String nombre_personaje = "character_name";
		int id_enemigo = 0;
		int vida_personaje = 100;
		int tipo_ataque = 1;
		String nombre_ataque1 = "attack1_name";
		String nombre_ataque2 = "attack2_name";
		String nombre_ataque3 = "attack3_name";
		int potencia_ataque = 1;

		//Métodos
		public int[] definir_ataque() {

			int dados = (int)(Math.random()*100);
			System.out.println("Tirada de dados... "+ '¡'+ nombre_personaje + " ha obtenido un " + dados + '!');

			if (dados >=0 && dados <60) {
				potencia_ataque = potencia_ataque*dados; 
				tipo_ataque = 1;
			} 
			else if (dados >=60 && dados <75) {
				potencia_ataque *= dados;
				tipo_ataque = 2;
			}
			else { 
				potencia_ataque = potencia_ataque*dados;
				tipo_ataque = 3; 
			}

			int[] ataque = {tipo_ataque, potencia_ataque};	
			return ataque;
		} // Fin método definir_ataque()

		public void estado() {
			System.out.println('['+nombre_personaje.toUpperCase()+']');
			System.out.println("ENERGÍA: "+'['+new String(new char[Math.round(vida_personaje/10)]).replace("\0", "#")+"] "+ vida_personaje);
		} // Fin método estado()

	} // Fin clase Jugador
