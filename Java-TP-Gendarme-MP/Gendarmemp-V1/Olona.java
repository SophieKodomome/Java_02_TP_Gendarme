package vivant;
import ratsy.Endaka;
import autre.*;
public class Olona
{
	String nom;
	int age;
	char sexe;

	//constructor
	public Olona(String n, int a, char s)
	{
		this.nom=n;
		this.age=a;
		this.sexe=s;
	}

	public Olona getmpanendaka()
	{
		Olona mpanendaka= new Olona("Mek Violent",25,'m');
		mpanendaka=this.aggresseur[0];
		return mpanendaka;
	}

	public String getnom()
	{
		String nom;
		nom=this.nom;
		return nom;
	}
	public void help(Endaka e, Ronde r)
	{
		Olona mpanendaka= new Olona("Mek Violent",25,'m');
		e.getmpanendaka();
		System.out.println("Miantso Vonjeo"+ this.nom);
		/*System.out.println("Mitsoaka ny mpanendaka"+ e.getmpanendaka().getnom());*/
		/*System.out.println("Naheno anle antso"+ r.getpersonne().getnom());*/
	}
}
