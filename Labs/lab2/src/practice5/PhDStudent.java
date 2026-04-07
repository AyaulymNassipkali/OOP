package practice5;

public class PhDStudent extends Student {
    private String researchTopic;

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age, major);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    @Override
    public String getOccupation() {
        return "PhD Student - " + getMajor() + ", Research: " + researchTopic;
    }

    @Override
    public String toString() {
        return super.toString() + ", researchTopic='" + researchTopic + "'}";
    }
}
