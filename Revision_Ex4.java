package Doc_Revision_Exercices;

import java.util.Scanner;

public class Revision_Ex4 {
    public static void main(String[] args) {
        String n = chaine();
        System.out.println(frequence(n));
    }
    public static String chaine() {
        System.out.println("Entrer une chaine de caracteres");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        return n;
    }
    public static int frequence(String n) {
        System.out.println("Entrer un caractere");
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int freq = 0;
        for (int i = 0; i <n.length(); i++) {
            if (a == n.charAt(i)) {
                freq++;
            }
        }
        return freq;
    }
}
