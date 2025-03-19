import java.util.List;

public class ListContains {
    public static boolean containsValue(List<Integer> list, Integer value) {
        if (list.contains(value)) {
            return true;
        }
        return false;
    }
}