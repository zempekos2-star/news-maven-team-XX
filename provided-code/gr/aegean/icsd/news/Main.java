package gr.aegean.icsd.news;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        // Βήμα 3: Αφαιρέστε το σχόλιο στην επόμενη γραμμή για ανάγνωση του resource.
        // System.out.println("APP_NAME=" + readAppName());

        NewsService service = new NewsService(SampleData.createNews());

        // Πρώτη εκτέλεση πριν από την προσθήκη της βιβλιοθήκης JSON.
        System.out.println("Published news:");
        for (News item : service.getPublishedNews()) {
            System.out.println(item.getId() + " - " + item.getTitle());
        }

        // Βήμα 5: αντικαταστήστε την παραπάνω εμφάνιση με την έκδοση JSON.
        // Βήμα 6: προσθέστε τα σενάρια αναζήτησης που δίνονται στον οδηγό.
    }

    // Έτοιμη ανάγνωση ρυθμίσεων από resource του classpath.
    private static String readAppName() {
        Properties settings = new Properties();
        try (InputStream input = Main.class.getResourceAsStream("/workshop.properties")) {
            if (input == null) {
                throw new IllegalStateException("Resource not found: /workshop.properties");
            }
            settings.load(new InputStreamReader(input, StandardCharsets.UTF_8));
        } catch (IOException error) {
            throw new IllegalStateException("Cannot read resource: /workshop.properties", error);
        }
        String appName = settings.getProperty("app.name");
        if (appName == null || appName.isBlank()) {
            throw new IllegalStateException("Missing property: app.name");
        }
        return appName;
    }
}
