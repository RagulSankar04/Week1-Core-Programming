import java.util.*;

public class cardDeck {

    public static String[] initializeDeck() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        if (deck.length < numPlayers * cardsPerPlayer) {
            System.out.println("Not enough cards to distribute.");
            return new String[0][0];
        }

        String[][] players = new String[numPlayers][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[index++];
            }
        }
        return players;
    }

    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards: ");
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);

        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();

        System.out.print("Enter the number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();

        String[][] playersCards = distributeCards(deck, numPlayers, cardsPerPlayer);

        if (playersCards.length > 0) {
            printPlayersCards(playersCards);
        }

        scanner.close();
    }
}
