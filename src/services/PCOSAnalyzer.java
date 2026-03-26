package services;

import model.HealthRecord;

public class PCOSAnalyzer {

    public void analyze(HealthRecord record) {

        if (record.getCycleLength() > 35 &&
                record.getAcneLevel() > 5 &&
                record.getHairFallLevel() > 5) {

            System.out.println("These are possible signs of PCOS.");
            System.out.println("Recommendation is : To consult a gynecologist.");
        }
    }
}