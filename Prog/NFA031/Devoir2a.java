public class Devoir2a
{public static void main ( String [ ] args )
 {int CAT;
double PRIX, PrixR, RABAIS;
char CHOIX;
PrixR=0;

  System.out.println();
  System.out.println("Progamme de calcul des soldes par categorie d'articles");

  System.out.println();
do{
  System.out.print("Veuillez renseigner le prix de l'article achete: ");
PRIX= Lire.d();

  System.out.println();
  System.out.print("Veuillez indiquer la categorie de l'article: ");
CAT= Lire.i();

  System.out.println();
   if (CAT==0){System.out.format("Article non remise, au prix de %.2f euros.\n", PRIX);}
   else{if(CAT>3){System.out.println("Categorie non trouvee. Veuillez renseigner une categorie valide:");
while(CAT>3){
CAT= Lire.i();

  System.out.println();
   if (CAT==0){System.out.format("Article non remise, au prix de %.2f euros.\n", PRIX);}
   else{if(CAT>3){System.out.println("Categorie non trouvee. Veuillez renseigner une categorie valide:");}
else{
	     if (CAT==1){PrixR=PRIX*0.90;}
   	     if (CAT==2){PrixR=PRIX*0.80;}
   	     if (CAT==3){PrixR=PRIX*0.70;}
    RABAIS=PRIX-PrixR;
    System.out.print("Remise de "+CAT+"0%, ");
    System.out.format("soit un rabais de %.2f euros, ",RABAIS);
    System.out.format("pour un prix final de %.2f euros.\n", PrixR);}
   }}}
else{
	     if (CAT==1){PrixR=PRIX*0.90;}
   	     if (CAT==2){PrixR=PRIX*0.80;}
   	     if (CAT==3){PrixR=PRIX*0.70;}
    RABAIS=PRIX-PrixR;
    System.out.print("Remise de "+CAT+"0%, ");
    System.out.format("soit un rabais de %.2f euros, ",RABAIS);
    System.out.format("pour un prix final de %.2f euros.\n", PrixR);}
   }



  System.out.println();
  System.out.print("Nouvelle requete ? ");
CHOIX= Lire.c();}
while(!(CHOIX=='N')&&!(CHOIX=='n'));
  System.out.println("FIN DE PROGRAMME");
  System.out.println();
}}