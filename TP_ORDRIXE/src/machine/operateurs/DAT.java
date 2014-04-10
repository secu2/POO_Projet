package machine.operateurs;

import machine.Instruction;

public class DAT extends Instruction{
	
	protected String data;
	
	/**
	 * Constructeur de la classe DAT
	 */
	DAT() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @return data valeur de retour 
	 */
	public String data(){
		//Retour de la String de données
		return data;
	}
	
	/**
	 *  Interrompt le processus exécuteur
	 */
	public void exec(){
		
	}

}
