package services;

import model.HealthRecord;

public class HealthAnalysisManager {

    private PCOSAnalyzer pcosAnalyzer;
    private EndometriosisAnalyzer endometriosisAnalyzer;
    private AcneAnalyzer acneAnalyzer;
    private HairFallAnalyzer hairFallAnalyzer;

    public HealthAnalysisManager() {
        pcosAnalyzer = new PCOSAnalyzer();
        endometriosisAnalyzer = new EndometriosisAnalyzer();
        acneAnalyzer = new AcneAnalyzer();
        hairFallAnalyzer = new HairFallAnalyzer();
    }

    public void analyzeAll(HealthRecord record) {

        System.out.println("\nThis is your health analysis based on the information you have provided:");

        pcosAnalyzer.analyze(record);
        endometriosisAnalyzer.analyze(record);
        acneAnalyzer.analyze(record);
        hairFallAnalyzer.analyze(record);

        if (record.isIrregularCycle()) {
            System.out.println("Your cycles are irregular.");
            System.out.println("Maintain a healthy lifestyle and track regularly.");
        }

        if (record.hasFatigue()) {
            System.out.println("You get tired during your cycles.");
            System.out.println("Ensure proper nutrition and rest.");
        }
    }
}