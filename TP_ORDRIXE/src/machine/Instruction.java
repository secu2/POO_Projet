package machine;

public class Instruction {
	//Test
	String operateur;
	Operande operandeGauche;
	Operande operandeDroit;
	public Instruction(){
		operateur = "DAT";
		operandeGauche = new Operande();
		operandeDroit = new Operande();
	}
}
