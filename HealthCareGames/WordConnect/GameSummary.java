package HealthCareGames.WordConnect;

import java.util.HashMap;

public class GameSummary {
    private HashMap<String, String> associations;

    public GameSummary() {
        associations = new HashMap<>();
    }

    // Method to record the player's association for a given word
    public void recordAssociation(String word, String association) {
        associations.put(word, association);
    }

    // Method to display the summary of all associations
    public void displaySummary() {
        System.out.println("\nSummary of Your Associations:");
        if (associations.isEmpty()) {
            System.out.println("No associations recorded.");
        } else {
            associations.forEach((word, association) -> 
                System.out.println(word + " -> " + association));
        }
        displayPositiveMessage();
    }

    // Method to display a positive message based on the player's associations
    private void displayPositiveMessage() {
        System.out.println("\nPositive Message:");
        System.out.println("Great job! Your associations reflect creativity and personal insights.");
        System.out.println("Keep these positive connections in mind as you go through your day.");
    }
}

