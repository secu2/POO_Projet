package machine;

public class Operande {
	String typeAdressage;
	int operande;
	public Operande(){
		typeAdressage = "";
		operande = 0;
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
