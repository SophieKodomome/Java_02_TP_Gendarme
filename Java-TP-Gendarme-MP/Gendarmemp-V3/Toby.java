package endroit;
import vivant.Gendarme;
import autre.Ronde;
import ratsy.Endaka;
import ratsy.Attaque;

 
public class Toby
{
	Gendarme[] gendarme;
	Attaque[] attaque;
	Endaka[] endaka;
	Ronde[] ronde;	


	public Toby(Gendarme[] g, Attaque[] a, Endaka[] e, Ronde[] r)
	{
		this.gendarme=g;
		this.attaque=a;
		this.endaka=e;
		this.ronde=r;
	} 

	public Gendarme[] getGen()
	{
		return this.gendarme;
	}

	public Attaque[] getAtk()
	{
		return this.attaque;
	}

	public Endaka[] getEnd()
	{
		return this.endaka;
	}

	public Ronde[] getRonde()
	{
		return this.ronde;
	}
}