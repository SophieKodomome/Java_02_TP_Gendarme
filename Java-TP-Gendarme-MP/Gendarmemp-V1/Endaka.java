package ratsy;
import vivant.Olona;
import autre.Daty;

public class Endaka
{
	public Olona[] aggresseur;
	Olona[] victime;
	Daty date;
	String quartier;
	double very;

	//constructor
	public Endaka(Olona[] a,Olona[] v,Daty d, String q, double very)
	{
		this.aggresseur=a;
		this.victime=v;
		this.date=d;
		this.quartier=q;
		this.very=very;
	}
}
