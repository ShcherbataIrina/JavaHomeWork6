package ua.ithillel.lesson6.phonebook;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PhoneBookTest {
    private List<PhoneBookRecord> record = new ArrayList<>();

    @Test
    void shouldAddRecord() {
        var allen = new PhoneBookRecord("Allen", "0693789548");


        assertArrayEquals(record.add(allen), new PhoneBookRecord("Allen", "0693789548"));

    }

    @Test
    void shouldFind() {
        var allen = new PhoneBookRecord("Allen", "0693789548");
        var ivan = new PhoneBookRecord("Ivan", "0669587431");
        var olena = new PhoneBookRecord("Olena", "0978543621");
        var sveta = new PhoneBookRecord("Sveta", "0996748459");

        record.add(allen);
        record.add(ivan);
        record.add(olena);
        record.add(sveta);


        assertArrayEquals(record.find(record,"Allen"), new PhoneBookRecord("Allen", "0693789548"));
    }

    @Test
    void shouldFind() {
        var allen = new PhoneBookRecord("Allen", "0693789548");
        var ivan1 = new PhoneBookRecord("Ivan", "06598718324");
        var ivan2 = new PhoneBookRecord("Ivan", "0669587431");
        var olena = new PhoneBookRecord("Olena", "0978543621");
        var sveta = new PhoneBookRecord("Sveta", "0996748459");

        record.add(allen);
        record.add(ivan1);
        record.add(ivan2);
        record.add(olena);
        record.add(sveta);

        List<PhoneBookRecord> result = new ArrayList<>();
        result.add(ivan1);
        result.add(ivan2);

        assertArrayEquals(record.findAll(record,"Ivan"), result);
    }
}