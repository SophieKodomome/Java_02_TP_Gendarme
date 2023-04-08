package autre;

public class Daty {
	int annee;
	int mois;
	int jour;
	int heure;
	int minute;
	int seconde;

	public Daty(int a, int m, int j, int h, int min, int s) {
		this.annee = a;
		this.mois = m;
		this.jour = j;
		this.heure = h;
		this.minute = min;
		this.seconde = s;
	};

	public int getAnnee()
	{
		return this.annee;
	}
	public int getMois()
	{
		return this.mois;
	}
	public int getJour()
	{
		return this.jour;
	}
	public int getHeure()
	{
		return this.heure;
	}
	public int getMinute()
	{
		return this.minute;
	}
	public int getSeconde()
	{
		return this.seconde;
	}

    public int setnbredejour(int indicemois)
    {
        indicemois--;
        int[] mois= new int[12];
        mois[0]=31;
        mois[1]=28;
        mois[2]=31;
        mois[3]=30;
        mois[4]=31;
        mois[5]=30;
        mois[6]=31;
        mois[7]=31;
        mois[8]=30;
        mois[9]=31;
        mois[10]=30;
        mois[11]=31;

        return mois[indicemois];
    }
}