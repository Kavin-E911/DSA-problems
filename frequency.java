/*You are given  queries. Each query is of the form two integers described below:
1  : Insert x in your data structure.
2  : Delete one occurence of y from your data structure, if present.
3  : Check if any integer is present whose frequency is exactly . If yes, print 1 else 0.

The queries are given in the form of a 2-D array  of size  where  contains the operation, and  contains the data element.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class frequency {
    static List<Integer> freqQuery(List<List<Integer>> queries) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (List<Integer> query : queries) {

            int type = query.get(0);
            int value = query.get(1);

            if (type == 1) {
                // Insert
                map.put(value, map.getOrDefault(value, 0) + 1);

            } else if (type == 2) {
                // Delete one occurrence
                if (map.containsKey(value)) {
                    map.put(value, map.get(value) - 1);
                    if (map.get(value) == 0) {
                        map.remove(value);
                    }
                }

            } else if (type == 3) {
                // Check frequency
                boolean found = false;
                for (int freq : map.values()) {
                    if (freq == value) {
                        found = true;
                        break;
                    }
                }
                result.add(found ? 1 : 0);
            }
        }
        return result;
    }

    // Optional main method for local testing
    public static void main(String[] args) {

        List<List<Integer>> queries = Arrays.asList(
            Arrays.asList(1, 5),
            Arrays.asList(1, 6),
            Arrays.asList(3, 2),
            Arrays.asList(1, 10),
            Arrays.asList(1, 10),
            Arrays.asList(1, 6),
            Arrays.asList(2, 5),
            Arrays.asList(3, 2)
        );

        System.out.println(freqQuery(queries)); // Output: [0, 1]
    }
    
}
