package machine.operateurs;

import machine.Instruction;
import machine.adressage.Adresse;
import machine.adressage.Immediat;


public class MOD extends Operation{

	/**
	 * Constructeur de la classe MOD
	 */
	MOD() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Affecte une mémoire avec son modulo au contenu d'une autre
	 * @param mem mémoire du jeu
	 * @param gauche opérande gauche
	 * @param droit opérande droit
	 */
	public void exec(machine.Memoire mem, Adresse gauche, Adresse droit){
		//Instruction originale, à modifier
		Instruction instructionAModifier = mem.lire(droit.adresse());
		
		//Les deux nouveau opérateurs
		int nouvelleOperandeGauche = mem.lire(droit.adresse()).operandes().operandeGauche().adresse()
				%mem.lire(gauche.adresse()).operandes().operandeGauche().adresse();
		int nouvelleOperandeDroit = mem.lire(droit.adresse()).operandes().operandeDroit().adresse()
				%mem.lire(gauche.adresse()).operandes().operandeDroit().adresse();
		
		//Modification de l'instruction originale
		instructionAModifier.operandes().operandeDroit(new Immediat(nouvelleOperandeDroit));
		instructionAModifier.operandes().operandeGauche(new Immediat(nouvelleOperandeGauche));
		
		//Enregistrement dans la mémoire
		mem.ecrire(droit.adresse(), instructionAModifier);
	}

}
