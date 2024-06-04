public class EXOPROP2_Mod3
{public static void main ( String [ ] args )
 {double MONTANT, CONVERSION ;
    int DEVISE ;
String FRANC, EURO, CORRESPOND;

System.out.println("Machine de conversion eur/fr ou fr/eur.");
  System.out.println();

System.out.println("Veuillez saisir le numero de l'option de conversion:");
System.out.println("1 - francs en euros.");
System.out.println("2 - euros en francs.");
DEVISE= Lire.i();
  System.out.println();
if(DEVISE==1){System.out.println("Merci d'avoir encore des francs.");}
else{System.out.println("Dommage");
  System.out.println();
if(DEVISE==2){System.out.println("Veuillez indiquer le nombre d'euro(s) a convertir.");
MONTANT= Lire.d();
CONVERSION = MONTANT*6.55957;
if(CONVERSION>=2){FRANC="francs";}
else{FRANC="franc";}
if(MONTANT>=2){EURO="euros";
CORRESPOND="correspondent";}
else{EURO="euro";
CORRESPOND="correspond";}
  System.out.println();
  System.out.format("%.2f ",MONTANT);
System.out.print(EURO+" "+CORRESPOND+" a ");
  System.out.format("%.5f ",CONVERSION);
System.out.print(FRANC+".");}}
  System.out.println();
if(DEVISE==1){System.out.println("Veuillez indiquer le nombre de franc(s) a convertir.");
MONTANT= Lire.d();
CONVERSION = MONTANT/6.55957;
if(MONTANT>=2){FRANC="francs";CORRESPOND="correspondent";}
else{FRANC="franc";CORRESPOND="correspond";}
if(CONVERSION>=2){EURO="euros";}
else{EURO="euro";}
  System.out.println();
  System.out.format("%.2f ",MONTANT);
System.out.print(FRANC+" "+CORRESPOND+" a ");
  System.out.format("%.5f ",CONVERSION);
System.out.print(EURO+".");}

  System.out.println();
  System.out.println("FIN DE PROGRAMME");
  System.out.println();

}}