package vivant;
import autre.Arme;
public class Gendarme
{
	Olona soldat;
	int grade;
	Arme[] bassy;

	//constructor
	public Gendarme(Olona s,int g, Arme[] b)
	{
		this.soldat=s;
		this.grade=g;
		this.bassy=b;
	}

	public Olona getSoldat()
	{
		return this.soldat;
	}
	public int getGrade()
	{
		return this.grade;
	}
	public Arme[] getBassy()
	{
		return this.bassy;
	}
	
}
