package principale;
import autre.*;
import endroit.Toby;
import principale.*;
public class Statsmois
{
	Stats[] statsparjour;

    public void searchAtk(Toby rapport,int jour,int mois, int intervaleur)
    {
        int attaque=0;
        Intervale[] intervale= new Intervale[intervaleur];
        for (int i=0; i<=rapport.getAtk().length;i++ )
        {    
            if(rapport.getAtk()[i].getDate().getJour()==jour+1 
                && rapport.getAtk()[i].getDate().getMois()==mois)
            {
                if(rapport.getAtk()[i].getDate().getHeure()>=intervale[intervaleur].getdebut(intervaleur) 
                    && rapport.getAtk()[i].getDate().getHeure()<=intervale[intervaleur].getfin(intervaleur))
                {
                    //attaque ++;
                    System.out.println("attaque");
                }    
            }
            else
            {
                //attaque=0;
                System.out.println("pas attaque");
            }
        }
        //return attaque;
    }

	public Stats[] searchstats(Daty date,Toby rapport)
    {
        int mois=date.setnbredejour(date.getMois());
        Stats[] crimeparjour= new Stats[mois];
        for(int jour=0;jour<mois;jour++)//loop d'un mois
        {
            for(int intervale=0;intervale<=11;intervale++) //loop d'une journee
            {
                /*crimeparjour[jour].nbreAtk[intervale]=*/searchAtk(rapport,jour,mois,intervale);
                //crimeparjour[i].nbreEnd[j]=searchEnd(rapport,i,j);
            }
            System.out.println("");
        }
        return crimeparjour;
    }

    public Stats[] getStats()
    {
    	return this.statsparjour;
    }
}