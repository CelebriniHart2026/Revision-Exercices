package Doc_Revision_Exercices;

import java.util.Scanner;

public class Revision_Ex3 {
    public static void main(String[] args) {
        triangle();
    }
    public static void triangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer un nb");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(j + " ");
            } System.out.println();
        }
    }
}
