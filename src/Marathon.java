import java.util.ArrayList;
import java.util.List;

public class Marathon {
    private double classificationTime;
    private List<Participant> participants;
    private List<Participant> qualifiedParticipants;

    public Marathon(double classificationTime) {
        this.classificationTime = classificationTime;
        this.participants = new ArrayList<>();
        this.qualifiedParticipants = new ArrayList<>();
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public double getClassificationTime() {
        return classificationTime;
    }

    public void setClassificationTime(double classificationTime) {
        this.classificationTime = classificationTime;
    }

    public List<Participant> getQualifiedParticipants() {
        return qualifiedParticipants;
    }

    public void setQualifiedParticipants(List<Participant> qualifiedParticipants) {
        this.qualifiedParticipants = qualifiedParticipants;
    }

    public void registerParticipant(Participant participant) {
        this.participants.add(participant);
    }

    public void displayParticipants() {
        System.out.println("============");
        System.out.println("Participants");
        System.out.println("============");

        for (Participant participant : participants) {
            System.err.println(participant);
        }

    }

    public void classificationTest() {
        for (Participant participant : participants) {

            double time = Math.random() * 20 + classificationTime - 10;
            participant.setClassificationTime(time);

            if (participant.getClassificationTime() <= classificationTime) {
                qualifiedParticipants.add(participant);
            }

        }
    }

    public void displayQualifiedParticipants() {
        System.out.println("============");
        System.out.println("Qualified participants");
        System.out.println("============");

        for (Participant participant : qualifiedParticipants) {
            System.err.println(participant + ", classification time: " + participant.getClassificationTime());
        }
    }

    public void finalRace() {

        for (Participant participant : qualifiedParticipants) {

            double time = Math.random() * 20 + classificationTime - 10;
            participant.setFinalTime(time);

            if (participant.getFinalTime() < participant.getPersonalRecord()) {
                participant.setPersonalRecord(participant.getFinalTime());
            }

        }
    }

    public void showFinalResults() {
        System.out.println("============");
        System.out.println("Final race");
        System.out.println("============");

        for (Participant participant : qualifiedParticipants) {
            System.err.println(participant + ", classification time: " + participant.getClassificationTime()+ ", final time: " + participant.getFinalTime());
        }

    }

}
