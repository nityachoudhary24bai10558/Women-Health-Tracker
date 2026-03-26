package services;

import model.HealthRecord;

public class EndometriosisAnalyzer {

    public void analyze(HealthRecord record) {

        if (record.getPainLevel() >= 8) {
            System.out.println("You deal with very high pain levels.");
            System.out.println("This is a possible sign of Endometriosis.");
        }
    }
}