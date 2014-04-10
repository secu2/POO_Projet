package machine.operateurs;

import machine.Instruction;
import machine.adressage.Adresse;
import machine.adressage.Immediat;


public class DJN extends Branchements{

	/**
	 * Constructeur de la classe DJN
	 */
	DJN() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Modifie le compteur ordinal du processus courant conditionnellement si l'argument B est nul suite à la modification.
	 * @param proc processeur de la machine
	 * @param gauche opérande gauche
	 * @param droit opérande droit
	 */
	public DJN(machine.Processeur proc, machine.adressage.Adresse gauche, machine.adressage.Adresse droit){
		//Si opérande  droite est nul suite à la modification
		if(droit.adresse()-1 == 0){		
			//Modification du compteur ordinal
			proc.compteurOrdinal(gauche.adresse());
		}
	}

}
