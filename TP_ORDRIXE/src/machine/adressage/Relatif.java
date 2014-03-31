package machine.adressage;

public class Relatif extends Adresse {

	public Relatif(int adresse, int offset){
		this.adresse = adresse+offset;
	}
}
