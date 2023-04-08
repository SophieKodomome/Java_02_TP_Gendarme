package affiche;
import times.Date;
import ratsy.*;
import lieu.*;
import vivant.*;

public class Affichage 
{
 public static void main(String[] args)
 {
  Olona[] mpangalatra=new Olona[5];
  Olona[] proprio=new Olona[3];
  proprio[0]=new Olona("Ranaivolahy","Anne",40);
  proprio[1]=new Olona("Ranaivolahy","Koto",50);
  proprio[2]=new Olona("Ranaivolahy","Ivan",13);
  mpangalatra[0]=new Olona("Ravelojaona","Rivo",20);
  mpangalatra[1]=new Olona("inconnu","inconnu",25);
  mpangalatra[2]=new Olona("inconnu","inconnu",19);
  mpangalatra[3]=new Olona("Ravelojaona","Mino",23);
  mpangalatra[4]=new Olona("Ranaivojaona","Ellis",24); 
  Trano tafihana=new Trano(proprio,2,"Ankadikely");  
  Date debut=new Date(2022,2,29,29,19,20);
  Attack deux=new Attack(tafihana,debut,mpangalatra,60000,3,true);

  Olona[] voleur1=new Olona[4];
  Olona[] tompoTrano1=new Olona[2];
  tompoTrano1[0]=new Olona("Rakotonatsipy","Parson",40);
  tompoTrano1[1]=new Olona("Rakotonatsipy","Bells",50);
  voleur1[0]=new Olona("Ravelojaona","Rivo",20);
  voleur1[1]=new Olona("inconnu","inconnu",25);
  voleur1[2]=new Olona("inconnu","inconnu",19);
  voleur1[3]=new Olona("Ravelojaona","Franck",23); 
  Trano tafihana2=new Trano(tompoTrano1,1,"sab-nam");  
  Date second=new Date(2022,3,25,5,26,20);
  Attack test1=new Attack(tafihana2,second,voleur1,20000,2,false);

  Olona[] voleur2=new Olona[4];
  Olona[] tompoTrano2=new Olona[2];
  tompoTrano2[0]=new Olona("Rafaribozaka","Parson",40);
  tompoTrano2[1]=new Olona("Rafaribozaka","Bells",50);
  voleur2[0]=new Olona("Rakotomafana","jean Glace",25);
  voleur2[1]=new Olona("inconnu","inconnu",25);
  voleur2[2]=new Olona("inconnu","inconnu",19);
  voleur2[3]=new Olona("Ravelojaona","Rivo",23); 
  Trano tafihana3=new Trano(tompoTrano2,7,"sab-nam");  
  Date trois=new Date(2022,3,25,5,26,20);
  Attack test2=new Attack(tafihana3,second,voleur2,20000,2,false);

  Olona[] voleur3=new Olona[4];
  Olona[] tompoTrano3=new Olona[2];
  tompoTrano3[0]=new Olona("Rakotonatsipy","Parson",40);
  tompoTrano3[1]=new Olona("Rakotonatsipy","Bells",50);
  voleur3[0]=new Olona("Ravelojaona","Rivo",20);
  voleur3[1]=new Olona("inconnu","inconnu",25);
  voleur3[2]=new Olona("inconnu","inconnu",19);
  voleur3[3]=new Olona("Ravelojaona","Rivo",23); 
  Trano tafihana4=new Trano(tompoTrano3,1,"sab-nam");  
  Date four=new Date(2022,3,25,5,26,20);
  Attack test3=new Attack(tafihana4,second,voleur3,20000,2,false);

  Olona[] voleur4=new Olona[4];
  Olona[] tompoTrano4=new Olona[2];
  tompoTrano4[0]=new Olona("Rakotonatsipy","Parson",40);
  tompoTrano4[1]=new Olona("Rakotonatsipy","Bells",50);
  voleur4[0]=new Olona("Ravelojaona","Rivo",20);
  voleur4[1]=new Olona("inconnu","inconnu",25);
  voleur4[2]=new Olona("inconnu","inconnu",19);
  voleur4[3]=new Olona("Ravelojaona","Rivo",23); 
  Trano tafihana5=new Trano(tompoTrano4,1,"sab-nam");  
  Date five=new Date(2022,3,25,5,26,20);
  Attack test4=new Attack(tafihana5,second,voleur4,20000,2,false);

  Olona[] voleur5=new Olona[4];
  Olona[] tompoTrano5=new Olona[2];
  tompoTrano5[0]=new Olona("Rakotonatsipy","Parson",40);
  tompoTrano5[1]=new Olona("Rakotonatsipy","Bells",50);
  voleur5[0]=new Olona("Ravelojaona","Rivo",20);
  voleur5[1]=new Olona("inconnu","inconnu",25);
  voleur5[2]=new Olona("inconnu","inconnu",19);
  voleur5[3]=new Olona("Ravelojaona","Rivo",23); 
  Trano tafihana6=new Trano(tompoTrano5,1,"sab-nam");  
  Date six=new Date(2022,3,25,5,26,20);
  Attack test5=new Attack(tafihana6,second,voleur5,20000,2,false);

  Olona[] voleur6=new Olona[4];
  Olona[] tompoTrano6=new Olona[2];
  tompoTrano6[0]=new Olona("Rakotonatsipy","Parson",40);
  tompoTrano6[1]=new Olona("Rakotonatsipy","Bells",50);
  voleur6[0]=new Olona("Ravelojaona","Rivo",20);
  voleur6[1]=new Olona("inconnu","inconnu",25);
  voleur6[2]=new Olona("inconnu","inconnu",19);
  voleur6[3]=new Olona("Ravelojaona","Rivo",23); 
  Trano tafihana7=new Trano(tompoTrano6,1,"sab-nam");  
  Date sept=new Date(2022,3,25,5,26,20);
  Attack test6=new Attack(tafihana7,second,voleur6,20000,2,false);

  Toby gendarme=new Toby();
  gendarme.assaut=new Attack[7];
  gendarme.assaut[0].setAttack(deux);
  gendarme.assaut[1].setAttack(test1);
  gendarme.assaut[2].setAttack(test2);
  gendarme.assaut[3].setAttack(test3);
  gendarme.assaut[4].setAttack(test4); 
 }     
}