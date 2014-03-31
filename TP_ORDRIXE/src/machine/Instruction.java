package machine;

public class Instruction {
	String operateur;
	Operande operandeGauche;
	Operande operandeDroit;
	public Instruction(){
		operateur = "DAT";
		operandeGauche = new Operande();
		operandeDroit = new Operande();
	}

	public Instruction(String operateur, Operande operande){
		this.operateur = operateur;
		//this.operandeGauche = new Operande(typeAdressage, operande);
	}
	
	public int operandeDroit(){
		return operandeDroit.operande;
	}
	
	public int operandeGauche(){
		return operandeGauche.operande;
	}
}
