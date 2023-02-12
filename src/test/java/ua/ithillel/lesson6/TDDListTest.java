package ua.ithillel.lesson6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static ua.ithillel.lesson6.TDDList.findOccurance;
import static ua.ithillel.lesson6.TDDList.toList;

class TDDListTest {
    @Test
    void shouldCountOccurance() {
        List<String> list = new ArrayList<>();

        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element4");
        list.add("element5");
        list.add("element6");
        list.add("element1");
        list.add("element1");
        list.add("element1");
        list.add("element5");
        list.add("element5");
        list.add("element6");
        list.add("element6");
        list.add("element6");
        list.add("element6");
        assertEquals(TDDList.countOccurance(list, "element1"), 4);
        assertEquals(TDDList.countOccurance(list, "element2"), 1);
        assertEquals(TDDList.countOccurance(list, "element5"), 3);
        assertEquals(TDDList.countOccurance(list, "element6"), 5);
    }

    @Test
    void shouldToList1() {
        assertEquals(toList(new int[]{1, 2, 3, 4, 5}), List.of(1, 2, 3, 4, 5));

    }

    @Test
    void shouldToList2() {
        assertEquals(toList(new int[]{-11, 22, -93, 48, 50}), List.of(-11, 22, -93, 48, 50));

    }

    @Test
    void shouldFindUnique() {
        List<Integer> list = List.of(
                1, 2, 3, 4, 5, 6, 7, 8, 9,
                1, 2, 3, 4, 5, 6, 7, 8, 9);

        assertEquals(TDDList.findUnique(list), List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));

    }
    @Test
    void shouldCalcOccurrence() {
        List<String> list = new ArrayList<>();

        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element4");
        list.add("element4");
        list.add("element5");
        list.add("element6");
        list.add("element1");
        list.add("element1");
        list.add("element1");
        list.add("element5");
        list.add("element5");
        list.add("element6");
        list.add("element6");
        list.add("element6");
        list.add("element6");

        String countEachElementInList = "element1 = 4" + " element2 = 1" + " element3 = 1" + " element4 = 2" + " element5 = 3" + " element6 = 5 ";
        assertEquals(TDDList.calcOccurance(list), countEachElementInList);

    }


    @Test
    void shouldfindOccurance1() {
        List<String> list = new ArrayList<>();
        list.add("mountain");

        assertEquals(findOccurance(list), List.of(new Result("mountain", 1)));

    }

    @Test
    void shouldfindOccurance2() {
        List<String> list = new ArrayList<>();

        list.add("house");
        list.add("river");
        list.add("mountain");
        list.add("ice");
        list.add("flower");
        list.add("house");
        list.add("mountain");
        list.add("house");
        list.add("river");
        list.add("ice");
        list.add("house");
        list.add("mountain");
        list.add("flower");
        list.add("ice");
        list.add("mountain");

        var result = new ArrayList<Result>();

        result.add(new Result("house", 4));
        result.add(new Result("river", 2));
        result.add(new Result("mountain", 4));
        result.add(new Result("ice", 3));
        result.add(new Result("flower", 2));


        assertTrue(findOccurance(list).size() == result.size() && findOccurance(list).containsAll(result) && result.containsAll(findOccurance(list)));
        assertEquals(findOccurance(list), result);

    }

}