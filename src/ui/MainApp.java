package ui;

import java.util.Scanner;
import model.*;
import services.HealthAnalysisManager;
import awareness.*;
import data.DataManager;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DataManager dataManager = new DataManager();
        HealthAnalysisManager manager = new HealthAnalysisManager();

        int choice;

        do {
            System.out.println("Women Health Tracker");

            System.out.println("1. Add User");
            System.out.println("2. View All Users");
            System.out.println("3. Analyze Health");
            System.out.println("4. Awareness");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();

                    System.out.println("Enter your name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter your age: ");
                    int age = sc.nextInt();

                    System.out.println("Enter cycle length (in days): ");
                    int cycleLength = sc.nextInt();

                    System.out.println("Enter pain level (1-10): ");
                    int painLevel = sc.nextInt();

                    System.out.println("Enter acne level (1-10): ");
                    int acneLevel = sc.nextInt();

                    System.out.println("Enter hair fall level (1-10): ");
                    int hairFallLevel = sc.nextInt();

                    System.out.println("Do you have irregular cycles? (true/false): ");
                    boolean irregularCycle = sc.nextBoolean();

                    System.out.println("Do you feel fatigue? (true/false): ");
                    boolean fatigue = sc.nextBoolean();

                    HealthRecord record = new HealthRecord(
                            cycleLength, painLevel, acneLevel,
                            hairFallLevel, irregularCycle, fatigue
                    );

                    User user = new User(name, age, record);
                    dataManager.addUser(user);
                    break;

                case 2:
                    dataManager.viewAllUsers();
                    break;

                case 3:
                    if (dataManager.getUsers().isEmpty()) {
                        System.out.println("No users to analyze.");
                    } else {
                        for (User u : dataManager.getUsers()) {
                            manager.analyzeAll(u.getHealthRecord());
                        }
                    }
                    break;

                case 4:
                    PCOSInformation pcosInfo = new PCOSInformation();
                    EndometriosisInformation endoInfo = new EndometriosisInformation();
                    GeneralHealthInformation generalInfo = new GeneralHealthInformation();

                    pcosInfo.displayInfo();
                    endoInfo.displayInfo();
                    generalInfo.displayTips();
                    break;

                case 5:
                    System.out.println("Exiting... Thank you.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}