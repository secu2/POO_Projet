package machine.operateurs;


public class SLT extends Branchements{

	SLT() {
		super();
		// TODO Auto-generated constructor stub
	}

	SLT(machine.Processeur proc, machine.adressage.Adresse gauche, machine.adressage.Adresse droit){
		if(droit.adresse() != gauche.adresse()){
			proc.compteurOrdinal(proc.compteurOrdinal()+1);
		}
	}

}
