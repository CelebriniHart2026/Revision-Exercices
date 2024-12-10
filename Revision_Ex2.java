package Doc_Revision_Exercices;

import java.util.Scanner;

public class Revision_Ex2 {
    public static void main(String[] args) {
        int n = positif();
        System.out.println(produit(n));
    }
        public static int positif () {
            int n;
            do {
                System.out.println("Entrer un nombre positif");
                Scanner sc = new Scanner(System.in);
                n = sc.nextInt();
            } while (n < 0);
            return n;
        }
        public static int produit(int n) {
        int produit = 1;
        for (int i = 1; i <= n; i++) {
            produit*=i;
        }
        return produit;
        }
    }
