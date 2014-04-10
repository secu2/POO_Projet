package grammaire.instructions;

import machine.Operandes;
import machine.adressage.Adresse;
import machine.adressage.Immediat;

/**
 * Affecte la mémoire avec sa somme au contenu d'une autre
 */
public class ADD extends Instruction{

	public ADD(Adresse op1, Adresse op2) {
		super(op1, op2);
		// TODO Auto-generated constructor stub
	}

}
