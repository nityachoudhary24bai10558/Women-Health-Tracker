package services;

import model.HealthRecord;

public class Analyzer {

    public void analyze(HealthRecord record) {

        System.out.println("\nThis is your health analysis based on the information you have provided:");

        if (record.getCycleLength() > 35 && record.getAcneLevel() > 5 && record.getHairFallLevel() > 5) {
            System.out.println("These are possible signs of PCOS.");
            System.out.println("Recommendation is: To consult a gynecologist.");
        }

        if (record.getPainLevel() >= 8) {
            System.out.println("You deal with very high pain levels.");
            System.out.println("This is a possible sign of Endometriosis.");
        }

        if (record.isIrregularCycle()) {
            System.out.println("Your cycles are irregular");
            System.out.println("Maintain a healthy lifestyle and track regularly.");
        }

        if (record.hasFatigue()) {
            System.out.println("You get tired during your cycles.");
            System.out.println("Ensure proper nutrition and rest.");
        }
    }
}