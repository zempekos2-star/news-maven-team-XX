package gr.aegean.icsd.news;

import java.util.List;

// Μικρό μοντέλο ανάγνωσης ειδήσεων για το συγκεκριμένο workshop.
public class News {
    private final int id;
    private final String title;
    private final String content;
    private final List<Category> categories;
    private final NewsStatus status;

    public News(int id, String title, String content,
                List<Category> categories, NewsStatus status) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.categories = List.copyOf(categories);
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public NewsStatus getStatus() {
        return status;
    }
}
