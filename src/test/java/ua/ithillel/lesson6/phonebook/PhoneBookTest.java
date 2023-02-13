package ua.ithillel.lesson6.phonebook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhoneBookTest {

    private PhoneBook phoneBook;

    @BeforeEach
    void setup() {
        phoneBook = new PhoneBook();
    }

    @Test
    void shouldAddRecord() {
        var allen = new PhoneBookRecord("Allen", "0693789548");
        phoneBook.add(allen);

        assertEquals(phoneBook.getAll(), List.of(new PhoneBookRecord("Allen", "0693789548")) );

    }

    @Test
    void shouldFind() {
        var allen = new PhoneBookRecord("Allen", "0693789548");
        var ivan = new PhoneBookRecord("Ivan", "0669587431");
        var olena = new PhoneBookRecord("Olena", "0978543621");
        var sveta = new PhoneBookRecord("Sveta", "0996748459");

        phoneBook.add(allen);
        phoneBook.add(ivan);
        phoneBook.add(olena);
        phoneBook.add(sveta);


        assertEquals(phoneBook.find("Allen"), new PhoneBookRecord("Allen", "0693789548"));
    }

    @Test
    void shouldFindAll() {
        var allen = new PhoneBookRecord("Allen", "0693789548");
        var ivan1 = new PhoneBookRecord("Ivan", "06598718324");
        var ivan2 = new PhoneBookRecord("Ivan", "0669587431");
        var olena = new PhoneBookRecord("Olena", "0978543621");
        var sveta = new PhoneBookRecord("Sveta", "0996748459");

        phoneBook.add(allen);
        phoneBook.add(ivan1);
        phoneBook.add(ivan2);
        phoneBook.add(olena);
        phoneBook.add(sveta);

        List<PhoneBookRecord> expected = new ArrayList<>();
        expected.add(ivan1);
        expected.add(ivan2);

        assertEquals(phoneBook.findAll("Ivan"), expected);
    }
}
