package machine.adressage;

import machine.Memoire;

public class RelatifIndirect extends Adresse {
	public RelatifIndirect(Memoire memoire, int adresse, int offset){
		this.adresse = memoire.lire(adresse+offset).operandeDroit();
	}
}
