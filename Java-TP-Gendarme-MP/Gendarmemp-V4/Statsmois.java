package principale;
import autre.*;
import endroit.Toby;
import principale.*;
public class Statsmois
{
	Stats[] statsparjour;
    public Statsmois(Stats [] s)
    {
        this.statsparjour=s;
    }
    public int searchAtk(Toby rapport,int jour,int mois, int intervaleur)
    {
        int attaque=0;
        Intervale[] intervale= new Intervale[12];
        for (int j=0;j<12;j++ ) 
        {
            intervale[j]= new Intervale();
        }
        for (int i=0; i<rapport.getAtk().length;i++ )
        {
            if(rapport.getAtk()[i].getDate().getJour()==jour 
                && rapport.getAtk()[i].getDate().getMois()==mois)
            {
                if(rapport.getAtk()[i].getDate().getHeure()>=intervale[intervaleur].getdebut(intervaleur) 
                    && rapport.getAtk()[i].getDate().getHeure()<intervale[intervaleur].getfin(intervaleur))
                {
                    attaque ++;                 
                }
                else
                {
                    attaque=0;
                }
            }
        }
        return attaque;
    }

	public Stats[] searchstats(Daty date,Toby rapport)
    {

        int mois=date.setnbredejour(date.getMois());
        int jouractuel;
        Stats[] crimeparjour= new Stats[mois];
        int[] nbreAtk= new int[12];
        int[] nbreEnd= new int[12];
        Intervale[] lapseJour= new Intervale[12];
        for (int i=0;i<12 ;i++ ) 
        {
            lapseJour[i]=new Intervale();
        }
        for (int i=0;i<crimeparjour.length ;i++ ) 
        {
            crimeparjour[i]=new Stats(nbreAtk,nbreEnd,lapseJour,date.getMois());  
        }
        for(int jour=0;jour<mois;jour++)
        {
            for(int intervale=0;intervale<12;intervale++)
            {   

            }
        } 
        for(int jour=0;jour<mois;jour++)//loop d'un mois
        {
            for(int intervale=0;intervale<12;intervale++) //loop d'une journee
            {
                
                crimeparjour[jour].nbreAtk[intervale]=searchAtk(rapport,jour+1,date.getMois(),intervale);
                if(crimeparjour[jour].nbreAtk[intervale]!=0)
                {
                    jouractuel=jour+1;
                    System.out.println(jour);
                    System.out.println("Le"+jouractuel+"/"+date.getMois());
                    System.out.println("entre "+crimeparjour[jour].intervale[intervale].getdebut(intervale)+
                    " > "+crimeparjour[jour].intervale[intervale].getfin(intervale));
                    System.out.println("nbreAtk:"+crimeparjour[jour].nbreAtk[intervale]);
                    System.out.println("");
                }
            }
        }
        for(int jour=0;jour<mois;jour++)//loop d'un mois
        {
            for(int intervale=0;intervale<12;intervale++) //loop d'une journee
            {
                if(crimeparjour[jour].nbreAtk[intervale]!=0)
                {
                    jouractuel=jour+1;
                    System.out.println(jour);
                    System.out.println("Le"+jouractuel+"/"+date.getMois());
                    System.out.println("entre "+crimeparjour[jour].intervale[intervale].getdebut(intervale)+
                    " > "+crimeparjour[jour].intervale[intervale].getfin(intervale));
                    System.out.println("nbreAtk:"+crimeparjour[jour].nbreAtk[intervale]);
                    System.out.println("");
                }
            }
        }
        return crimeparjour;
    }

    public void printstats()
    {   
        int jouractuel;
        int mois=this.statsparjour.length;
        for (int jour=0;jour<mois ;jour++ ) 
        {
            for(int intervale=0;intervale<=11;intervale++) //loop d'une journee
            {
                    jouractuel=jour+1;
                    System.out.println("Le"+jouractuel+"/"+this.getStats()[jour].getMois());
                    System.out.println("entre "+this.getStats()[jour].getintervale()[intervale].getdebut(intervale)+
                    " > "+this.getStats()[jour].getintervale()[intervale].getfin(intervale));
                    System.out.println("nbreAtk:"+ this.getStats()[jour].getnbreAtk()[intervale]);
                    System.out.println("");
            }                
        }

    }
    public Stats[] getStats()
    {
    	return this.statsparjour;
    }
}