package vivant;
import autre.Arme;
public class Gendarme
{
	Olona personne;
	int grade;
	Arme[] bassy;

	//constructor
	Gendarme(Olona p,int g, Arme[] b)
	{
		this.personne=p;
		this.grade=g;
		this.bassy=b;
	}
	
}
