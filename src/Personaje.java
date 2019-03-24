import java.util.Random;
import java.util.Scanner;

public class Personaje {
	//Atributos
	Scanner entrada = new Scanner(System.in);
	String nombre_personaje = entrada.next("Nombre del jugador: ");
	int vida_personaje = 100;
	int tipo_ataque = 1;
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
			potencia_ataque = potencia_ataque*dados;
			tipo_ataque = 1;
		}
		else if (dados >=75 && dados <=100) { 
			potencia_ataque = potencia_ataque*dados;
			tipo_ataque = 3;
		}
		
		int[] ataque = {tipo_ataque, potencia_ataque};	
		return ataque;
	} // Fin método definir_ataque()
	
	public void estado() {
		char relleno1 = '#';
		System.out.println('['+nombre_personaje.toUpperCase()+']');
		System.out.println("ENERGÍA: "+'['+relleno1*(Math.round(vida_personaje/10))+"] "+ vida_personaje);
	} // Fin método estado()
	
} // Fin clase Personaje
