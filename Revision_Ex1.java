package Doc_Revision_Exercices;

import java.util.Scanner;

public class Revision_Ex1 {
    public static void main(String[] args) {
        int n = positif();
        int somme = somme(n);
        System.out.println(somme);
    }
    public static int positif() {
        int n = 0;
        do {
            System.out.println("Entrer un nombre positif");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
        } while (n <0);
        return n;
    }
    public static int somme(int n) {
        int somme = 0;
        for (int i = 1; i <= n; i++) {
            somme += i;
        }
        return somme;
    }
}