package ratsy;

import vivant.Olona;
import autre.Daty;

public class Endaka {
	public Olona[] aggresseur;
	Olona[] victime;
	Daty date;
	String quartier;
	double very;

	// constructor
	public Endaka(Olona[] a, Olona[] v, Daty d, String q, double very) {
		this.aggresseur = a;
		this.victime = v;
		this.date = d;
		this.quartier = q;
		this.very = very;
	}

	public Olona[] getagress() 
	{
		return this.aggresseur;
	}

	public Olona[] getvictime() 
	{
		return this.victime;
	}

	public Daty getDate()
	{
		return this.date;
	}

	public String quartier()
	{
		return this.quartier;
	}

	public double getvery()
	{
		return this.very;
	}
}
