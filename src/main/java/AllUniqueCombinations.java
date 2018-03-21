import java.util.ArrayList;
import java.util.List;

public class AllUniqueCombinations {

    List<String> allCombinations(int[] arr) {
        List<String> combinations = new ArrayList<>();
        calculate("", arr, 0, combinations);
        return combinations;
    }

    private void calculate(String str, int[] arr, int index, List<String> combinations) {
        if (str.length() == arr.length) {
            combinations.add(str);
            return;
        }

        for (int i : arr) {
            String ch = String.valueOf(i);
            if (!str.contains(ch)) {
                calculate(str + ch, arr, index + 1, combinations);
            }
        }
    }
}
