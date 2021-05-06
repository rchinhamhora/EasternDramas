package dmacc.drama.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Rumbi
 * Date: 4/30/21
 * Time: 7:22 AM
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Drama extends Node implements Comparable<Drama> {
    private static int nextId = 1;
    private int dramaId;
    private String dramaTitle;
    private int numOfReviews;
    private double revStars;
    private int releaseYear;
    private String country;
    private String language;
    private String subtitles;
    private String genre;
    private String rating;

    public Drama(String dramaTitle, int numOfReviews, double revStars, int releaseYear,
                 String subtitles, String language, String country, String genre, String rating) {
        super(AttrType.DRAMA);
        this.dramaId = nextId++;
        this.dramaTitle = dramaTitle;
        this.numOfReviews = numOfReviews;
        this.revStars = revStars;
        this.releaseYear = releaseYear;
        this.subtitles = subtitles;
        this.language = language;
        this.country = country;
        this.genre = genre;
        this.rating = rating;
    }

    public static void sort(Drama[] array) {
        int n = array.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Drama key = array[i];
                int j = i;
                while (j >= gap && array[j - gap].compareTo(key) > 0) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = key;
            }
        }
    }

    @Override
    public int compareTo(Drama o) {
        return this.dramaTitle.compareTo(o.dramaTitle);
    }
}
