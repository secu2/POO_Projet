package machine;

import machine.adressage.Adresse;
import machine.adressage.Immediat;

public class Operandes {
	protected Adresse[] operandes; //Les op�randes (adresses)
	public Operandes(){
		operandes[0] = new Immediat(0); //Operande gauche
		operandes[1] = new Immediat(0); //Operande droit
	}

	public Operandes(Adresse operandeGauche, Adresse operandeDroit){
		this.operandes[0] = operandeGauche;
		this.operandes[1] = operandeDroit;
	}
	
	public Adresse[] operande(){
		return operandes;
	}
	
	public Adresse operandeGauche(){
		return operandes[0];
	}
	
	public Adresse operandeDroit(){
		return operandes[1];
	}
}
