package principale;
import autre.*;
import ratsy.*;
import endroit.Toby;

public class Stats
{
    int[] nbreAtk; //nbre d'attaque par jour
    int[] nbreEnd; //nbre Endaka par jour
    Intervale[] intervale;
    int mois;

    public Stats(int[] na, int[] ne, Intervale[] i,int m)
    {
        this.nbreAtk=na;
        this.nbreEnd=ne;
        this.intervale=i;
        this.mois=m;
    }

    public Intervale[] getintervale()
    {
        return this.intervale;
    }
    public int getMois()
    {
        return this.mois;
    }
    public int[] getnbreAtk()
    {
        return this.nbreAtk;
    }

}