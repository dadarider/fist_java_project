import java.util.Scanner;

public class NombrePaire {
    public static void main(String[] args) {
        System.out.println("veillez entrer un nombre paire");
        Scanner sc = new Scanner(System.in) ;
        double n = sc.nextInt() ;

        int l= (int) Math.floor(n/2) ;

        if(n/2==l){
            System.out.println(n+" est un nombre paire");

        }
        else{System.out.println(n+" est un nombre impaire");}

    }
}
