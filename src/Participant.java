public class Participant {
    private int id;
    private String name;
    private double personalRecord;
    private double classificationTime;
    private double finalTime;

    public Participant(int id, String name, double personalRecord) {
        this.id = id;
        this.name = name;
        this.personalRecord = personalRecord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPersonalRecord() {
        return personalRecord;
    }

    public void setPersonalRecord(double personalRecord) {
        this.personalRecord = personalRecord;
    }

    public double getClassificationTime() {
        return classificationTime;
    }

    public void setClassificationTime(double classificationTime) {
        this.classificationTime = classificationTime;
    }

    public double getFinalTime() {
        return finalTime;
    }

    public void setFinalTime(double finalTime) {
        this.finalTime = finalTime;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "id:" + id +
                ", name:'" + name + "'" +
                ", personal record:" + personalRecord +
                '}';
    }

}
