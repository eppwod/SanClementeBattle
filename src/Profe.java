import java.util.Scanner;

public class Profe {
	//Atributos
	
	String nombre = "character_name";
	int id_profe = 0;
	int vida_profe = 100;
	int tipo_ataque = 1;
	String nombre_ataque1 = "attack1_name";
	String nombre_ataque2 = "attack2_name";
	String nombre_ataque3 = "attack3_name";
	int potencia_ataque = 1;

	//Métodos
	public int[] definir_ataque() {
		
		int dados = (int)(Math.random()*100);
		System.out.println("Tirada de dados... "+ '¡'+ nombre + " ha obtenido un " + dados + '!');

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
		System.out.println('['+nombre.toUpperCase()+']');
		System.out.println("ENERGÍA: "+'['+new String(new char[Math.round(vida_profe/10)]).replace("\0", "#")+"] "+ vida_profe);
	} // Fin método estado()
	
} // Fin clase Personaje
