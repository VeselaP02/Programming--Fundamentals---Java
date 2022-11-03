package AdvertisementMessage;

import java.util.Arrays;
import java.util.Random;

public class Message {
    private Random rnd = new Random();
    private String [] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
            "Best product of its category.", "Exceptional product.", "I can’t live without this product."};

    private String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
            "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};

    private String [] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
    private String [] city = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};



    public String randomMessage() {
        return String.format("%s %s %s - %s",
                phrases[rnd.nextInt(phrases.length)],
                events[rnd.nextInt(events.length)],
                authors[rnd.nextInt(authors.length)],
                city[rnd.nextInt(city.length)]);
    }
}
