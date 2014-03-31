package machine;

import machine.adressage.Adresse;

public class Operande {
	Adresse operande;
	public Operande(){
		operande = new  {
		};
	}

	public Operande(String typeAdressage, int operande){
		//TODO Controle de cohérence
		this.typeAdressage = typeAdressage;
		this.operande = operande;
	}
	
	public int operande(){
		return operande;
	}
	
	public String typeAdressage(){
		return typeAdressage;
	}
}
