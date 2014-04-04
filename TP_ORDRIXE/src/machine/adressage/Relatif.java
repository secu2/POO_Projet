package machine.adressage;

public class Relatif extends Adresse {

	/**
	 * Permet de contruire une adresse à partir d'un adressage relatif: adresse+offset
	 * @param adresse
	 * @param offset
	 */
	public Relatif(int adresse, int offset){
		this.adresse = adresse+offset;
	}
}
