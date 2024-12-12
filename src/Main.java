import java.util.Scanner;

public class Main {
    private static char[][] plateau = new char[3][3];

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez le nom du joueur 1 : ");
        String player1 = clavier.nextLine();
        System.out.print("Entrez le nom du joueur 2 : ");
        String player2 = clavier.nextLine();

        while (true) {
            char[][] tableau = {
                    {' ', ' ', ' '},
                    {' ', ' ', ' '},
                    {' ', ' ', ' '}
            };

            char joueurActuel = 'X';

            while (true) {
                System.out.println("C'est au tour du joueur " + joueurActuel + " !");
                afficherTableau(tableau);

                System.out.print("Choisissez une ligne (1-3) : ");
                int ligne = clavier.nextInt() - 1;
                System.out.print("Choisissez une colonne (1-3) : ");
                int colonne = clavier.nextInt() - 1;

                if (ligne < 0 || ligne >= 3 || colonne < 0 || colonne >= 3) {
                    System.out.println("Les coordonnées doivent être entre 1 et 3.");
                } else if (tableau[ligne][colonne] != ' ') {
                    System.out.println("La case est déjà prise. Choisissez une autre.");
                } else {
                    tableau[ligne][colonne] = joueurActuel;

                    if (verifierGagnant(tableau, joueurActuel)) {
                        afficherTableau(tableau);
                        System.out.println("Le joueur " + joueurActuel + " a gagné !");
                        break;
                    }

                    joueurActuel = (joueurActuel == 'X') ? 'O' : 'X';
                }
            }

            System.out.print("Voulez-vous rejouer ? (oui/non) : ");
            String reponse = clavier.next();

            if (reponse.equalsIgnoreCase("non")) {
                System.out.println("Merci d'avoir joué !");
                break;
            }
        }
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

    private static boolean verifierGagnant(char[][] tableau, char joueur) {
        for (int i = 0; i < 3; i++) {
            if ((tableau[i][0] == joueur && tableau[i][1] == joueur && tableau[i][2] == joueur) ||
                    (tableau[0][i] == joueur && tableau[1][i] == joueur && tableau[2][i] == joueur)) {
                return true;
            }
        }

        if ((tableau[0][0] == joueur && tableau[1][1] == joueur && tableau[2][2] == joueur) ||
                (tableau[0][2] == joueur && tableau[1][1] == joueur && tableau[2][0] == joueur)) {
            return true;
        }

        return false;
    }
}


