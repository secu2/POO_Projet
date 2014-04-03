package machine;

public class Instruction extends Processeur{
	String operateur;
	Operandes operandes;
	public Instruction(){
		operateur = "DAT";
		operandes = new Operandes();
	}

	public Instruction(String operateur, Operandes operande){
		this.operateur = operateur;
		this.operandes = operande;
	}

	public String operateur(){
		return operateur;
	}

	public Operandes operandes(){
		return operandes;
	}
}