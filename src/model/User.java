package model;

public class User {

    private String name;
    private int age;
    private HealthRecord healthRecord;

    // Constructor
    public User(String name, int age, HealthRecord healthRecord) {
        this.name = name;
        this.age = age;
        this.healthRecord = healthRecord;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public HealthRecord getHealthRecord() {
        return healthRecord;
    }

    // Display method
    public void displayUser() {
        System.out.println("The name of the person is: " + name);
        System.out.println("The age of the person is: " + age);

        System.out.println("These are the health details");
        healthRecord.displayRecord();
    }
}