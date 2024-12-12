import java.util.Scanner;
public class Main {
    private static char[][] plateau = new char[3][3];
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print ("Entrez le nom du joueur 1 : ");
        String player1 = clavier.nextLine();
        System.out.print("Entrez le nom du joueur 2 : ");
        String player2 = clavier.nextLine();

        char[][] tableau = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        afficherTableau(tableau);
    }

    public static void afficherTableau(char[][] tableau) {
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tableau[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");

        }
    }
}




