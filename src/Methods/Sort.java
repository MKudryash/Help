package Methods;

import Models.Students;

import java.util.ArrayList;

public class Sort {
    public static void sortByName(ArrayList<Students> list) {
        list.sort((o1, o2)
                -> o1.getName().compareTo(
                o2.getSurname()));
    }
    public static void sortByMark(ArrayList<Students> list) {
        list.sort((o1, o2)
                -> o1.getMark());
    }
}
