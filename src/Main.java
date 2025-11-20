import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Afficher le Menu
        int choix;
        do {
       do { // Faire
            System.out.println("1 : Exo 1");
            System.out.println("2 : Exo 2");
            System.out.println("3 : Exo 3");
            System.out.println("4 : Exo 4");
            System.out.println("5 : Exo 5");
            System.out.println("6 : Exo 6");
            System.out.println("0 : Aurevoir !!");
           System.out.print("Faite un Choix : " );
            choix = sc.nextInt();
        }while (choix < 0 || choix > 7); // Tant que

            // Selon la avaleur de ma Variable choix
            switch (choix) {
                case 1:
                    // Exo 1
                    double cote;     // Variable du nom de cote(float ou double pour une decimal)
                    System.out.println("Quelle est la Valeur du cote : ");   // Afficher um message dans la Console
                    cote = sc.nextDouble();   // on affirme que la Variable cote recupere la valeur saisier dans l'objet "entrer"

                    // On calcul le cote * cote est on le Concataine(rapproche) des phrases avec les +
                    System.out.println("L'aire du carre est de : " + cote * cote + "cm2");
                    break;
                case 2:
                    // Exo 2
                    int nb1;
                    int nb2;
                    int nb3;
                    System.out.println("Saisir le Premier Nombre ");
                    nb1 = sc.nextInt();
                    System.out.println("Saisir le Deuxieme Numero ");
                    nb2 = sc.nextInt();
                    System.out.println("Avant");
                    System.out.println("nb1 = " + nb1);
                    System.out.println("nb2 = " + nb2);
                    System.out.println("Apres");
                    nb3 = nb1;
                    nb1 = nb2;
                    nb2 = nb3;
                    System.out.println("nb1 = " + nb1);
                    System.out.println("nb2 = " + nb2);
                    break;
                case 3:
                    // Exo 3
                    int indice;
                    double salaireBrut;
                    double salaireNet;
                    double montantRet;
                    System.out.println("Quel est votre indice ? : ");
                    indice = sc.nextInt();
                    salaireBrut = indice * 2.30;
                    montantRet = (2.0 / 10.0) * salaireBrut;
                    salaireNet = salaireBrut - montantRet;
                    System.out.println("Voici votre Salaire Brut : " + salaireBrut + "$");
                    System.out.println("Montant des retenues : " + montantRet + "$");
                    System.out.println("Salaire Net : " + salaireNet + "$");
                    break;
                case 4:
                    // Exo 4
                double rayon;
                double perimetre;
                final double Pi;  //Variable Constante
                Pi = Math.PI;
                System.out.println("Saisir le Rayon ? : ");
                rayon = sc.nextDouble();
                perimetre = 2 * Pi * rayon;
                System.out.println("Le perimetre du Cercle est : "+ perimetre);
                break;

                case 5:
                        // Exo Perso 1
                int note1;
                int note2;
                int note3;
                double noteFinal;
                System.out.println("Saisir une Note : ");
                note1 = sc.nextInt();
                System.out.println("Saisir une Deuxieme Note : ");
                note2 = sc.nextInt();
                System.out.println("Saisir une Troisieme Note : ");
                note3 = sc.nextInt();
                noteFinal = (note1 + note2 + note3) /3.0;
                System.out.println("Votre Moyenne est de : " + noteFinal);
                break;

                case 6 :
                    // Exo Perso 2
            int random;
            int saisie;
            Random rand = new Random();
            random = sc.nextInt(100) + 1;
            System.out.println("Devine le Nombre: ");
            Scanner input = new Scanner(System.in);
            break;

                case 7 :
                    int longueur;
                    int largeur;
                    int result;
                    System.out.println("Saisir la longueur du rectangle : ");
                    longueur = sc.nextInt();
                    System.out.println("Saisir la largeur du rectangle : ");
                    largeur = sc.nextInt();

                    result = (largeur + longueur)*2;
                    System.out.println("Le périmètre du rectangle est : " + result + "cm");
                    break;

            }

        }while (choix != 0); //Refaire tout tant que choix n'est pas 0
    }
}