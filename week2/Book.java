package week2;

/**
 * Book.java - Assignment 01
 * 
 * @author Mahmoud Yousif
 */

enum BookMedium {
    AudioBook,
    PhysicalBook,
    EBook,
}

enum BookGenre {
    Fiction,
    NoneFiction,
}

enum BookRating {
    Rating1, Rating2, Rating3, Rating4, Rating5
}

class Book {
    // fields are private
    private String title;
    private String author;
    private BookGenre genre;
    private int publishedDate;
    private int readDate;
    private BookMedium medium;
    private BookRating rating;

    /**
     * Default constructor takes title, author, and genre
     */
    public Book(String title, String author, BookGenre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    /**
     * Constructor with title, author, genre, and published date
     */
    public Book(String title, String author, BookGenre genre, int publishedDate) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publishedDate = publishedDate;
    }

    /**
     * Constructor with all fields
     */
    public Book(String title, String author, BookGenre genre, int publishedDate,int readDate, BookMedium medium, BookRating rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publishedDate = publishedDate;
        this.readDate = readDate;
        this.medium = medium;
        this.rating = rating;
    }

    // getters

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public BookGenre getGenre() {
        return genre;
    }

    public int getPublishedDate() {

        return publishedDate;
    }

    public int getReadDate() {

        return readDate;
    }

    public BookMedium getMedium() {

        return medium;
    }

    public BookRating getRating() {

        return rating;
    }

    // setters
    public String toString() {
        String output = title + " by " + author;
        if (publishedDate != 0) {
            output += " (" + publishedDate + ")";
        }
        if (readDate != 0 && medium != null && rating != null) {
            output += " - read in " + readDate + ", rated " + rating.toString().substring(6) + "/5";
        }
        return output;
    }

    /**
     * toString implementation
     * Depends on available information
     * For title, an author, and a genre - Title by Author
     * If publication date is present - Title by Author (Year of Publication)
     * If read date, read medium, and rating is present -
     * Title by Author (Year of Publication) - read in Year of Reading, rated
     * rating/5
     */

    public static void main(String[] args) {
        Book b1 = new Book("Children of Time", "Adrian Tchaikovsky", BookGenre.Fiction);
        System.out.println(b1);
        Book b2 = new Book("The Fifth Season", "N. K. Jemesin", BookGenre.Fiction, 2015);
        System.out.println(b2);
        Book b3 = new Book("Perdido Street Station", "China Mieville", BookGenre.Fiction, 2000, 2020, BookMedium.EBook,
                BookRating.Rating5);
        System.out.println(b3);

        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getGenre());
        System.out.println(b2.getPublishedDate());
        System.out.println(b3.getReadDate());
        System.out.println(b3.getMedium());
        System.out.println(b3.getRating());
    }
}
