package systeme;
import machine.Instruction;
import machine.Memoire;
import machine.Operandes;
import machine.Processeur;
import machine.adressage.*;
import systeme.Chargeur;

public class Jeu {
	public static void main(String[] args){
		//Main class
		Chargeur chargeur = new Chargeur();
		Processeur processeur = new Processeur();
		
		chargeur.charger(processeur.memoire(), 0, new Instruction());

		//chargeur.charger(processeur.memoire(), 1, new Instruction("test", new Operandes(new Immediat(12), new Immediat(13))));

		System.out.println(processeur.memoire().infosMemoire());
		//processeur.memoire().ecrire(0, new Instruction("test", new Operandes(new Immediat(12), new Immediat(13))));
		System.out.println(processeur.memoire().lire(0).operandes());
		
	}
}
