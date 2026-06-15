import java.util.*;
import java.util.stream.*;

class Book {
    private int     id;
    private String  title;
    private String  author;
    private String  genre;
    private boolean available;

    Book(int id, String title, String author, String genre) {
        this.id        = id;
        this.title     = title;
        this.author    = author;
        this.genre     = genre;
        this.available = true;
    }

    public int getId(){
        return id; 
    }
    public String getTitle(){
        return title; 
    }
    public String getAuthor(){
        return author; 
    }
    public String getGenre(){
        return genre; 
    }
    public boolean isAvailable(){
        return available; 
    }
    public void setAvailable(boolean a){
        available = a; 
    }

    public String toString() {
        return String.format("%-4d %-25s %-20s %-12s [%s]", id, title, author, genre, available ? "Available" : "Issued");
    }
}