import java.util.*;

public class MergeNames {


    public static Object[] checked(String[] n1, String[] n2) {

        Map<String, Integer> namesN1N2 = new HashMap<>();

//        for (String s : n1) {
//            namesN1N2.put(s, 1);
//        }
        Arrays.asList(n1).stream().forEach(n->namesN1N2.put(n, 1));

        for (String s : n2) {
            Set<String> names = namesN1N2.keySet();
            if (names.contains(s)) {
                int counter = namesN1N2.get(s);
                namesN1N2.put(s, counter + 1);
            } else {
                namesN1N2.put(s, 1);
            }
        }

        List<String> commonNames = new ArrayList<>();

        namesN1N2.keySet().stream().filter(n->namesN1N2.get(n) > 1).forEach(n->commonNames.add(n));

//        for (String s : namesN1N2.keySet()) {
//            if (namesN1N2.get(s) > 1) {
//                commonNames.add(s);
//            }
//        }

        return commonNames.toArray();
    }


}





