package Doc_Revision_Exercices;

public class Revision_Ex5 {
    public static void main(String[] args) {
        int[] tab = {10, 45, 89, -7, 23, 17, 32, 55, 98, 32};
        int[] resultats = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            resultats[(i+2)% tab.length] = tab[i];
        }
        afficher(resultats);
    }
    public static void afficher(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
}
