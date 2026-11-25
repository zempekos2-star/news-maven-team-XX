package gr.aegean.icsd.news;

import java.util.List;

// Τα αναγνωριστικά είναι σταθερά για να ελέγχουμε εύκολα τα αποτελέσματα.
public class SampleData {
    public static List<News> createNews() {
        return List.of(
            new News(101, "New technology lab in Samos",
                "A new laboratory supports student projects.",
                List.of(Category.TECHNOLOGY, Category.SCIENCE), NewsStatus.PUBLISHED),
            new News(102, "Technology proposal for Samos schools",
                "A draft proposal awaiting completion.",
                List.of(Category.TECHNOLOGY), NewsStatus.DRAFT),
            new News(103, "Cultural events in Samos",
                "Local cultural events for the coming weekend.",
                List.of(Category.CULTURE), NewsStatus.PUBLISHED),
            new News(104, "Environmental research in the Aegean",
                "A research report awaiting editorial review.",
                List.of(Category.SCIENCE, Category.ENVIRONMENT), NewsStatus.UNDER_REVIEW),
            new News(105, "Technology conference in Athens",
                "A conference on software and digital services.",
                List.of(Category.TECHNOLOGY, Category.SCIENCE), NewsStatus.PUBLISHED)
        );
    }
}
