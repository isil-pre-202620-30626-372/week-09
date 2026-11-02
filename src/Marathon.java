import java.util.ArrayList;
import java.util.List;

public class Marathon {
    private double timeLimit;
    private List<Participant> participants;

    public Marathon(double timeLimit) {
        this.timeLimit = timeLimit;
        this.participants = new ArrayList<>();
    }

    public double getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(double timeLimit) {
        this.timeLimit = timeLimit;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public void registerParticipant(Participant participant) {
        this.participants.add(participant);
    }

    public void displayParticipants() {
        System.out.println("============");
        System.out.println("Participants");
        System.out.println("============");

        for (Participant participant: participants) {
            System.err.println(participant);
        }

    }
}
