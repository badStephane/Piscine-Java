public class StringContains {
    public static boolean isStringContainedIn(String subString, String s) {
        if (subString == null || s == null) {
            return false;
        }
        if (s.contains(subString)) {
            return true;
        } else {
            return false;
        }
    }
}

// public class StringContains {
//     public static boolean isStringContainedIn(String subString, String s) {
//         if (subString == null || s == null) {
//             return false;
//         }
//         return s.contains(subString);
//     }
// }

