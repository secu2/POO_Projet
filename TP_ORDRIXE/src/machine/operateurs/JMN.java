package machine.operateurs;

public class JMN extends Branchements{

	JMN() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	JMN(machine.Processeur proc, machine.Memoire mem, machine.adressage.Adresse gauche, machine.adressage.Adresse droit){
		if(droit.adresse() != 0){
			proc.compteurOrdinal(gauche.adresse());
		}
	}
}
