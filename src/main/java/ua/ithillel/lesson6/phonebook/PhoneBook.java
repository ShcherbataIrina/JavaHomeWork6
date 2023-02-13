package ua.ithillel.lesson6.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<PhoneBookRecord> records = new ArrayList<>();

    public void add(PhoneBookRecord newRecord) {

        records.add(newRecord);

    }

    public PhoneBookRecord find(String name) {
        for (PhoneBookRecord record : records) {
            if (name.equals(record.getName())) {
                return record;
            }
        }
        return null;

    }

    public List<PhoneBookRecord> findAll(String name) {
        var result = new ArrayList<PhoneBookRecord>();


        for (PhoneBookRecord record : records) {
            if (name.equals(record.getName())) {
                result.add(record);
            }

        }
        return result;

    }

    public List<PhoneBookRecord> getAll() {
        records.forEach(System.out::println);
        return records;
    }


}
