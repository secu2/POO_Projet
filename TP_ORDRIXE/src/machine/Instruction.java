package machine;

public class Instruction extends Processeur{
	String operateur;
	Operande operandes;
	public Instruction(){
		operateur = "DAT";
		operandes = new Operande();
	}

	public Instruction(String operateur, Operande operande){
		this.operateur = operateur;
		this.operandes = operande;
	}

	public String operateur(){
		return operateur;
	}

	public Operande operandes(){
		return operandes;
	}
}