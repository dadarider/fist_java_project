import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        System.out.println("entrer la longueur du rectangle :");
    Scanner sc = new Scanner(System.in);
    float longueur = sc.nextFloat();
    System.out.println("entrer la largueur du rectangle :");
    float largueur = sc.nextFloat();

    float perimetre= (longueur+largueur)*2;
    System.out.println("le périmètre de votre rectange est  : " +perimetre +" m");
    System.out.println("le demiperimètre est :" + (perimetre)/2 +" m");
    System.out.println("l'aire est de " + (longueur*largueur) +" m²");

    sc.close();
    }
    }


