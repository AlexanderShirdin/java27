package lesson8.blackjack;

import java.util.ArrayList;

public class Game implements IGame {
    private ArrayList<Player> players = new ArrayList<>();
    private Koloda koloda = new Koloda();

    @Override
    public void addPlayer(Player player) {
        players.add(player);
    }

    @Override
    public void dealTwoCards() {
        for (Player p : players) {
            p.addCardToHand(koloda.getRandomCard());
            p.addCardToHand(koloda.getRandomCard());
        }
    }

    @Override
    public void dealMaxCards() {
        for (Player p : players) {
            while (p.needsCard()) {
                p.addCardToHand(koloda.getRandomCard());
            }
        }
    }

    @Override
    public void printWinner() {
        // 12  21  34  19  19
        // 12  23  34  19  19
        // 12  18  19
        // 34  34  19 !!!!
        // 32  32  23 крупье !!!!!
        for (Player p : players) {
            if (p.valuesHand() > 21) {
                p.setCanWin(false);
            }
        }
        if (cauntPlayersCanWin() == 0) {
            for (Player p : players) {
                if (p instanceof Dealler) {
                    System.out.println("Выиграл крупье!");
                    p.openCards();
                    return;
                }
            }
        }
        if (cauntPlayersCanWin() == 1) {
            for (Player p : players) {
                if (p.isCanWin()) {
                    System.out.println("Выиграл другой игрок!");
                    p.openCards();
                    return;
                }
            }
        }
        // 12  12  34  19  19
        int valueWinner = -1;
        for (Player p : players) {
            if (p.isCanWin() && p.valuesHand() > valueWinner) {
                valueWinner = p.valuesHand();

            }
        }
        for (Player p : players) {
            if (p.isCanWin() && p.valuesHand() == valueWinner) {
                System.out.println("Вы выиграли!");
                p.openCards();
            }
        }
    }
    private int cauntPlayersCanWin() {
        int count = 0;
        for (Player p : players) {
            if (p.isCanWin()) {
                count++;
            }
        }
        return count;
    }
}