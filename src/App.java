public class App {
    public static void main(String[] args) throws Exception {
        Participant participant01 = new Participant(1, "Marco Paredes", 45);
        Participant participant02 = new Participant(2, "María González", 50);
        Participant participant03 = new Participant(3, "Juan Pérez", 55);
        Participant participant04 = new Participant(4, "Ana Torres", 60);
        Participant participant05 = new Participant(5, "Luis Ramírez", 58);
        Participant participant06 = new Participant(6, "Carla Fernández", 62);
        Participant participant07 = new Participant(7, "Pedro Sánchez", 57);
        Participant participant08 = new Participant(8, "Laura Morales", 59);
        Participant participant09 = new Participant(9, "Diego Castro", 61);
        Participant participant10 = new Participant(10, "Sofía Herrera", 56);

        Marathon marathon = new Marathon(60);
        marathon.registerParticipant(participant01);
        marathon.registerParticipant(participant02);
        marathon.registerParticipant(participant03);
        marathon.registerParticipant(participant04);
        marathon.registerParticipant(participant05);
        marathon.registerParticipant(participant06);
        marathon.registerParticipant(participant07);
        marathon.registerParticipant(participant08);
        marathon.registerParticipant(participant09);
        marathon.registerParticipant(participant10);

        marathon.displayParticipants();

        marathon.classificationTest();
        
        marathon.displayQualifiedParticipants();

        marathon.finalRace();

        marathon.showFinalResults();

        }
}
