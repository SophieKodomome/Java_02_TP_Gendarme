package endroit;
import vivant.Olona;

public class Trano
{
	Olona[] resident;
	String quartier;
	int niveau;

	public Trano(Olona[] r,String q,int n)
	{
		this.resident=r;
		this.quartier=q;
		this.niveau=n;
	}

	public Olona[] getres()
	{
		return this.resident;
	}

	public String getcar()
	{
		return this.quartier;
	}

	public int getniv()
	{
		return this.niveau;
	}

}