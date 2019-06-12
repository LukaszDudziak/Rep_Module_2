package d1_home;

import java.util.List;

public class Book {
    private int id;
    private String title;
    private boolean available = true;
    private Author author;
    private List<Author> authors;
    private User currentUser;

    public Book() {
    }

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book(int id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book(int id, String title, Author author, List<Author> authors) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.authors = authors;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
        currentUser.addBook(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", available=" + available +
                ", author=" + author +
                ", authors=" + authors +
                ", currentUser=" + currentUser +
                '}';
    }
}
