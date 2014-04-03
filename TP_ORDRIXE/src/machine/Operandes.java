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
	
	public Operandes(Operandes operandes){
		this.operandes[0] = operandes.operandeGauche();
		this.operandes[1] = operandes.operandeDroit();
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
	
	public void operandeGauche(Adresse gauche){
		operandes[0] = gauche;
	}
	
	public void operandeDroit(Adresse droit){
		operandes[1] = droit;
	}
}
