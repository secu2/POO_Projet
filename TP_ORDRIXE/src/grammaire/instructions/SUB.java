package grammaire.instructions;

import machine.adressage.Adresse;
import machine.adressage.Immediat;

/**
 * Affecte la mémoire avec sa différence au contenu d'une autre
 */
public class SUB extends Instruction{

	public SUB(Adresse op1, Adresse op2) {
		super(op1, op2);
		// TODO Auto-generated constructor stub
	}

}
