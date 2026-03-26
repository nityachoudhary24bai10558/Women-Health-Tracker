package services;

import model.HealthRecord;

public class AcneAnalyzer {

    public void analyze(HealthRecord record) {

        if (record.getAcneLevel() >= 7) {
            System.out.println("You are experiencing high acne levels.");
            System.out.println("This may be related to hormonal imbalance.");
        }
    }
}