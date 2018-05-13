import java.util.ArrayList;
import java.util.List;

class Permutations {

    List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> combinations = new ArrayList<>();

        for (int n : nums) {
            ArrayList<Integer> l = new ArrayList<>();
            l.add(n);
            getUniqueCombinations(l, nums, combinations);
        }
        return combinations;
    }

    private void getUniqueCombinations(ArrayList<Integer> l, int[] nums, List<List<Integer>> combinations) {
        if (l.size() == nums.length) {
            combinations.add(l);
            return;
        }

        for (Integer n : nums) {
            if (!l.contains(n)) {
                ArrayList<Integer> newList = new ArrayList<>(l);
                newList.add(n);
                getUniqueCombinations(newList, nums, combinations);
            }
        }
    }
}
