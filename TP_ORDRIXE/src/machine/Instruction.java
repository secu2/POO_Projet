package machine;

public class Instruction {
	//Test 2
	String operateur;
	Operande operandeGauche;
	Operande operandeDroit;
	public Instruction(){
		operateur = "DAT";
		operandeGauche = new Operande();
		operandeDroit = new Operande();
	}
}
