package ratsy;

import autre.Daty;
import endroit.Trano;
import vivant.Olona;

public class Attaque {
	Trano trano;
	Daty date;
	Olona[] aggresseur;
	int niveau;
	boolean estarme;

	// constructor
	public Attaque(Trano t, Daty d, Olona[] a, int n, boolean e) {
		this.trano = t;
		this.date = d;
		this.aggresseur = a;
		this.niveau = n;
		this.estarme = e;
	}

	public Trano getTrano() {
		return this.trano;
	}

	public Daty getDate() {
		return this.date;
	}

	public Olona[] getOlona() {
		return this.aggresseur;
	}

	public int getNiveau() {
		return this.niveau;
	}

	public boolean getEstArme() {
		return this.estarme;
	}
}