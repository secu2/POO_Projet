package machine;

import machine.adressage.Adresse;
/**
 *	Instruction
 */
public class Instruction extends Processeur{
	String operateur;
	Operandes operandes;
	/**
	 * Constructeur d'instruction par défaut
	 */
	public Instruction(){
		operateur = "DAT";
		operandes = new Operandes();
	}
	
	/**
	 * Constructiton d'une instruction complète
	 * @param operateur
	 * @param operandes
	 */
	public Instruction(String operateur, Operandes operandes){
		this.operateur = operateur;
		this.operandes = operandes;
	}
	
	/**
	 * Construction d'une instruction à partir d'une instruction déjà éxistante (Seul l'opérateur est gardé)
	 * @param instruction
	 * @param operandes
	 */
	public Instruction(Instruction instruction, Operandes operandes){
		operandes = new Operandes(operandes);
		operateur = instruction.operateur();
	}

	/**
	 * Permet de récupérer l'opérateur de l'instruction
	 * @return l'opérateur de l'instruction
	 */
	public String operateur(){
		return operateur;
	}

	/**
	 * Permet de récupérer les opérandes de l'instruction
	 * @return les opérandes de l'instruction
	 */
	public Operandes operandes(){
		return operandes;
	}
}