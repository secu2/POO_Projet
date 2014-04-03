package machine;

import machine.adressage.Adresse;

public class Instruction extends Processeur{
	String operateur;
	Operandes operandes;
	public Instruction(){
		operateur = "DAT";
		operandes = new Operandes();
	}

	public Instruction(String operateur, Operandes operandes){
		this.operateur = operateur;
		this.operandes = operandes;
	}
	
	public Instruction(Instruction instruction, Operandes operandes){
		operandes = new Operandes(operandes);
		operateur = instruction.operateur();
	}

	public String operateur(){
		return operateur;
	}

	public Operandes operandes(){
		return operandes;
	}
}