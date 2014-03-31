package machine;

import machine.adressage.Adresse;
import machine.adressage.Immediat;

public class Operande {
	Adresse[] operande; //Les oprandes (adresses)
	String data; //Le contenu en cas de DAT
	public Operande(){
		operande[0] = new Immediat(0); //Operande gauche
		operande[1] = new Immediat(0); //Operande droit
	}
	
	public Operande(String dat){
		data = dat;
	}

	public Operande(Adresse operandeGauche, Adresse operandeDroit){
		this.operande[0] = operandeGauche;
		this.operande[1] = operandeDroit;
	}
	
	public Adresse[] operande(){
		return operande;
	}
	
	public Adresse operandeGauche(){
		return operande[0];
	}
	
	public Adresse operandeDroit(){
		return operande[1];
	}
	
	public String data(){
		return data;
	}
}
