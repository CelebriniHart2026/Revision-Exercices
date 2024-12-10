package Doc_Revision_Exercices;
import java.io.*;
import java.util.Random;

public class Revision_Ex6 {
    public static void main(String[] args) throws IOException {
        double[] tabX = remplir();
        double[]tab = sort(tabX);
        double[] tab1 = division(tab, 1);
        double[] tab2 = division(tab, 2);
        double[] tab3 = division(tab, 3);
        stocker(tab1, "fich1.txt");
        stocker(tab2, "fich2.txt");
        stocker(tab3, "fich3.txt");
    }

    public static double[] remplir() {
        Random rand = new Random();
        double[] tab = new double[10 + rand.nextInt(11)];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextDouble(101) ;
        } return tab;
    }

    public static double[] sort(double[] tab) {
        int n = tab.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (tab[j] > tab[j + 1]) {
                    // swap temp and tab[i]
                    int temp = (int) tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
        return tab;
    }

    public static double[] division(double[] tab, int choix) {
        int n = tab.length;
        int taille = 0; int taille2 = 0; int taille3 = 0;
        for (int i = 0; i < n; i++) {
            switch (choix) {
                case 1:
                    if (tab[i] <= 30) {
                        taille++;
                    }
                    break;
                case 2:
                    if (tab[i] > 30 && tab[i] <= 70) {
                        taille++;
                    }
                    break;
                case 3:
                    if (tab[i] > 70 && tab[i] <= 100) {
                        taille++;
                    }
                    else {taille3++;}
            }
        }
            double[] tab1 = new double[taille];
            for (int i = 0; i < tab1.length; i++) {
                switch (choix) {
                    case 1:
                        if (tab[i] <= 30) {
                            tab1[i] = tab[i];
                        }
                        break;
                    case 2:
                        if (tab[i + taille] > 30 && tab[i + taille] <= 70) {
                            tab1[i] = tab[i + tailleR];
                        }
                        break;
                    case 3:
                        if (tab[i + taille3] > 70 && tab[i + taille3] <= 100) {
                            tab1[i] = tab[i + taille3];
                        }
                }
                }
        return tab1;
    }

    public static void stocker(double[] tab, String choix) throws IOException {
        PrintWriter stocker = new PrintWriter(new FileWriter(choix));
        for (int i = 0; i < tab.length; i++) {
            stocker.println(tab[i]);
        }
        stocker.close();
    }

}
