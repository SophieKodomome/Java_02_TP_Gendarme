package autre;
public class Intervale
{
	int debut;
	int fin;

	public int getdebut(int indicedebut)
	{
		int[] heuredebut= new int[12];
			heuredebut[0]=0;
			heuredebut[1]=2;
			heuredebut[2]=4;
			heuredebut[3]=6;
			heuredebut[4]=8;
			heuredebut[5]=10;
			heuredebut[6]=12;
			heuredebut[7]=14;
			heuredebut[8]=16;
			heuredebut[9]=18;
			heuredebut[10]=20;
			heuredebut[11]=22;

			return heuredebut[indicedebut];
	}

	public int getfin(int indicefin)
	{
		int[] heurefin= new int[12];
			heurefin[0]=2;
			heurefin[1]=4;
			heurefin[2]=6;
			heurefin[3]=8;
			heurefin[4]=10;
			heurefin[5]=12;
			heurefin[6]=14;
			heurefin[7]=16;
			heurefin[8]=18;
			heurefin[9]=20;
			heurefin[10]=22;
			heurefin[11]=24;

			return heurefin[indicefin];
	}
}