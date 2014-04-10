package machine.operateurs;


public class JMZ extends Branchements{

	JMZ() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	JMZ(machine.Processeur proc, machine.Memoire mem, machine.adressage.Adresse gauche, machine.adressage.Adresse droit){
		if(droit.adresse() == 0){
			proc.compteurOrdinal(gauche.adresse());
		}
	}

}
