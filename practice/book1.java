package practice;
import java.util.*;

enum BookMedium{
    PhysicalBook, AudioBook, EBook
}

enum BookGenre{
    Fiction, NonFiction
}

enum BookRating{
    Rating1, Rating2, Rating3, Rating4, Rating5
}

class book1{

    private String title;
    private String author;
    private int publishedDate;
    private int readDate;
    private BookMedium medium;
    private BookGenre genre;
    private BookRating ratings;


    public book1(String title, String author, BookGenre genre){

        this.title = title;
        this.author = author;
        this.genre = genre;
    }


    public book1(String title, String author, BookGenre genre, int publishedDate){

        this.title = title;
        this.genre = genre;
        this.author = author;
        this.publishedDate = publishedDate;
    }


    public book1(String title, String author, BookGenre genre, int publishedDate, int readDate, BookMedium medium, BookRating ratings){

        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publishedDate = publishedDate;
        this.readDate = readDate;
        this.medium = medium;
        this.ratings = ratings;
    }


    // Getters

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPublishedDate(){
        return publishedDate;
    }

    public int getReadDate(){
        return readDate;
    }

    public BookMedium getMedium(){
        return medium;
    }

    public BookGenre getGenre(){
        return genre;
    }

    public BookRating getRating(){
        return ratings;
    }


    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPublishedDate(int publishedDate){
        this.publishedDate = publishedDate;
    }

    public void setReadDate(int readDate){
        this.readDate = readDate;
    }

    public void setMedium(BookMedium medium){
        this.medium = medium;
    }

    public void setGenre(BookGenre genre){
        this.genre = genre;
    }

    public void setRating(BookRating ratings){
        this.ratings = ratings;
    }


    public String toString(){

        String output = title + " by " + author;
        if(publishedDate != 0){
            output += " (" + publishedDate + ")";
        }
        if(readDate != 0 && medium != null && ratings != null){
            output += " - read in " + readDate + ", " + ratings +"/5";
        }

        return output;
    }

    public static void main(String[] args){

        book1 b1 = new book1("Children of Time", "Adrian Tchaikovsky", BookGenre.Fiction);
        System.out.println(b1);
        
        book1 b2 = new book1("The Fifth Season", "N. K. Jemesin", BookGenre.Fiction, 2015);
        System.out.println(b2);

        book1 b3 = new book1("Perdido Street Station", "China Mieville",
        BookGenre.Fiction, 2000, 2020, BookMedium.EBook, BookRating.Rating5);
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