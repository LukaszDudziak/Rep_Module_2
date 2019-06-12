package d1_home;

public class Author extends Person {

    private String pseudonym;



    public Author(int id, String firstName, String lastName, String pseudonym) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pseudonym = pseudonym;
    }
}

