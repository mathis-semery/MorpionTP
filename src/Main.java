import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner clavier = new Scanner(System.in);

        System.out.print ("Entrez le nom du joueur 1 : ");
        String player1 = clavier.nextLine();
        System.out.print("Entrez le nom du joueur 2 : ");
        String player2 = clavier.nextLine();
    }
}

