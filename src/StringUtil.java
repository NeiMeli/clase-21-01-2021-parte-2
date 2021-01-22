import java.util.*;

public class StringUtil {

    public static String[] mapToStringArray(Map<Integer, List<String>> stringArrayByIntMap) {
        return stringArrayByIntMap.values().stream().flatMap(Collection::stream).toArray(String[]::new);
    }

    public static Map<Integer, List<String>> toStringArrayByDigitMap(String[] arr, int digitIndex) {
        final Map<Integer, List<String>> stringArrayByDigitMap = new TreeMap<>(Comparator.comparingInt(i -> i));
        for (String s : arr) {
            final int digit = Character.getNumericValue(s.charAt(digitIndex));
            stringArrayByDigitMap.computeIfAbsent(digit, (list) ->  new ArrayList<>()).add(s);
        }
        return stringArrayByDigitMap;
    }

    public static String[] toSortedByLengthStringArray(int [] arr) {
        return Arrays.stream(arr).mapToObj(Integer::toString).sorted().toArray(String[]::new);
    }

    public static String[] fill(String[] unfilledStrings, int finalLength) {
        return Arrays.stream(unfilledStrings).map(s -> {
            while (s.length() < finalLength) {
                s = "0" + s;
            }
            return s;
        }).toArray(String[]::new);
    }
}
