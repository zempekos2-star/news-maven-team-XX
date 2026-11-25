package gr.aegean.icsd.news;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class NewsService {
    private final List<News> news;

    public NewsService(List<News> news) {
        this.news = new ArrayList<>(news);
    }

    // Έτοιμο παράδειγμα: φιλτράρισμα με βάση την κατάσταση.
    public List<News> getPublishedNews() {
        List<News> results = new ArrayList<>();
        for (News item : news) {
            if (item.getStatus() == NewsStatus.PUBLISHED) {
                results.add(item);
            }
        }
        return results;
    }

    public List<News> searchPublishedByTitle(String keyword) {
        List<News> results = new ArrayList<>();

        // Για κενή ή null αναζήτηση επιστρέφουμε κενή λίστα.
        if (keyword == null || keyword.isBlank()) {
            return results;
        }
        String normalizedKeyword = keyword.trim().toLowerCase(Locale.ROOT);

        // TODO: διατρέξτε τις ειδήσεις με έναν απλό βρόχο for.
        // Προσθέστε στη results μόνο όσες είναι PUBLISHED και ο τίτλος τους,
        // σε πεζά, περιέχει το normalizedKeyword.
        // Χρησιμοποιήστε ως παράδειγμα τη getPublishedNews().

        return results;
    }
}
