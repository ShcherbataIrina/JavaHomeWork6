package ua.ithillel.lesson6;

import java.util.Objects;

public class Result {
    private  String name;
    private  int occurrence;

    public Result(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }


    public String getName() {
        return name;
    }

    public int getOccurrence() {
        return occurrence;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setOccurrence(int occurrence) {
        this.occurrence = occurrence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return occurrence == result.occurrence && name.equals(result.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, occurrence);
    }
}
