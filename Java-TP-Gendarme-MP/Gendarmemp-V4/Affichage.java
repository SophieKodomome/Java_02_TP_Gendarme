package principale;

import vivant.*;
import ratsy.*;
import endroit.*;
import autre.*;
import principale.*;

public class Affichage 
{
	public static void main(String[] args) 
	{
		// test data
		/*Olona[] resident = new Olona[2];
		resident[0] = new Olona("Koto", 34, 'm');
		resident[1] = new Olona("Toko", 30, 'm');

		Olona[] agresseur = new Olona[2];
		agresseur[0] = new Olona("Gajo Veneer", 23, 'm');
		agresseur[1] = new Olona("Mek Violent", 25, 'm');

		Daty date = new Daty(2023, 4, 4, 14, 13, 54);
		Trano trano = new Trano(resident, "Andohoranofotsy", 3);
		Attaque atk = new Attaque(trano, date, agresseur, 3, true);*/
		Arme[] arme1=new Arme[1];
		Arme[] arme2=new Arme[1];

		Gendarme[] listeGen= new Gendarme[2];

		Daty date1 = new Daty(2023, 3, 30, 3, 13, 54);
		Daty date2 = new Daty(2023, 3, 28, 10, 13, 54);
		Daty date3 = new Daty(2023, 3, 29, 1, 13, 54);
		Olona[] resident = new Olona[2];
		Trano maison1 = new Trano(resident, "Andohoranofotsy", 3);
		Olona[] agresseur = new Olona[2];
		Attaque[] listeAtk= new Attaque[3];
		listeAtk[0]= new Attaque(maison1, date1, agresseur, 3, true);
		listeAtk[1]= new Attaque(maison1, date2, agresseur, 3, true);
		listeAtk[2]= new Attaque(maison1, date3, agresseur, 3, true);

		Endaka[] listeEnd= new Endaka[2];
		Ronde[] listeRonde= new Ronde[2];

		Toby tobytest= new Toby(listeGen,listeAtk,listeEnd,listeRonde);
		
		Daty datetest= new Daty(2023, 3, 3, 23, 38, 30);

		//set variable Statsmois
		Stats[] statsparjour= new Stats[datetest.setnbredejour(datetest.getMois())];
		Statsmois statistique= new Statsmois(statsparjour);
		
		//main function
		statistique.statsparjour=statistique.searchstats(datetest,tobytest);
		//output
		//statistique.printstats();
			
	}
}
