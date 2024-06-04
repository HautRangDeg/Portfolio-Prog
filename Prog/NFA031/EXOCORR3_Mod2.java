public class EXOCORR3_Mod2
{public static void main ( String [ ] args )
 {int NBRE_HEURE , NBRE_Min , NBRE_sec , Modulo_sec , Modulo_Min , TotalS_sec ;
  
  System.out.println("Bonjour,");
  System.out.println();
  System.out.println("Ce programme est un outil de transposition de secondes en heures, minutes, secondes.");
  System.out.println();
  System.out.println("Veuillez indiquer les secondes: ");
  TotalS_sec = Lire.i();
  System.out.println();
  NBRE_HEURE = TotalS_sec/3600;
  Modulo_Min = TotalS_sec % 3600;
  NBRE_Min = Modulo_Min / 60;
  Modulo_sec = Modulo_Min % 60;
  System.out.println();
  System.out.println("Correspondance heures:minutes:secondes: "+NBRE_HEURE+":"+NBRE_Min+":"+Modulo_sec);
  System.out.println();
  System.out.print("FIN DU PROGRAMME");
  System.out.println();
 }
}