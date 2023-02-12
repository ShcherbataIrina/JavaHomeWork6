package ua.ithillel.lesson6.phonebook;

import java.util.Objects;

public class PhoneBookRecord {
    private String name;
    private String phone;

    public PhoneBookRecord(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public  void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBookRecord that = (PhoneBookRecord) o;
        return name.equals(that.name) && phone.equals(that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }
}