package lesson8.blackjack;

public interface IGame {
    void addPlayer(Player player);

    void dealTwoCards();

    void dealMaxCards();

    void printWinner();
}
