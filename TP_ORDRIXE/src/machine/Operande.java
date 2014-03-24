package machine;

public class Operande {
	String typeAdressage;
	String operande;
	public Operande(){
		typeAdressage = "";
		operande = "";
	}

	public Operande(String typeAdressage, String operande){
		//TODO Controle de cohérence
		this.typeAdressage = typeAdressage;
		this.operande = operande;
	}
	
	/**
	 * Permet d'envoyer un opérande et son type d'adressage non décomposés
	 * @param Operande
	 */
	public Operande(String operande){
		//TODO Controle de cohérence
		this.typeAdressage = operande.substring(0, 1);
		this.operande = operande.substring(1);
	}
}
