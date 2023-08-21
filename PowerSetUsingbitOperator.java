import java.util.ArrayList;
import java.util.List;

public class PowerSetUsingbitOperator {
    public static void main(String[] args) {
        int[] set = {1, 2, 3};
        generatePowerSet(set);
    }

    public static void generatePowerSet(int[] set) {
        int n = set.length;
        int powerSetSize = (int) Math.pow(2, n);

        for (int i = 0; i < powerSetSize; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subset.add(set[j]);
                }
            }
            System.out.println(subset);
        }
    }
}
