package model;

public class HealthRecord {

    private int cycleLength;
    private int painLevel;
    private int acneLevel;
    private int hairFallLevel;
    private boolean irregularCycle;
    private boolean fatigue;


    public HealthRecord(int cycleLength, int painLevel, int acneLevel,
                        int hairFallLevel, boolean irregularCycle, boolean fatigue) {
        this.cycleLength = cycleLength;
        this.painLevel = painLevel;
        this.acneLevel = acneLevel;
        this.hairFallLevel = hairFallLevel;
        this.irregularCycle = irregularCycle;
        this.fatigue = fatigue;
    }


    public int getCycleLength() {
        return cycleLength;
    }

    public int getPainLevel() {
        return painLevel;
    }

    public int getAcneLevel() {
        return acneLevel;
    }

    public int getHairFallLevel() {
        return hairFallLevel;
    }

    public boolean isIrregularCycle() {
        return irregularCycle;
    }

    public boolean hasFatigue() {
        return fatigue;
    }


    public void displayRecord() {
        System.out.println("Your Cycle Length is: " + cycleLength);
        System.out.println("The Pain Level you are experiencing is: " + painLevel);
        System.out.println("Amount of hormonal acne you get: " + acneLevel);
        System.out.println("The hair fall that you are experiencing: " + hairFallLevel);
        System.out.println("Is your cycle irregular: " + irregularCycle);
        System.out.println("Do you get tired: " + fatigue);
    }
}