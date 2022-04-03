package lesson19;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    String name;
    List<Participant> participants;

    public void addParticipantToTeam(T participant) {
        System.out.println("В команду " + name + " добавлен игрок с именем " + participant.name);
        participants = new ArrayList<>();
        participants.add(participant);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void winnerTeam(Team<T> team) {
        Random random = new Random();
        int randomOpredelitel = random.nextInt(0,2);
        if (randomOpredelitel == 1) {
            System.out.println("Выиграла команда " + this.name);
        } else {
            System.out.println("Выиграла команда " + team.name);
        }
    }
}
