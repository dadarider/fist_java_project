
public class Main {
   public static void main(String[] args) {


       CompteBancaire monCompte = new CompteBancaire(5000.0);

       monCompte.retirer(2000.0);

       monCompte.afficher();





       Voiture tesla = new Voiture();
       Voiture yaris = new Voiture();
       Voiture fortuner = new Voiture();

//assigner une power

       tesla.puissance =1001;
       yaris.puissance =802;
       fortuner.puissance =150;



       tesla.vitesseMax();
       yaris.vitesseMax();
       fortuner.vitesseMax();
   }

}