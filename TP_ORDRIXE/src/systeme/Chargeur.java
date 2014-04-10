package systeme;
import java.util.Map;

import machine.Instruction;
import machine.Memoire;
import machine.Processeur;
/**
 * Permet de charger les instructions dans la mémoire
 */
public class Chargeur {
	public void Chargeur(){
		
	}
	/**
	 * Ajouter une instruction dans la mémoire
	 * @param mem mémoire à modifier
	 * @param adresse adresse d'écriture de l'instruction
	 * @param instruction instruction à écrire
	 */
	public void charger(Memoire mem, int adresse, Instruction instruction){
		//Ecriture dans la mémoire de l'instruction à l'adresse donnée
		mem.ecrire(adresse, instruction);
	}
	
	/**
	 * Permet d'ajouter plusieurs instructions dans la mémoire
	 * @param mem mémoire où charger les instructions
	 * @param instructions Map<int adresse, Instruction instruction>
	 */
	public void charger(Memoire mem, Map<Integer, Instruction> instructions){
		//Boucle d'ajout dans la mémoire
		for (Map.Entry<Integer, Instruction> iterableInstructions : instructions.entrySet()) {
			mem.ecrire(iterableInstructions.getKey(), iterableInstructions.getValue());
		}
	}
}
