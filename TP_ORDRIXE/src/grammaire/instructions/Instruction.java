package grammaire.instructions;
import java.io.Serializable;

import machine.Operandes;
import machine.adressage.Adresse;


public abstract class Instruction implements Serializable{
	protected String etiquette;
	protected Adresse adresseGauche;
	protected Adresse adresseDroit;
	
	public Instruction(String etiquette, Adresse droit, Adresse gauche){
		this.etiquette = etiquette;
		adresseDroit = droit;
		adresseGauche = gauche;
	}
	
	public Instruction(Adresse droit, Adresse gauche){
		this.etiquette = etiquette;
		adresseDroit = droit;
		adresseGauche = gauche;
	}
	
	public Instruction(Adresse gauche){
		adresseGauche = gauche;
	}
	
	public Adresse opGauche(){
		return adresseGauche;
	}
	
	public Adresse opDroit(){
		return adresseDroit;
	}
}
