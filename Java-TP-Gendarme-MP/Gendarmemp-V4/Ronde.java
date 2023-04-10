package autre;
import vivant.Gendarme;
public class Ronde
{
	Daty date;
	Gendarme[] gendarme;
	String quartier;

	//constructor
	public Ronde(Daty d, Gendarme[] g, String q)
	{
		this.date=d;
		this.gendarme=g;
		this.quartier=q;
	}

	public Daty getdate()
	{
		return this.date;
	}

	public Gendarme[] getgen()
	{
		return this.gendarme;
	}

	public String getQuartier()
	{
		return this.quartier;
	}
}
