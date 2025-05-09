import java.util.Scanner;

public class Bienvenue {
    public static void main(String[] args) {


        System.out.println(" Vellez entrer votre nom : ");

        Scanner sc = new Scanner(System.in);
        String nom = sc.nextLine();
        System.out.println("bienvenue m." + nom +", content de vous avoir parmis nous !");

        System.out.println(" Vellez entrer un nombre : ");

        int nb = sc.nextInt();

        int db = 2*nb;
        System.out.println("entrer le double du nombre " +nb);



        int result =sc.nextInt();

        if(db == result){
            System.out.println(" oui le double de  " + nb +"est bien " + db);
        }
        else{
            System.out.println("non ce n'est pas tout à fait ça");

        }


        System.out.println(" entrez un premier  nombre: ");
        int premier = sc.nextInt();
        System.out.println(" vous avez entré le nombre  "+ premier+" ,veillez entrer le deuxieme nombre");
        int deuxieme = sc.nextInt();
        System.out.println("vous avez rentré le nombre  "+ deuxieme +" le quel des deux nombre est le max?")  ;
        int max = sc.nextInt();
        int trueMax = premier - deuxieme;

        if(trueMax>0 && max == premier){System.out.println("le max est bien "+ premier);}
        else if(trueMax<0 && max ==deuxieme){System.out.println("le max est bien "+ deuxieme);}
        else if (trueMax==0){System.out.println("les deux nombres sont identiques");}
        else if (max !=premier  && max != deuxieme) {System.out.println("vous devez taper soit "+premier+ " soit " +deuxieme);}
        else{System.out.println("non");}





        sc.close();




}

}

