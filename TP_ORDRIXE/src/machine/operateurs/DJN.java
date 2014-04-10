package machine.operateurs;

import machine.Instruction;
import machine.adressage.Adresse;
import machine.adressage.Immediat;


public class DJN extends Branchements{

	DJN() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DJN(machine.Processeur proc, machine.adressage.Adresse gauche, machine.adressage.Adresse droit){
		if(droit.adresse() -1 == 0){		
			proc.compteurOrdinal(gauche.adresse());
		}
	}

}
