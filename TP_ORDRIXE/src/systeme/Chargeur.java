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
	 * @param mem la mémoire à modifier
	 * @param adresse
	 * @param instruction
	 */
	public void charger(Memoire mem, int adresse, Instruction instruction){
		mem.ecrire(adresse, instruction);
	}
	/**
	 * Permet d'ajouter plusieurs instructions dans la mémoire
	 * @param mem La mémoire ou charger les instructions
	 * @param instructions Map<int adresse, Instruction instruction>
	 */
	public void charger(Memoire mem, Map<Integer, Instruction> instructions){
		for (Map.Entry<Integer, Instruction> iterableInstructions : instructions.entrySet()) {
			mem.ecrire(iterableInstructions.getKey(), iterableInstructions.getValue());
		}
	}
}
