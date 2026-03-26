package services;

import model.HealthRecord;

public class HairFallAnalyzer {

    public void analyze(HealthRecord record) {

        if (record.getHairFallLevel() >= 7) {
            System.out.println("You are experiencing significant hair fall.");
            System.out.println("This may be linked to hormonal or nutritional issues.");
        }
    }
}