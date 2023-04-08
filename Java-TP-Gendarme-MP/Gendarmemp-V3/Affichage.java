package principale;

import vivant.*;
import ratsy.*;
import endroit.*;
import autre.*;
import principale.*;

public class Affichage {
	public static void main(String[] args) {
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
		arme1[0]= new Arme("arme 1",3);
		Arme[] arme2=new Arme[1];
		arme2[0]= new Arme("arme 2",1);

		Olona soldat1=new Olona("Jean Doe",45,'m');
		Olona soldat2=new Olona("Jean Doe 2",32,'m');
		Gendarme[] listeGen= new Gendarme[2];
		listeGen[0]=new Gendarme(soldat1,1,arme1);
		listeGen[1]=new Gendarme(soldat2,2,arme2);

		Daty date1 = new Daty(2023, 2, 4, 14, 13, 54);
		Olona[] resident = new Olona[2];
		resident[0] = new Olona("Koto", 34, 'm');
		resident[1] = new Olona("Toko", 30, 'm');
		Trano maison1 = new Trano(resident, "Andohoranofotsy", 3);
		Olona[] agresseur = new Olona[2];
		agresseur[0] = new Olona("Individu 1", 23, 'm');
		agresseur[1] = new Olona("Individu 2", 21, 'f');
		Attaque[] listeAtk= new Attaque[2];
		listeAtk[0]= new Attaque(maison1, date1, agresseur, 3, true);

		Endaka[] listeEnd= new Endaka[2];
		Ronde[] listeRonde= new Ronde[2];

		Toby tobytest= new Toby(listeGen,listeAtk,listeEnd,listeRonde);
		
		Statsmois statistique= new Statsmois();
		Daty datetest= new Daty(2023, 2, 12, 23, 38, 30);
		statistique.searchstats(datetest,tobytest);

		/*for (int i=0; i<statistique.statsparjour.length; i++ ) 
		{
			System.out.println(statistique.getStats());	
		}*/
	}
}
