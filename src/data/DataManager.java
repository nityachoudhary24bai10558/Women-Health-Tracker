package data;

import java.util.ArrayList;
import model.User;

public class DataManager {

    private ArrayList<User> users;

    public DataManager() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println(" The User was added successfully.");
    }

    public void viewAllUsers() {

        if (users.isEmpty()) {
            System.out.println("No users were found.");
            return;
        }

        for (User user : users) {
            user.displayUser();
            System.out.println();
        }
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}