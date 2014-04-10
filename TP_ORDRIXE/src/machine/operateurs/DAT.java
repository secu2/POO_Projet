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
		return data;
	}
	
	/**
	 *  Interrompt le processus exécuteur
	 */
	public void exec(){
		
	}

}
