package machine.operateurs;

import machine.Instruction;
import machine.adressage.Adresse;
import machine.adressage.Immediat;


public class JMP extends Branchements{

	JMP() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public JMP(machine.Processeur proc, Adresse gauche){
		proc.compteurOrdinal(gauche.adresse());
	}

}
