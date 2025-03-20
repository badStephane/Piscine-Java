import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        if(list == null) {
            return null;
        }
        List<Integer> newList = new ArrayList<>(list);
        newList.sort(Comparator.naturalOrder());
        return newList;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        if(list == null) {
            return null;
        }
        List<Integer> newList = new ArrayList<>(list);
        newList.sort(Comparator.naturalOrder());
        Collections.reverse(newList);
        return newList;
    }
}
