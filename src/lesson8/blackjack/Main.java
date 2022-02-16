package lesson8.blackjack;

public class Main {
    public static void main(String[] args) {
//        Koloda koloda = new Koloda();
////        Card dealCard = koloda.getRandomCard();
////        System.out.println(dealCard.getName() + " (" + dealCard.getValue() + ")");
////        System.out.println(koloda.toString());
//        System.out.println(koloda.getRandomCard());
        Game game = new Game();
        Player player = new Player();
        Dealler dealler = new Dealler();
        game.addPlayer(player);
        game.addPlayer(dealler);

        game.dealTwoCards();
        game.dealMaxCards();
        game.printWinner();
    }
}