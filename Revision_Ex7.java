package Doc_Revision_Exercices;

import java.io.*;

public class Revision_Ex7 {
    public static void main(String[] args) throws Exception {
        BufferedReader fichier = new BufferedReader(new FileReader("nov.txt"));
        System.out.println("Moyenne : " + moyenne(fichier));
        temp("positives.txt", 1);
        temp("negatives.txt", 2);
    }
    public static void temp (String nomFichier, int choix) throws IOException {
        BufferedReader fichier = new BufferedReader(new FileReader("nov.txt"));
        PrintWriter temp = new PrintWriter(new FileWriter(nomFichier));
        String sLigne;
        if (choix ==1) {
            while ((sLigne = fichier.readLine()) != null) {
                if (sLigne.charAt(0) != '-') {
                    temp.println(sLigne);
                }
            }
        }
        if (choix ==2) {
            while ((sLigne = fichier.readLine()) != null) {
                if (sLigne.charAt(0) == '-') {
                    temp.println(sLigne);
                }
            }
        } fichier.close(); temp.close();
    }
    public static double moyenne(BufferedReader fichier) throws IOException {
        String sLigne; int moy = 0; int index = 0;
        while ((sLigne = fichier.readLine()) != null) {
            moy = moy + Integer.parseInt(sLigne);
            index++;
        } return (double) moy / index;
    }
}
