package autre;
public class Daty
{
	int annee;
	int mois;
	int jour;
	int heure;
	int minute;
	int seconde;

	public Daty(int a, int m, int j, int h, int min, int s)
	{
		this.annee=a;
		this.minute=m;
		this.jour=j;
		this.heure=h;
		this.minute=min;
		this.seconde=s;
	};

	public int[] getDate()
	{
		int[] date= new int[6];
		date[0]=this.annee;
		date[1]=this.mois;
		date[2]=this.jour;
		date[3]=this.heure;
		date[4]=this.minute;
		date[5]=this.seconde;
		return date;
	}
}