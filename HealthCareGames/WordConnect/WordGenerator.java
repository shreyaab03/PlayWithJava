package HealthCareGames.WordConnect;

import java.util.ArrayList;
import java.util.Random;

public class WordGenerator {
    private ArrayList<String> words;

    public WordGenerator() {
        words = new ArrayList<>();
        words.add("Calm");
        words.add("Ocean");
        words.add("Sunshine");
        words.add("Dream");
        words.add("Forest");
        words.add("Smile");
        words.add("Journey");
        words.add("Peace");
        words.add("Star");
        words.add("Freedom");
        words.add("Music");
        words.add("Serenity");
        words.add("Cloud");
        words.add("Harmony");
        words.add("Adventure");
        words.add("Joy");
        words.add("Mountain");
        words.add("Love");
        words.add("River");
        words.add("Breeze");
        words.add("Garden");
        words.add("Magic");
        words.add("Balance");
        words.add("Friendship");
        words.add("Glow");
        words.add("Sunset");
        words.add("Whisper");
        words.add("Courage");
        words.add("Bliss");
        words.add("Laughter");
    }

    public String getNextWord() {
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }
}
