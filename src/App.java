public class App {
    public static void main(String[] args) throws Exception {
        Participant participant01 = new Participant(1, "Franciso Paredes", 45);


        Participant participant02 = new Participant(2, "María González", 50);

        Marathon marathon = new Marathon(60);
        marathon.registerParticipant(participant01);
        marathon.registerParticipant(participant02);
        marathon.displayParticipants();

        marathon.classificationTest();
        
        marathon.displayQualifiedParticipants();

        marathon.finalRace();

        marathon.showFinalResults();

        }
}
