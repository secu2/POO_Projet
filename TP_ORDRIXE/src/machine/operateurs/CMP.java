package machine.operateurs;


public class CMP extends Branchements{

	CMP() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	CMP(machine.Processeur proc, machine.adressage.Adresse gauche, machine.adressage.Adresse droit){
		if(droit.adresse() == gauche.adresse()){
			proc.compteurOrdinal(proc.compteurOrdinal()+1);
		}
	}

}
