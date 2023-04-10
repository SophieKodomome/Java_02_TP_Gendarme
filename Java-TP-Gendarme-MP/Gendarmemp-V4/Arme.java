package autre;

public class Arme {
	String nom;
	int puissance;

	public Arme(String n,int p) {
		this.nom = n;
		this.puissance = p;
	}

	public String getArme() {
		return this.nom;
	}

	public int getpuissance() {
		return this.puissance;
	}
}