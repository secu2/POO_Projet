package machine;

import machine.adressage.Adresse;
import machine.adressage.Immediat;
/**
 * Les opérandes constituant une instruction
 */
public class Operandes {
	protected Adresse[] operandes; //Les opérandes (adresses)
	/**
	 * Contruction d'opérandes par défaut avec les deux adresses à 0
	 */
	public Operandes(){
		operandes[0] = new Immediat(0); //Operande gauche
		operandes[1] = new Immediat(0); //Operande droit
	}

	/**
	 * Contruction d'opérandes avec les deux adresses
	 * @param operandeGauche La première adresse
	 * @param operandeDroit La seconde adresse
	 */
	public Operandes(Adresse operandeGauche, Adresse operandeDroit){
		this.operandes[0] = operandeGauche;
		this.operandes[1] = operandeDroit;
	}
	
	/**
	 * Construction à partir d'opérandes déjà éxistantes
	 * @param operandes
	 */
	public Operandes(Operandes operandes){
		this.operandes[0] = operandes.operandeGauche();
		this.operandes[1] = operandes.operandeDroit();
	}
	
	/**
	 * Permet de récupérer les opérandes sous forme de tableau
	 * @return un tableau d'adresses à deux cases ([0]=opérande gauche, [1]=opérande droit)
	 */
	public Adresse[] operande(){
		return operandes;
	}
	
	/**
	 * Permet de récupérer l'adresse de l'opérande gauche
	 * @return l'adresse de l'opérande gauche
	 */
	public Adresse operandeGauche(){
		return operandes[0];
	}

	/**
	 * Permet de récupérer l'adresse de l'opérande droit
	 * @return l'adresse de l'opérande droit
	 */
	public Adresse operandeDroit(){
		return operandes[1];
	}
	
	/**
	 * Permet de modifier l'opérande gauche
	 * @param gauche l'opérande gauche à modifier
	 */
	public void operandeGauche(Adresse gauche){
		operandes[0] = gauche;
	}
	
	/**
	 * Permet de modifier l'opérande droit
	 * @param droit l'opérande droit à modifier
	 */
	public void operandeDroit(Adresse droit){
		operandes[1] = droit;
	}
}
