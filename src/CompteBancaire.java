public class CompteBancaire {
    public double solde;
    public    CompteBancaire( Double s){
        this.solde =s;


    }
    public void deposer( Double d){
        this.solde+=d;

    }
    public void retirer( Double r){
        this.solde-=r;
    }
    public void afficher(){
        System.out.println("votre solde est de " +this.solde + "fcfa");
    }
}
