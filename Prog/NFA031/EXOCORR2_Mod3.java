public class EXOCORR2_Mod3
{public static void main ( String [ ] args )
 {double NOTE_Math , NOTE_Info , NOTE_Francais, MOYENNE ;
    String NOM_Eleve , DE ;

System.out.println("Calcul de la moyenne generale de l'eleve");
  System.out.println();
  System.out.println("Nom de l'eleve:");
  NOM_Eleve = Lire.S( ) ;
  System.out.println();
  System.out.println("Entree des notes");
  System.out.println();
  System.out.println("Mathematiques:");
  NOTE_Math = Lire.d();
  System.out.println();
  System.out.println("Informatique:");
  NOTE_Info = Lire.d();
  System.out.println();
  System.out.println("Francais:");
  NOTE_Francais = Lire.d();
  System.out.println();
  MOYENNE =((NOTE_Math*3)+(NOTE_Info*4)+(NOTE_Francais*2))/9;
if((NOM_Eleve.startsWith("A"))||(NOM_Eleve.startsWith("E"))||(NOM_Eleve.startsWith("I"))||(NOM_Eleve.startsWith("O"))||(NOM_Eleve.startsWith("U"))){DE="d'";}
  else{DE="de ";}
  System.out.format("Moyenne generale "+DE+NOM_Eleve+": %.1f",MOYENNE);
  System.out.println(); 
  System.out.print("Commentaire sur l'eleve: ");
if(MOYENNE<=5){System.out.print("Eleve en grande difficulté. A convoquer");}
if((MOYENNE>5)&&(MOYENNE<=10)){System.out.print("Intensifier le travail");}
if((MOYENNE>10)&&(MOYENNE<=15)){System.out.print("Maintenir les efforts");}
if(MOYENNE>15){System.out.print("A encourager");}
  System.out.println(); 
  System.out.println(); 
  System.out.print("FIN DU PROGRAMME");
  System.out.println(); 

 }
}