package machine;

public class Processeur {
	Memoire memoire;
	int compteurOrdinal;
	
	public Processeur(){
		memoire = new Memoire();
	}
	
	public int compteurOrdinal(){
		return compteurOrdinal;
	}
	
	public void compteurOrdinal(int compteurOrdinal){
		this.compteurOrdinal = compteurOrdinal;
	}
	
	public Memoire memoire(){
		return memoire;
	}
	
	public void Memoire(Memoire memoire){
		this.memoire = memoire;
	}
	
	
}
