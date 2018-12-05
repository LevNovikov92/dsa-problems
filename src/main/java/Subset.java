import java.util.*;

public class Subset {

    public List<List<Integer>> subsets(int[] nums) {
        final Set<SortedSet<Integer>> results = new HashSet<>();
        results.add(new TreeSet<>());
        for (int i = 0; i < nums.length; i++) {
            subsets(nums, i, new TreeSet<>(), results);
        }

        final List<List<Integer>> listResults = new ArrayList<>();
        for (Set<Integer> s : results) {
            listResults.add(new ArrayList<>(s));
        }
        return listResults;
    }

    private void subsets(int[] nums, int index, SortedSet<Integer> set, Set<SortedSet<Integer>> results) {
        final SortedSet<Integer> newSet = new TreeSet<>(set);
        newSet.add(nums[index]);
        results.add(newSet);
        for (int i = index + 1; i < nums.length; i++) {
            subsets(nums, i, newSet, results);
        }
    }
}
