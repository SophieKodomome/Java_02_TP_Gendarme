package principale;
import endroit.Trano;
import endroit.Toby;
import autre.*;
import ratsy.*;
import vivant.*;

public class Affichage
{
	public static void main(String[] args) 
	{
		//test data
		/*Olona[] resident= new Olona[2];
		resident[0]= new Olona("Koto",34,'m');
		resident[1]= new Olona("Toko",30,'m');

		Olona[] agresseur=new Olona[2];
		victime[0]= new Olona("Gajo Veneer",23,'m');
		victime[1]= new Olona("Mek Violent",25,'m');
		
		Daty date= new Daty(2023,4,4,14,13,54);
		Trano trano= new Trano(resident,"Andohoranofotsy",3);
		Attaque atk= new Attaque(trano, date, aggresseur, 3, true);

		Stats statatk;
		statatk.getstatatk(atk);*/

		Olona[] victime= new Olona[2];
		victime[0]= new Olona("Koto",34,'m');
		victime[1]= new Olona("Toko",30,'m');
		Olona gendarme= new Olona("Jeremia",23,'m');
		Olona agresseur= new Olona("Mek Violent",25,'m');
		victime[0].help(aggresseur,gendarme);

	}
}