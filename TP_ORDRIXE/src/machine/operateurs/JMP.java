package machine.operateurs;

import machine.Instruction;
import machine.adressage.Adresse;
import machine.adressage.Immediat;


public class JMP extends Branchements{

	/**
	 * Constructeur de la classe JMP
	 */
	JMP() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Modifie le compteur ordinal du processus courant
	 * @param proc processeur de la machine
	 * @param gauche opérande gauche
	 */
	public JMP(machine.Processeur proc, Adresse gauche){
		//Modification du compteur ordinal
		proc.compteurOrdinal(gauche.adresse());
	}

}
