package d1_home;

import javax.jws.soap.SOAPBinding;

public class Main {
    public static void main(String[] args) {

      /*  BankAccount bankAccount = new BankAccount(1);
        System.out.println(bankAccount.getCash());
        bankAccount.depositCash(100);
        System.out.println(bankAccount.getCash());
        bankAccount.withdrawCash(40);
        System.out.println(bankAccount.getCash());
        System.out.println(bankAccount.toString()); //1st

*/
        Book book = new Book(1,"Co tam");
        System.out.println(book.toString());
        User user = new User(1,"Lu","Pu");
        user.addBook(book);
        System.out.println(user.getBooks().toString());
        System.out.println(book.getCurrentUser());
        System.out.println(book.isAvailable());

    }
}
