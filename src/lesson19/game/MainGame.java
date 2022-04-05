package lesson19.game;

public class MainGame {
    public static void main(String[] args) {
        AnalystParticipant analystParticipant = new AnalystParticipant("Ольга", 30);
        AnalystParticipant analystParticipant2 = new AnalystParticipant("Кирилл", 23);

        DeveloperParticipant developerParticipant = new DeveloperParticipant("Иван", 26);
        DeveloperParticipant developerParticipant2 = new DeveloperParticipant("Катя", 38);

        DeveloperParticipant developerParticipant3 = new DeveloperParticipant("Дима", 29);
        DeveloperParticipant developerParticipant4 = new DeveloperParticipant("Елена", 31);

        Team<AnalystParticipant> analystTeam = new Team<>();
        analystTeam.setName("Безумцы");
        analystTeam.addParticipantToTeam(analystParticipant);
        analystTeam.addParticipantToTeam(analystParticipant2);

        Team<AnalystParticipant> analystTeam2 = new Team<>();
        analystTeam2.setName("Стратеги");
        analystTeam2.addParticipantToTeam(analystParticipant);
        analystTeam2.addParticipantToTeam(analystParticipant2);

        Team<DeveloperParticipant> developerTeam = new Team<>();
        developerTeam.setName("Тигры");
        developerTeam.addParticipantToTeam(developerParticipant);
        developerTeam.addParticipantToTeam(developerParticipant2);

        Team<DeveloperParticipant> developerTeam2 = new Team<>();
        developerTeam2.setName("Короли");
        developerTeam2.addParticipantToTeam(developerParticipant3);
        developerTeam2.addParticipantToTeam(developerParticipant4);

        developerTeam.winnerTeam(developerTeam2);
        analystTeam.winnerTeam(analystTeam2);

    }
}
